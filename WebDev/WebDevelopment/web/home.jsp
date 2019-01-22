<%
    String userid = (String)session.getAttribute("userid");
    if (userid == null)
      response.sendRedirect("Login.jsp");
%>


<html>
    <body>
        Congratulations, you are logged in!
    </body>
</html>
