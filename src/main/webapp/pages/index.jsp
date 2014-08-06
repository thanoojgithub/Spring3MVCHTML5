<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<script src="resources/js/jquery-2.1.1.min.js"></script>
<script>
$(document).ready(function(){
  $("#submit").click(function(){
    alert("HI");
  });
  
	$('input:checkbox[name="vehicle"]').change(function() {
			$('input:checkbox[name="vehicle"]').each(function () {
				var checkedMe = $(this).is(':checked');
				var vehicle = $(this).val();
				alert(checkedMe + " " + vehicle);
				if(checkedMe){
				if(checkedMe && vehicle=="Bike"){
					$.ajax({
					    url: "${pageContext.request.contextPath}/getVehicleList.do",  
					    data : "vehicle=" + vehicle,
					    type: "GET",
					    success:function(data) {
					      alert("data : "+data);
					       var vehicleSelect = "";
						      vehicleSelect += "<select style=\"margin-left: 101px;\" id=\"bikeBrand\" name=\"bikeBrand\">";
						      vehicleSelect += "<option>Select</option>";
					    	$.each(data,  function (index, v) {
					    	vehicleSelect += "<option value=\"" +v+ " \"> " +v+"</option>";
					       });
					    	document.getElementById( "bikeBrand").innerHTML = vehicleSelect;
					    },
					 	error : function(e) {
					      alert('Error: ' + e);   
					    }  
					});
				}
				if(checkedMe && vehicle=="Car"){
					$.ajax({
					    url: "${pageContext.request.contextPath}/getVehicleList.do",  
					    data : "vehicle=" + vehicle,
					    type: "GET",
					    success:function(data) {
					      alert("data : "+data);
					      var vehicleSelect = "";
					      vehicleSelect += "<select style=\"margin-left: 101px;\" id=\"carBrand\" name=\"carBrand\">";
					      vehicleSelect += "<option>Select</option>";
				    	$.each(data,  function (index, v) {
				    	vehicleSelect += "<option value=\"" +v+ " \"> " +v+"</option>";
				       });
				    	document.getElementById( "carBrand").innerHTML = vehicleSelect;
					      },
					 	error : function(e) {
					      alert('Error: ' + e);   
					    }  
					});
				}
				}else{
					if(vehicle=="Bike"){
						$( "#bikeBrand" ).empty();
					}
					if(vehicle=="Car"){
						$( "#carBrand" ).empty();
					}
					
				}
			});
		});
	});
	
</script>
</head>
<body>
	<form:form method="post" action="addCustomer.do">
		<fieldset class="cDFieldset">
			<legend class="legend">Customer Details</legend>
			<div>
				<label for="name" class="alignLabel">Name</label> <input type="text"
					id="name" name="name" class="alignInput" style="margin-left: 22px;"
					required placeholder="Firstname Lastname"
					onfocus="this.placeholder=''"
					onblur="this.placeholder='Firstname Lastname'">
			</div>
			<div>
				<label for="birthday" class="alignLabel">Birthday</label> <input
					type="date" name="bDay" required class="alignInput"
					style="margin-left: 7px;">
			</div>
			<div>
				<label for="email" class="alignLabel">Email</label> <input
					type="email" id="email" name="email" required class="alignInput"
					style="margin-left: 25px;"  placeholder="email"
					onfocus="this.placeholder=''" onblur="this.placeholder='email'">
			</div>
			<div id="gender">
        		<input type="radio" id="male" name="gender" value='male' checked /><label for="male">Male</label>
        		<input type="radio" id="female" name="gender" value='female'/><label for="female">Female</label>
    		</div>
			<div id="vehicle">
			 	<label class="alignLabel">Vehicle</label>
				<input type="checkbox" name="vehicle" value="Bike" style="margin-left: 12px;" id="bike"><label for="bike">I have a bike</label>
				<input type="checkbox" name="vehicle" value="Car" id="car"><label for="car">I have a car</label>
			</div>
			<div id="bikeBrand">
			</div>
			<div id="carBrand">
			</div>
			<div>
			<textarea rows="2" cols="25" spellcheck="true" id="note"  name="note" style="margin-left: 101px;margin-top: 15px;" wrap="soft" placeholder="Any thing else to note" onfocus="this.placeholder=''" onblur="this.placeholder='Any thing else to note'"></textarea>
			</div>
			<div class="submit" style="margin-left: 99px;">
				<input type="submit" value="Submit" class="button" id="submit">
			</div>
		</fieldset>
	</form:form>
</body>
</html>