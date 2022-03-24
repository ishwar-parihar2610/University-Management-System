package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/lucky_institute", "root", "ishw@1234");
            s =c.createStatement();

            ResultSet resultSet = s.executeQuery("select * from login");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("password"));
            }
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
