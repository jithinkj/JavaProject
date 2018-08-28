package DbConnection;

import java.sql.*;

public class Aug2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // driver registration

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");//db physical connection

//        CallableStatement cs=connection.prepareCall("{call getEmployee(?,?)}");
        CallableStatement cs=connection.prepareCall("{call getCount(?,?,?)}");
        cs.setInt(1,30000);
        cs.setString(2,"jithin");
        cs.registerOutParameter(3,Types.INTEGER);//for output variable
        cs.execute();
        //*****************to display full set****************************************
//        ResultSet rs=cs.getResultSet();
//        while (rs.next()){
//            System.out.println(rs.getInt(1)+" "+rs.getString("EmployeeName"));
//
//        }

        //***************to get and display output variable total****************************
        int x=cs.getInt(3);
        // or
        int y=cs.getInt("total");
        System.out.println(y);


        PreparedStatement ps1=connection.prepareStatement("select * from student where id=?");

    }
}
