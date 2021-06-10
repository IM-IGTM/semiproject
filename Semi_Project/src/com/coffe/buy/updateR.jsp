<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ReviewUpdateController" method="post">

		<table border="1" id="tbl_reg">
			<tr>
				<td id="r_td1">글 제목</td>
				<td><input name="title" id="title" value=${r.r_title }></td>
			</tr>
			<tr>
				<td id="r_td2">내용</td>
				<td><textarea name="txt" id="txt" > ${r.r_txt }</textarea></td>
			</tr>
			<tr>
				<td><input name="no" value="${param.no}" type="hidden">
				</td>
			</tr>
			<tr>
			<td colspan="2" id="r_td3">
			<button>등록</button>
			</td>
			</tr>
			
		</table>

	</form>

</body>
</html>