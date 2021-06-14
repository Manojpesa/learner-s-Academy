<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
		<form name=frmName method="GET" action="login">
			<h1><b>Administrator Login</b></h1>
			<table width="50%" border="0">
				<tr valign="top">
					<td width="40%">Enter your username</td>
					<td><input type="text" name="username" id="username" maxlength=30></td>
				</tr>
				<tr valign="top">
					<td width="40%">Enter your password</td>
					<td><input type="password" name="password" id="password" maxlength=30></td>
				</tr>
				<tr valign="top">
					<td colspan=2 width="100%">
						<button>Sign In</button>
					</td>

				</tr>
			</table>
		</form>
	</center>
</body>
</html>