<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Event</title>
</head>
<body>
<form method="post">
<h3>Edit Event</h3>
Name: <@spring.formInput "event.name" /><br>
Date: <@spring.formInput "event.date" "" "date" /><br>
Creator: <@spring.formInput "event.user" /><br>
<button>Save</button>
</form>
</body>
</html>
