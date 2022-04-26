package Singleton;
import java.sql.*;

public class SingletonCrateConn  {

    private static  SingletonCrateConn DB_INSTANCE;
    private static String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/Book_PHW";
    private static String USERNAME = "root";
    private static String PASSWORD = "Tiko0330";

    public static SingletonCrateConn getDbInstance() {
        if (DB_INSTANCE==null){
            DB_INSTANCE= new SingletonCrateConn();
        }
        return DB_INSTANCE;
    }

    public Connection createConnection(){
        try {
            Class.forName(DRIVER_URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        }
        try {
            return DriverManager.getConnection(DATABASE_URL,
                    USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            System.out.println("Can't get connection, " +
                    "credentials are probably wrong");
        }
        return null;
    }






}
