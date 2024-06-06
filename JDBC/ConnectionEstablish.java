import java.io.*;
import java.sql.*;
 
class ConnectionEstablish {
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/student"; // table details
        String username = "root"; // MySQL credentials
        String password = "12345";
        String query= "select *from students"; // query to be run
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); // Execute query
        rs.next();
        String name = rs.getString("name"); // Retrieve name from db
        System.out.println(name); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }