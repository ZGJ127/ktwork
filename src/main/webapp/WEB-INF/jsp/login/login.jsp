<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../css/login.css">
</head>
<body>
	<!-- 	包含整个登录框的容器 -->
	<div class="content">
		<!-- 		登录面板 -->
		<div class="panel">
			<form id="loginForm" method="post"
				action="<%=request.getContextPath()%>/login/valid">
				<div class="group">
					<label>账号</label> <input placeholder="请输入账号">
				</div>
				<div class="group">
					<label>密码</label> <input placeholder="请输入密码" type="password">
				</div>
				<div class="login">
						<input type="submit"  value="登录">
				</div>
			</form>
			<div class="register">
				<button>创建新账号</button>
			</div>
		</div>

	</div>

</body>
</html>