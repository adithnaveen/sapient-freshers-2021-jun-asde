
<%@ include file="./header.jspf" %>

	<div class="alert alert-primary">
		<div class="container">
			<h3>Question From DB - ${title}</h3>
		</div>
	</div>

	<div style="min-height: 450px">
		<table class="table table-stripped">
			<thead>
				<tr>
					<th>SL NO</th>
					<th>Question</th>
					<th>Option1</th>
					<th>Option2</th>
					<th>Option3</th>
					<th>Option4</th>

				</tr>

			</thead>

			<tbody>
				<s:forEach items="${questions}" var="q" varStatus="status">

					<tr>
						<td>${status.index +1 }</td>
						<td>${q.question }</td>
						<td>${q.option1 }</td>
						<td>${q.option2 }</td>
						<td>${q.option3 }</td>
						<td>${q.option4 }</td>

					</tr>

				</s:forEach>
			</tbody>



		</table>
	</div>




<%@ include file="./footer.jspf" %>




