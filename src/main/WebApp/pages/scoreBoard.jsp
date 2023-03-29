<%@ page language="java" import="java.util.*,com.jbk.dao.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ScoreBoard</title>
		<%@ include file="header.jsp" %> 
		<%@ include file="footer.jsp" %>
		<style><%@include file="../css/style.css"%></style>
	</head>
	<body>
		<form name="form2">		
		<h1>ScoreBoard</h1>
			<div class="container">
				<c:set var="count" value="1" />
				<table style="width:600px;" border="2">
						<tr>
								<th>Rank</th>
								<th>Name</th>
								<th>Score</th>
						</tr>
					<c:forEach var="score" items="${scores}">								
								<tr>
									<td>${count}</td>
									<td>${score.studentName}</td>
									<td>${score.score}</td>
								</tr>	
								<c:set var="count" value="${count + 1}"/>				
					</c:forEach>			
				</table> 
			</div>
			<br>
		</form>	
	</body>
</html>