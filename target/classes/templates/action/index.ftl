<!DOCTYPE html>
<html>
<head lang="en">
<title>Spring Boot Demo - FreeMarker</title>

</head>
<body>
    <h2>首页1<h2>
    
    <font> 
        <#list list as item> 
            ${item!}<br />
        </#list>
    </font>
    
    <button class="a"> click me</button>
</body>
</html>