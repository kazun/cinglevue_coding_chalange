<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<script type="text/javascript" charset="utf-8">

		$(document).ready(function() {
			var subjectFilter = document.getElementById('subjectFilter').value;
			var oTable = $('#table').dataTable( {
				 "bProcessing": true,
				 "bServerSide": true,
				 "sAjaxSource": "loadResult.htm",
				 "fnServerParams": function ( aoData ) {
			            aoData.push( { "name": "more_data", "value": subjectFilter} );
			        },
				 "sAjaxDataProp": "schools",
				 "aoColumns": [
						{ "mData": "school.schoolName" },
						{ "mData": "latestY3" },
						{ "mData": "latestY5" },
						{ "mData": "latestY7" },
						{ "mData": "latestY9" },
						{ "mData": "rawGainY3Y5" },
						{ "mData": "factoredGainY3Y5" },
						{ "mData": "glgY3Y5" },
						{ "mData": "latestGainInGainY3Y5" }
					]
			} );
			
			 $('#subjectFilter').onchange( function() { oTable.fnDraw(); } );
		} );
		
</script>

<div class="well">
	<div class="pull-right">

		<div class="form-group">
			<label for="disabledSelect">Filtering by</label> 
			<select id="subjectFilter" >
				<option value="All" selected="selected">All</option>
				<option value="Numeracy" >Numeracy</option>
				<option value="Spelling or Reading">Spelling or Reading</option>
			</select>
		</div>

	</div>
	<table cellpadding="0" cellspacing="0" border="0"
		class="display table-hover" id="table">
		<thead>
			<tr>
				<th width="20%">School</th>
				<th >Y3</th>
				<th >Y5</th>
				<th >Y7</th>
				<th >Y9</th>
				<th >Raw Gain Y3 to Y5</th>
				<th >Factored Gain Y3 to Y5</th>
				<th >CLG% Y3 to Y5</th>
				<th >Gain In Gain Y3 to Y5</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
		<tfoot>
			<tr>
				<th>School</th>
				<th>Y3</th>
				<th>Y5</th>
				<th>Y7</th>
				<th>Y9</th>
				<th>Raw Gain Y3 to Y5</th>
				<th>Factored Gain Y3 to Y5</th>
				<th>CLG% Y3 to Y5</th>
				<th>Gain In Gain Y3 to Y5</th>
			</tr>
		</tfoot>
	</table>
	<br /> <br />
</div>