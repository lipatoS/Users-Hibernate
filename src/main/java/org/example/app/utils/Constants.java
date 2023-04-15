package org.example.app.utils;

import org.example.app.database.PassReader;

public class Constants {
    public final static String PATH_CREDS = "credentials/";
    public final static String DB_JDBC = "jdbc:mysql://www.db4free.net:3306/";
    public final static String DB_NAME = "users_hibernate";
    public final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://www.db4free.net:3306/users_hibernate?";
    public final static String DB_USER = "dev_adm_2";
    public final static String DB_PASS = PassReader.readPass();
    public final static String TABLE_CONTACTS = "users";
    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "Wrong email.";
    public final static String DATA_ABSENT_MSG = "\n>> No data!";
    public final static String DATA_INSERT_MSG = "\n>> Created.";
    public final static String DATA_UPDATE_MSG = "\n>> Updated.";
    public final static String DATA_DELETE_MSG = "\n>> Deleted.";
    public final static String APP_CLOSE_MSG = "\n>> App closed.";
    public final static String INPUT_REQ_MSG = "Input required.";
    public final static String INCORRECT_VALUE_MSG = ">> Incorrect value! Try again.";
    public final static String ID_NO_EXISTS_MSG = "There is no such ID.";
}

