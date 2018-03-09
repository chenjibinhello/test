<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>
<script type="text/javascript" src="/static/js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="/static/js/index.js"></script>
</head>
<body>
    <h2>首页<h2>
    
    <font> 
        <#list list as item> 
            ${item!}<br />
        </#list>
    </font>
    
    <button class="a"> click me</button>
</body>
</html>