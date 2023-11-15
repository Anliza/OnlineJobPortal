<%@ page import="com.ann.app.view.helper.HtmlTopToolbar" %>
   <!DOCTYPE html>      
    <html>      

    <head>      
    <style>           
    Body {             
        font-family: Calibri, Helvetica, sans-serif;             
        background-color: #096E77;            
    }            

    .topnav {          
    overflow: hidden;          
    background-color: #E0E5E9 ;          
}          

.topnav a {          
    float: left;          
    color: #096E77;          
    text-align: center;          
    padding: 14px 16px;          
    text-decoration: none;          
    font-size: 17px;          
}          

.topnav a:hover {          
    background-color: #ddd;          
    color: black;          
}          

.topnav a.active {          
    background-color: #04AA6D;          
    color: white;          
}          

    table {           
        font-family: arial, sans-serif;           
        border-collapse: collapse;           
        width: 80%;           
        background-color:#E0E5E9 ;           
        margin: 0 auto;           
    }           

    td, th {           
        border: 1px solid #dddddd;           
        text-align: left;           
        padding: 8px;           
    }           

    tr:nth-child(even) {           
        background-color: #b1387e;           
    }           
    </style> 
</head>      

<body>      
    <%= new HtmlTopToolbar().menu((int)request.getAttribute("activeMenu")) %>

    <h3> <%= application.getInitParameter("AppName") %></h3><br/>
    
    <h3>Welcome:  <%= session.getAttribute("username") %> </h3> <br/>

    <%= request.getAttribute("content") %>
    <a style= color:pink; href="./logout">Logout</a>
</body>
</html>