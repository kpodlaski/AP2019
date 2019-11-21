package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDBTest{
    public static void main(String[] a) throws SQLException{
        Connection dCon = DriverManager.getConnection
        ("jdbc:sqlite:C:\\Users\\user\\git\\AP2019\\db\\workshop_db.db");
        Statement st = dCon.createStatement();
        String sql = "SELECT * FROM STUDENT";
        st.execute(sql);
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString("NAME");
            String sname = rs.getString(3);
            String email = rs.getString(4);
            System.out.println(id+" "+name+" "+sname +" "+email);
        }
    }
}
