<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer form</title>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/styles.css">
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="customer">
			Name:
			<form:input path="name" />
			<br/>
			Last Name:
			<form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			<br/>
			<input type="submit" value="Submit">		
		</form:form>
		
	</body>
</html>