<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Customer Form - Struts2 Demo | ViralPatel.net</title>
</head>

<body>
	<s:form action="customer.action" method="post" validate="true">
		<s:textfield name="name" key="name" size="20" />
		<s:textfield name="age" key="age" size="20" />
		<s:textfield name="email" key="email" size="20" />
		<s:textfield name="telephone" key="telephone" size="20" />
		<s:submit method="addCustomer" key="label.add.customer" align="center" />
	</s:form>
</body>
</html>
