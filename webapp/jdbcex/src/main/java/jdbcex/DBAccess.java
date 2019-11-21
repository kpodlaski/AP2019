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
            ("jdbc:sqlite:C:\\tmp\\workshop_db.db");
    }

    public Object getStudentWithId(int id){
        Statement st = dCon.createStatement();
        String sql = "SELECT * FROM STUDENT WHERE ID = "+id;
        st.execute(sql);
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            int sid = rs.getInt(1);
            String name = rs.getString("NAME");
            String sname = rs.getString(3);
            String email = rs.getString(4);
            
            //out.println(id+" "+name+" "+sname +" "+email);
            //out.println("<br>");
        }
}
    }

}