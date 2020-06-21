package ten;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
        String DBDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String connectionStr = "jdbc:odbc:PIMS";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Class.forName(DBDriver);     //加载驱动器
        con = DriverManager.getConnection(connectionStr, "Test", "1234");
        //连接数据库
        stmt = con.createStatement();   //创建Statement对象
        rs = stmt.executeQuery("Select * From Person");  //查询表
        while (rs.next()) {        //显示所有记录的ID和姓名
            System.out.print(rs.getInt("ID") + "  ");
            System.out.println(rs.getString("Name") + "  ");
        }
        ;
        stmt.executeUpdate("INSERT INTO Person VALUES(9, '林时', 3, 'accountant', 2000, 4)");  //添加一条记录
                System.out.println("添加数据后的信息为");
        rs = stmt.executeQuery("Select * From Person");  //查询表格
        while (rs.next()) {   //显示
            System.out.print(rs.getInt("ID") + "  ");
            System.out.println(rs.getString("Name") + "  ");
        }
        ;
        stmt.executeUpdate("DELETE FROM Person WHERE Name='林时'");
        System.out.println("删除数据后的信息为：");
        rs = stmt.executeQuery("Select * From Person"); //查询表格
        while (rs.next()) {          //显示
            System.out.print(rs.getInt("ID") + "  ");
            System.out.println(rs.getString("Name") + "  ");
        }
        ;
        stmt.close();    //关闭语句
        con.close();   //关闭连接
    }

}
