<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assign Person</title>
</head>

<body> 
   <form method="post" action="/viewEventItems/${event.id}/assignPerson/${item.id}" style = "margin-left: 20px">
        <h3>Add Event</h3>
        <label>Sign Up For ${item.itemName}</label><br>
        <label>Enter Name: </label>
        <input autofocus="autofocus" id="personName" name="personName" style="border: solid 2px" type="text"> <br>
        <button type="submit">Add</button>
    </form>
</body>
</html>