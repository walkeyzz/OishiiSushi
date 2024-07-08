package Sushi;


import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://containers-us-west-142.railway.app:7179/railway";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "FDhS3z5BSHCCAmVUIwH2";
//
//    private static final String URL = "jdbc:mysql://localhost:3306/oishiisushidb";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "kikoozz456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}