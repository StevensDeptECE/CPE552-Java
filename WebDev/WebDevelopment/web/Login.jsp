<%
  String userid = request.getParameter("userid");
  String passwd = request.getParameter("passwd");
  System.out.println(userid + "," + passwd);
  if (userid  != null && passwd != null) {
    if (userid.equals("dkruger") && passwd.equals("test")) {
        session.setAttribute("userid", "Dov is Logged in the building!");
        response.sendRedirect("home.jsp");
    }
  }
%>

<html>
    <body>
        <table>
            <form method="get" action="Login.jsp">
            <tr><td style="background-color: red; font-size: 22pt">User id</td><td><input type="text" name="userid"></td></tr>
            <tr><td>Password</td><td><input type="password" name="passwd"></td></tr>
            <tr><td><input type="submit" value="Login"></td></tr>
            </form>
        </table>
    </body>
</html>
