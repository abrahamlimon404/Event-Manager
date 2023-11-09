<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Item</title>
</head>
<body>
	<p>Adding items for <strong>${event.name}</strong></p>
	<form method="POST">
		<label>Enter Item Name: </label>
		<input type="text" name="name" id="name" style="border: solid 2px" autofocus="autofocus"><br>
		<label>Enter Number of Items:</label>
		<input type="number"  name="num" id="num"style="border: solid 2px">
		<button type="submit">Submit</button>
	</form>
</body>
</html>