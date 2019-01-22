<%@ page import = "java.io.*,java.util.*" %>

<html>
    <body>
    <%
         Integer count = (Integer)session.getAttribute("count2");
         if( count == null ) {
            /* First visit */
            out.println("Testing:Welcome to my website!");
            count = 1;
         } else {
            /* return visit */
            out.println("Welcome back to my website!");
            count ++;
         }
         session.setAttribute("count2", count);
      %>
        <%= count %>
    </body>
</html>
