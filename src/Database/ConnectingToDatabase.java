package Database;

import java.sql.*;

public class ConnectingToDatabase {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost;databaseName=sampleDB2";
        //url = "jdbc:sqlserver://localhost;databaseName=sampleDB2;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "root";

        try {
            //DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established!");

            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("Select * from sampleDb2..emp_system");
            System.out.println(resultSet);
        }
        catch (SQLException sqlException) {
            System.out.println("Error in connection!");
            sqlException.printStackTrace();
        }
    }
}
