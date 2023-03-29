
<%@page import="java.util.List"%>
<%@page import="com.onlineExam.dao.QuestionDao"%>
<%@page isELIgnored="false"%>

<html>
<head>
<title>Question Page</title>
<%@ include file="header.jsp" %> 
<%@ include file="footer.jsp" %>
<style><%@include file="../css/style.css"%></style>

<script>
	
	function submitAnswer() {
		xhttp = new XMLHttpRequest();

		var ans = document.myForm.opt.value;
		var oans = document.myForm.qans.value;

		var qno = document.myForm.qno.value;
		var qtxt = document.myForm.qtxt.value;

		//submitAns ? submittedAnswer=x & originalAnswer=x & qno=1 & questionText=what is java
		var data = "?submittedAnswer=" + ans + "&originalAnswer=" + oans
				+ "&qno=" + qno + "&questionText=" + qtxt;

		xhttp.open("GET", "submitAns" + data, true);

		xhttp.send();

	}
</script>

<style>
	.navbtn{
		background-color: #04AA6d;
		color: white;
		padding: 10px 15px;
		margin: auto;
		width: 15%;
		border: none;
	}

</style>

</head>
<body>
	<span style="color: red">${message}</span>
	<br>
	<br>
	<form style="border: none">
		<button class="cancelbtn" style="float:right" type="submit" formaction="/home" >Exit Exam</button><br>
	</form>

	<form name="myForm" >
		
			<div class="quecontainer">
				<p style="font-size: 25px"><b>${question.qNumber}. ${question.qText}</b></p>
				<input type="hidden" name="qno" value="${question.qNumber}">
				<input type="hidden" name="qtxt" value="${question.qText}">
				<br> 
				<input type="radio" name="opt" value="${question.option1}" 
					onclick="submitAnswer()"> <span>${question.option1}</span>
				<br>
				<input type="radio" name="opt" value="${question.option2}"
					onclick="submitAnswer()"> <span>${question.option2}</span>
				<br>
				<input type="radio" name="opt" value="${question.option3}"
					onclick="submitAnswer()"> <span>${question.option3}</span>
				<br>
				<br> 
				<br>
				<input type="hidden" name="qans" value="${question.qAnswer}">				
				
				<button class="navbtn" type="submit" formaction="previous" >previous</button>
				<button class="navbtn" style="float:right" type="submit" formaction="next" >next</button><br>
				<br> <br> <br> <br> 
				<button class="cancelbtn" style="float:right" type="submit" formaction="endExam" >Submit Exam</button><br>
				<br> <br> 
			</div>
	</form>
</body>
</html>