<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">





		<header>
			<%@ include file="./header.jsp"%>
		</header>
		<div>
			<jsp:include page="./scope-example.jsp"/>	
		</div>

		<footer>
			<%@ include file="./footer.jsp"%>
		</footer>

	</div>
</body>
</html>