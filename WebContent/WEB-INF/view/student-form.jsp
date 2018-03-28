<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title></title>
	</head>
	
	<body>
	
		<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName" placeholder="What's your name"/>
			<br/>
			Last name: <form:input path="lastName" placeholder="What's your lastname"/>
			<br/>
			<input type="submit" value="Submit">
		</form:form>
	
	</body>
</html>