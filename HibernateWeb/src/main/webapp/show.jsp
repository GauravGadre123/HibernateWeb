<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,com.techno.dao.StudentDao,com.techno.entites.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<%
			if (request.getAttribute("msg") != null) {
		%>
		<div class="alert alert-success alert-dismissible">
			<a class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong> <%=request.getAttribute("msg")%>

			</strong> .
		</div>
		<%
			}
		%>
		<div class="text-center">
			<a href="addStudent.jsp">
				<button class="btn btn-primary ">Add Student</button>
			</a>
		</div>
		<br />
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th>name</th>
					<th>marks</th>
					<th>action</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<Student> students = StudentDao.getAllStudents();

					for (Student st : students) {
				%>
				<tr>
					<td><%=st.getName()%></td>
					<td><%=st.getMarks()%></td>
					<th><a href="updateStudent.jsp?id=<%=st.getId()%>"><button
								class="btn btn-primary">update</button></a></th>
					<th><a href="delete?id=<%=st.getId()%>"><button
								class="btn btn-danger">delete</button></a></th>
				</tr>
				<%
					}
				%>

			</tbody>
		</table>
	</div>


</body>
</html>