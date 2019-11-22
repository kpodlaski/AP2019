package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBAccess {
    private Connection dCon;
    public DBAccess() throws SQLException {
        this.dCon = DriverManager.getConnection
            ("jdbc:sqlite:..\\..\\db\\workshop_db.db");
    }

    public Student getStudentWithId(int id) throws SQLException{
        Statement st = dCon.createStatement();
        String sql = "SELECT * FROM STUDENT WHERE ID = "+id;
        st.execute(sql);
        ResultSet rs = st.getResultSet();
        Student student = null;
        while(rs.next()){
            int sid = rs.getInt(1);
            String name = rs.getString("NAME");
            String sname = rs.getString(3);
            String email = rs.getString(4);
            student = new Student(sid,name,sname,email);
            //out.println(id+" "+name+" "+sname +" "+email);
            //out.println("<br>");
        }
        return student;
    }
}

