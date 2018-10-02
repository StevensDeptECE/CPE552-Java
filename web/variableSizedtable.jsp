<html>

<body>
<table>
<%
   List< ? > grades
   %>
<%
   FUNCTION1 1 18
   LOOP1 18
	RECORD1 3
	  STRING1
	  STRING1
          UINT4
   ENDLOOP
LOOP2 100000
	RECORD1 5
	  STRING1
	  STRING1
	  UINT4
	  DOUBLE
	DOUBLE
   ENDFUNCTION
   
   grade.id
   grade.email
   numberHomework
   grade.homework[n]


for (int i = 0; i < rows; i++) { %>
<tr><td> <%= people[i].firstname %></td><td><%= people[i].lasttname %> </td><td><%=people[i].id %></td></tr>


</table>

</body>

</html>
