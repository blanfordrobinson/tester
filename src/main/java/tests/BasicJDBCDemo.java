package tests;

import java.sql.*;

/**
 * Created by blanfordrobinson on 5/16/2016.
 */
public class BasicJDBCDemo {

    Connection conn;

    public static void main(String[] args)
    {
        new BasicJDBCDemo();
    }

    public BasicJDBCDemo()
    {
        System.out.println("[STARTING]");
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String url = "jdbc:oracle:thin:@oradev:1521:otdlvy";
            conn = DriverManager.getConnection(url, "mailman", "g00dt1m3s");
            doTests();
            conn.close();

        }
        catch (ClassNotFoundException ex) {System.out.println(ex.getMessage());}
        catch (IllegalAccessException ex) {System.out.println(ex.getMessage());}
        catch (InstantiationException ex) {System.out.println(ex.getMessage());}
        catch (SQLException ex)           {System.out.println(ex.getMessage());}
    }

    private void doTests()
    {
        System.out.println("[TESTS]");
        doSelectTest();

        doInsertTest();  doSelectTest();
        doUpdateTest();  doSelectTest();
        doDeleteTest();  doSelectTest();
    }

    private void doSelectTest()
    {
        System.out.println("[OUTPUT FROM SELECT]");
        String query = "SELECT VD_REGISTER_LAST_NAME, VD_REGISTER_FIRST_NAME, VD_REGISTER_ENABLED from VD_REGISTER";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                String s = rs.getString("VD_REGISTER_LAST_NAME");
                String n = rs.getString("VD_REGISTER_FIRST_NAME");
                Integer i = rs.getInt("VD_REGISTER_ENABLED");
                System.out.println(s + "   " + n + "   " + i);
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private void doInsertTest()
    {
        System.out.print("\n[Performing INSERT] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("insert into VD_REGISTER(VD_REGISTER_ID, VD_REGISTER_LAST_NAME, VD_REGISTER_FIRST_NAME, VD_REGISTER_EMAIL, VD_REGISTER_ENABLED) values (VD_REG_seq.nextval, 'Alexander', 'Jed', 'jalexander@icloud.com', 1)");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    private void doUpdateTest()
    {
        System.out.print("\n[Performing UPDATE] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE VD_REGISTER SET VD_REGISTER_ENABLED=0 WHERE VD_REGISTER_FIRST_NAME='Jed'");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    private void doDeleteTest()
    {
        System.out.print("\n[Performing DELETE] ... ");
        try
        {
            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM VD_REGISTER WHERE VD_REGISTER_FIRST_NAME='Jed'");
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

}
