<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	
	<body>
		Customer is confirmed: ${ customer.name } ${ customer.lastName }
		<br/>
		Free passes: ${ customer.freePasses }
		<br/>
		Zip code: ${ customer.zipcode }
	</body>
</html>