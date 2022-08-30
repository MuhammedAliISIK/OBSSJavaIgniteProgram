package tr.com.obss.jip;

import java.sql.*;

public class main
{
    public static void main(String[] args) throws SQLException {
        SQLop db1 = new SQLop();
        db1.connectDB();

//        db1.updateData("Veli",1);
//        db1.deleteData(2,"12345");
//        db1.insertData(5,"1111","Cem",16);
//        db1.findYounger(25);
        db1.printData();
    }


}
