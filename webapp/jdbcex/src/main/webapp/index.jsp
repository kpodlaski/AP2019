<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Hello World!</h2>
<%
Connection dCon = DriverManager.getConnection("jdbc:sqlite:C:\\tmp\\workshop_db.db");
Statement st = dCon.createStatement();
String sql = "SELECT * FROM STUDENT";

st.execute(sql);
ResultSet rs = st.getResultSet();
while(rs.next()){
        int id = rs.getInt(1);
        String name = rs.getString("NAME");
        String sname = rs.getString(3);
        String email = rs.getString(4);
        out.println(id+" "+name+" "+sname +" "+email);
        out.println("<br>");
}
%>

</body>
</html>
