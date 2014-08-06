<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
	<fieldset class="cDFieldset">
		<legend style="font-family: monospace;">Customer Details</legend>
		<div>
			<label for="name" class="alignLabel">Name</label> <input type="text"
				id="name" name="name" class="alignInput" style="margin-left: 22px;"
				value="${customer.name}" readonly>
		</div>
		<div>
			<label for="birthday" class="alignLabel">Birthday</label> <input
				type="date" name="bDay" class="alignInput" style="margin-left: 7px;"
				value="${customer.bDay}" readonly>
		</div>
		<div>
			<label for="email" class="alignLabel">Email</label> <input
				type="email" id="email" name="email" class="alignInput"
				style="margin-left: 25px;" value="${customer.email}" readonly>
		</div>
		<div>
			<label for="gender" class="alignLabel">Gender</label> <input
				type="text" id="gender" name="gender" class="alignInput"
				style="margin-left: 25px;" value="${customer.gender}" readonly>
		</div>
		<div>
			<label for="vehicle" class="alignLabel">Vehicle</label> <input
				type="text" id="vehicle" name="vehicle" class="alignInput"
				style="margin-left: 25px;" value="${customer.vehicle}" readonly>
		</div>
		<div>
			<label for="bikeBrand" class="alignLabel">BikeBrand</label> <input
				type="text" id="bikeBrand" name="bikeBrand" class="alignInput"
				style="margin-left: 25px;" value="${customer.bikeBrand}" readonly>
		</div>
		<div>
			<label for="carBrand" class="alignLabel">CarBrand</label> <input
				type="text" id="carBrand" name="carBrand" class="alignInput"
				style="margin-left: 25px;" value="${customer.carBrand}" readonly>
		</div>
		<div>
			<label for="note" class="alignLabel">Note</label> <input
				type="text" id="note" name="note" class="alignInput"
				style="margin-left: 25px;" value="${customer.note}" readonly>
		</div>
		<div style="margin-left: 104px;">
			<a href="/HTML5One-1.0" title="Back" class="aLink">Back</a>
		</div>
	</fieldset>
</body>
</html>