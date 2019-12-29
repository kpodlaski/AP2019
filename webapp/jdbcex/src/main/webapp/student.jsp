<%@ page import="java.sql.*, jdbcex.*" %>
<html>
<body>
<h2>Student Page</h2>
<table>
<%
    Class.forName("org.sqlite.JDBC");
    DBAccess db = new DBAccess();
    Student student = db.getStudentWithId(2);
    out.println("<tr><td>");
    out.println(student.getName());
    out.println("</td></tr>");
    out.println("<tr><td>");
    out.println(student.getSname());
    out.println("</td></tr>");
    out.println("<tr><td>");
    out.println(student.getEmail());
    out.println("</td></tr>");
%>
</table>
