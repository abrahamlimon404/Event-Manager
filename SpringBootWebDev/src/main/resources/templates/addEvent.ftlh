<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html >
<head>
<meta charset="UTF-8">
    <title>Add Event</title>
</head>
<body>
    <form  method='post' style = "margin-left: 20px">
        <h3>Add Event</h3>
        <label>Name: </label>
        <@spring.formInput "event.name" /> <br>
        <label>Date: </label>
        <@spring.formInput "event.date" "" "date"  /> <br>
        <label>Creater: </label>
        <@spring.formInput "event.user" />
        <button>Add</button>
    </form>
</body>
</html>