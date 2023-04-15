package org.example.app.repositories;

import jakarta.persistence.Query;
import org.example.app.entities.User;
import org.example.app.utils.Constants;
import org.example.app.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserCreateRepository {

    @SuppressWarnings("deprecation")
    public String createUser(User user) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "INSERT INTO User (login, pass, email) " +
                    "VALUES (:login, :pass, :email)";

            Query query = session.createQuery(hql);
            query.setParameter("login", user.getLogin());
            query.setParameter("pass", user.getPass());
            query.setParameter("email", user.getEmail());
            query.executeUpdate();

            transaction.commit();
            return Constants.DATA_INSERT_MSG;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return e.getMessage();
        }
    }
}

