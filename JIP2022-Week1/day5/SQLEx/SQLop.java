package tr.com.obss.jip;

import java.sql.*;

public class SQLop {
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    public Connection connectDB() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jip-db","root","1234");
        return conn;
    }

    public void updateData(String newName, int checkId) throws SQLException {
        st = conn.createStatement();
        int rowCount = st.executeUpdate("UPDATE userdata SET name='"+newName+"' WHERE id = '"+checkId+"'");
        System.out.println("Number of affected rows: "+rowCount);
    }

    public void deleteData(int checkId, String checkPass) throws SQLException {
        st = conn.createStatement();
        int rowCount = st.executeUpdate("DELETE FROM userdata WHERE id = '"+checkId+"' AND password = '"+checkPass+"'");
        System.out.println("Number of deleted rows: "+rowCount);
    }

    public void insertData(int insertId, String insertPass, String insertName, int insertAge) throws SQLException {
        st = conn.createStatement();
        int rowCount = st.executeUpdate("INSERT INTO userdata VALUES ('"+insertId+"','"+insertPass+"','"+insertName+"','"+insertAge+"')");
        System.out.println("Number of inserted rows: "+rowCount);
    }

    public void findYounger(int refAge) throws SQLException {
        ps = conn.prepareStatement("SELECT * FROM userdata WHERE age < ?");
        ps.setInt(1,refAge);
        rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
        }
    }

    public void printData() throws SQLException {
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM userdata");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
        }
    }

}
