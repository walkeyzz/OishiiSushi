//package Sushi.test;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///**
// *
// * @author kjoce
// */
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import Sushi.DatabaseConnection;
//
//public class Main {
//    public static void main(String[] args) {
//        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
//
//        try {
//            // Insert operation
//            String insertQuery = "INSERT INTO strukhistory (struk) VALUES (+total+)";
//            dbConnection.insert(insertQuery);
//
//
//            // Select operation
//            String selectQuery = "SELECT * FROM strukhistory";
//            ResultSet resultSet = dbConnection.select(selectQuery);
//            while (resultSet.next()) {
//                // Process each row of the result set
//                // Example: String value = resultSet.getString("column_name");
//                // Example: int value = resultSet.getInt("column_name");
//            }
//            resultSet.close();
//
//            // Delete operation
//            String deleteQuery = "DELETE FROM mytable WHERE id = 1";
//            dbConnection.delete(deleteQuery);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                dbConnection.closeConnection();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}