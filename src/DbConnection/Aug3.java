package DbConnection;

import java.sql.*;

public class Aug3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // driver registration

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","root");//db physical connection

        ////*********maxSalary****4
//        CallableStatement cs=connection.prepareCall("{call maxSalary()}");
//        cs.execute();
//
//        ResultSet rs=cs.getResultSet();
//        while (rs.next()){
//            System.out.println(rs.getInt(1));
//
//        }

        Statement statement=connection.createStatement();
        //********select emp*********1

//        ResultSet rs=statement.executeQuery("select avg(salary) from Employee;");
//        while (rs.next()){
//            System.out.println("maximum salary= "+rs.getInt(1));
//        }

        //********select emp with conditions*********3

//        ResultSet rs=statement.executeQuery("select * from Employee where salary>100000 and gender='male';");
//        while (rs.next()){
//            System.out.println(+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//        }

        //********select product asc order*********2

//        ResultSet rs=statement.executeQuery("select * from Product order by name;");
//        while (rs.next()){
//            System.out.println(+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//        }

        //********update*******5

        statement.executeUpdate("update Product set price=500 where idProduct=101;");
        ResultSet rs=statement.executeQuery("select * from Product ");
        while (rs.next()){
            System.out.println(+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }

    }
}
