<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#ttt {
	float: left;
	width: 300px;
	margin: 30px;
}
</style>
</head>
<body>
	${r}
	<form action="ProductController" method="post"
		enctype="multipart/form-data">

		<c:forEach var="c" items="${coffees}">
			<table border="1" id="ttt">

				<tr>
					<td id="m_td1" rowspan="4"><img src="img/${c.c_img}"
						width="100" height="100"></td>
				</tr>


				<tr>

					<td id="m_td1">${c.c_title}</td>
				</tr>

				<tr>

					<td id="m_td1">${c.c_price}</td>
				</tr>

				<tr>

					<td id="m_td1">${c.c_explain}</td>
				</tr>

			</table>
		</c:forEach>


	</form>
</body>
</html>