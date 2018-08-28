package DbConnection;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // driver registration

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");//db physical connection
        Statement statement=connection.createStatement();
        //statement.executeUpdate("insert into student values(1,'anupama')");//for insert and update queries

        //statement.executeUpdate("update student set name='new' where id='5';");//for insert and update queries

        //statement.executeUpdate("DELETE FROM student WHERE id = '1'");

        //PreparedStatement for parametrarised
//        PreparedStatement ps=connection.prepareStatement("insert into student values(?,?)");
//        ps.setInt(1,20);
//        ps.setString(2,"suhail");
//        ps.executeUpdate();
//        //ps.setString(3,"ragesh");
//        ResultSet rs=statement.executeQuery("select * from student");
//        while (rs.next()){
//            System.out.println(rs.getInt(1)+" "+ rs.getString("name")); // or rs.getInt("id")
//            //System.out.println(rs.getString(1)); // or rs.getInt("id")
//        }


        PreparedStatement ps1=connection.prepareStatement("select * from student where id=?");
        ps1.setInt(1,2);
        ResultSet rs1=ps1.executeQuery();
        if(rs1.next()){
            System.out.println(rs1.getString(1)+" "+rs1.getString(2));
        }
        connection.close();
    }

}