<%@ page import = "java.io.*,java.util.*" %>

<html>
    <body>
    <%
         Integer count = (Integer)application.getAttribute("count");
         if( count == null ) {
            /* First visit */
            out.println("Welcome to my website!");
            count = 1;
         } else {
            /* return visit */
            out.println("Welcome back to my website!");
            count ++;
         }
         application.setAttribute("count", count);
      %>
        <%= count %>
    </body>
</html>
