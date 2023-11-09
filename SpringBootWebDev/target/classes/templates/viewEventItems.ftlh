<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Event Items</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 1em;
	text-align: center;
}
</style>
</head>
<body>
	<p><a href="/">All Events</a></p>
	<p>${event.name}</p>
	<p>by ${event.user}</p>
	<p>${event.date}</p>
	<#if event.items?has_content>
	<table>
		<tr>
			<th>Item</th>
			<th>Name</th>
			<th>Delete</th>
		</tr>
		<tbody>
			<#list event.items as item>
			<tr>
				<td>${item.itemName}</td>
				<#if item.personName??>
				<td>${item.personName}</td>
				<#else>
					<td>
						<form method="get" action="/viewEventItems/${event.id}/assignPerson/${item.id}">
							<button type="submit">Assign Person</button>
						</form>
					</td>
				</#if>
				<td><a href="/viewEventItems/${event.id}/delete/${item.id}">Remove</a></td>
			</tr>
			</#list>
		</tbody>
	</table>
	<#else>
		<p><strong>There are no Items</strong></p>
	</#if>
	<p>
		<a href="/addItem/${event.id}">Add New Item</a>
	</p>
</body>
</html>