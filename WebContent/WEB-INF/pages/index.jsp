<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
	<form action="billitem/list" method="post">
		<div>
			<input type="text" id="txtName" name="txtName" value="${loginname}" /> 
			<input type="submit" value="login" title="login" id="btnLogin" />
				
		</div>
		<script type="text/javascript"
			src="http://114.215.154.9/webresource/js/jquery-2.1.3.min.js"></script>
		<script type="text/javascript">
			
		</script>
	</form>
</body>
</html>