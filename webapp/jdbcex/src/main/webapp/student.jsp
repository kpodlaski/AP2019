<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Student Page</h2>
<table>
<%
    DBAccess db = new DBAccess();
    Student student = db.getStudentWithId(2);
    out.println("<tr><td>");
    out.prinln(student.getName());
    out.println("</td></tr>");
    out.println("<tr><td>");
    out.prinln(student.getSname());
    out.println("</td></tr>");
    out.println("<tr><td>");
    out.prinln(student.getEmail());
    out.println("</td></tr>");
%>
</table>