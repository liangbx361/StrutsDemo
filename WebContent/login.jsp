<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Struts 2</title>
</head>

<body>
	<h2>Struts 2 - Login</h2>
	<s:actionerror />
	<s:form action="Login.action" method="post">
		<s:textfield name="username1" key="label.username" size="20" />
		<s:password name="password" key="label.password" size="20" />
		<s:submit method="execute" key="label.login" align="center" />
	</s:form>
</body>
</html>
