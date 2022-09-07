package RealEstate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.sql.rowset.CachedRowSet;

@ManagedBean(name = "bean")
@SessionScoped

public class database {

    private String nameSurname;
    private String password;
    private String userid;
    private String email;
    private String phonenumber;
    private String birthday;
    private String favhouseid;
    private String favuserid;

    DataSource dataSource;

    public database() {
        try {
            Context ctx = new InitialContext();

            dataSource = (DataSource) ctx.lookup("jdbc/sample");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public String getFavhouseid() {
        return favhouseid;
    }

    public void setFavhouseid(String favhouseid) {
        this.favhouseid = favhouseid;
    }

    public String getFavuserid() {
        return favuserid;
    }

    public void setFavuserid(String favuserid) {
        this.favuserid = favuserid;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String save() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();

        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {

            PreparedStatement object2
                    = connection.prepareStatement("INSERT INTO USERS "
                            + "(USER_NAME,PASSWORD,USER_ID,E_MAIL,PHONE_NUMBER,BIRTHDAY)"
                            + "VALUES ( ?, ?, ?, ?, ?, ? )");
            object2.setString(1, getNameSurname());
            object2.setString(2, getPassword());
            object2.setString(3, getUserid());
            object2.setString(4, getEmail());
            object2.setString(5, getPhonenumber());
            object2.setString(6, getBirthday());

            object2.executeUpdate();
            return "index";
        } finally {
            connection.close();
        }
    }

    public ResultSet checkInput() throws SQLException {
        System.out.println("deneme");
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();

        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {
            PreparedStatement object1 = connection.prepareStatement(
                    "SELECT *"
                    + "FROM USERS WHERE USER_ID = " + userid + "AND PASSWORD = " + password);
            CachedRowSet resultSet2 = new com.sun.rowset.CachedRowSetImpl();
            resultSet2.populate(object1.executeQuery());

            if (resultSet2 != null) {
                return resultSet2;
            } else {
                return null;
            }
        } finally {
            connection.close();
        }
    }

    public ResultSet info() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();
        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {
            PreparedStatement ps
                    = connection.prepareStatement("select *"
                            + " from USERS "
                            + "WHERE USER_ID = ? AND PASSWORD = ?");
            ps.setString(1, getUserid());
            ps.setString(2, getPassword());
            CachedRowSet resultSet2 = new com.sun.rowset.CachedRowSetImpl();
            resultSet2.populate(ps.executeQuery());
            return resultSet2;
        }
        finally {
            connection.close();
        } 
    }

    public ResultSet viewSale() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();
        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {
            PreparedStatement ps
                    = connection.prepareStatement("select h.*,u.PHONE_NUMBER,s.DESCRIPTION as house_status,t.DESCRIPTION as types from houses h left join status s on s.STATUS_ID=h.STATUS left join types t on t.TYPE_ID=h.HOUSE_TYPE left join users u on u.USER_ID=h.USER_ID where s.STATUS_ID='1'");
            CachedRowSet resultSet2 = new com.sun.rowset.CachedRowSetImpl();
            resultSet2.populate(ps.executeQuery());
            return resultSet2;
        } 
        finally {
            connection.close();
        }
    }

    public ResultSet viewRent() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();

        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {
            PreparedStatement ps
                    = connection.prepareStatement("select h.*,u.PHONE_NUMBER,s.DESCRIPTION as house_status,t.DESCRIPTION as types from houses h left join status s on s.STATUS_ID=h.STATUS left join types t on t.TYPE_ID=h.HOUSE_TYPE left join users u on u.USER_ID=h.USER_ID where s.STATUS_ID='2'");
            CachedRowSet resultSet2 = new com.sun.rowset.CachedRowSetImpl();
            resultSet2.populate(ps.executeQuery());
            return resultSet2;
        }
        finally {
            connection.close();
        }
    }

    public String addFav() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();

        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {

            PreparedStatement object2
                    = connection.prepareStatement("INSERT INTO FAV_LIST "
                            + "(USER_ID,HOUSE_ID)"
                            + "VALUES ( ?, ? )");

            object2.setString(1, getFavuserid());
            object2.setString(2, getFavhouseid());

            object2.executeUpdate();
            return "index";
        } finally {
            connection.close();
        }
    }

    public ResultSet viewFav() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("Unable to obtain DataSource");
        }

        Connection connection = dataSource.getConnection();

        if (connection == null) {
            throw new SQLException("Unable to connect to DataSource");
        }

        try {
            PreparedStatement ps
                    = connection.prepareStatement("select h.*,u.PHONE_NUMBER,s.DESCRIPTION as house_status,t.DESCRIPTION as types from houses h, users u, fav_list f, status s,types t where f.USER_ID=u.USER_ID and h.HOUSE_ID=f.HOUSE_ID and s.STATUS_ID=h.STATUS and t.TYPE_ID=h.HOUSE_TYPE and u.USER_ID=?");
            ps.setString(1, getUserid());
            CachedRowSet resultSet2 = new com.sun.rowset.CachedRowSetImpl();
            resultSet2.populate(ps.executeQuery());
            return resultSet2;
        } 
        finally {
            connection.close();
        }
    }

}
