<%@ page language="java" import="java.util.*,com.jbk.dao.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Result</title>
		<%@ include file="header.jsp" %> 
		<%@ include file="footer.jsp" %>
		<style><%@include file="../css/style.css"%></style>
	</head>
	<body>
		<form name="form2">
			<div>
			<%
				int score = (int) request.getAttribute("score");
				if(score >80){
					%>	
						<image src="images/pass.jpg"  height="60%" width="100%"></br></br>
					<%
				}else{
					%>
						<image src="images/failed.png"  height="60%" width="100%"></br></br>
					<%
				}
			%>
			</div>
			<br>	
		
			<div class="container">
			<p style="font-size: 20px;"><b>Your Score is ${score}%</b></p>
			
				<table border="2">
						<tr>
								<th>Q No</th>
								<th>Question</th>
								<th>Your Answer</th>
								<th>Correct Answer</th>
						</tr>
					<c:forEach var="answer" items="${submittedDetails.values()}">
								
								<tr>
									<td>${answer.qno}</td>
									<td>${answer.questionText}</td>
									<td>${answer.submittedAnswer}</td>
									<td>${answer.originalAnswer}</td>
								</tr>					
					</c:forEach>			
				</table> 
			</div>
			<br>
			<button type="submit" formaction="/scoreBoard">View ScoreBoard</button>
		</form>	
	</body>
</html>