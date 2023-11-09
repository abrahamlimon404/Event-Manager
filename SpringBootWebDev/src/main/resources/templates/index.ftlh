<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ListEvent</title>

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
	<p>Events</p>
	<p>
		<a href="/addEvent">New Events</a>
	</p>
	<#list events>
	<table>
		<tr>
			<th>Event</th>
			<th>Date</th>
			<th>Created By</th>
			<th>Edit</th>
		</tr>

		<tbody>
		<#items as event>
			<tr>
				<td><a href="/viewEventItems/${event.id}">${event.name}</a></td>
				<td>${event.date}</td>
				<td>${event.user}</td>
				<th><a href="/edit/${event.id}">Edit</a></th>
			</tr>
		</tbody>
		</#items>
	</table>
	<#else>
    <p>No entries yet.</p>
	</#list>
</body>
</html>


