<%@ page import="com.ann.app.view.helper.HtmlTopToolbar" %>
<!DOCTYPE html>      
<html>      
<head>      
    <%@ include file="../style/style.jsp" %>
</head>      
<body>      
    <%= new HtmlTopToolbar().menu((int)request.getAttribute("activeMenu")) %>

    <h3> <%= application.getInitParameter("AppName") %> | Welcome:  <%= session.getAttribute("username") %></h3>
        <br/>

    <%= request.getAttribute("content") %>
    <a style= color:pink; href="./logout">Logout</a>
</body>
</html>