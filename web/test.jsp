<html>

<body>
<table>
<%
Person people[3];
for (int i = 0; i < rows; i++) { %>
<tr><td> <%= people[i].firstname %></td><td><%= people[i].lasttname %> </td><td><%=people[i].id %></td></tr>


</table>

</body>

</html>