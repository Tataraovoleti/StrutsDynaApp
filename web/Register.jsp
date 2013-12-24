<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color:lightblue">
    <center>    
        <html:errors />
        <html:form action="register" method="post">
            <bean:message key="lab.name" /><html:text property="name" />
            <br>
            <bean:message key="lab.pass" /><html:text property="password" />
            </br>
            <html:submit>
                <bean:message key="btn.key" />
            </html:submit>
            
        </html:form>
    </center> 
    </body>
</html:html>
