<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Phantom 3 Flight Log Processing</h1>

<br />

<div>
	<form:form action="/dat/upload" enctype="multipart/form-data" >
		<input type="file" name="file" required="required" />
		<button class="btn btn-primary btn-sm">Upload Phantom 3 DAT File</button>
	</form:form>
</div>

<br />
<br />

<div>
	<h4>DAT Files</h4>
	<table class="table" style="width: inherit;">
		<tbody>
		
			<c:forEach items="${datFiles}" var="file">
				<tr>
					<td>${file}</td>
					<td>
						<form:form id="" action="/dat/convert">
							<input type="hidden" name="dat" value="${file}" />
							<button class="btn btn-info btn-xs">Convert to CSV</button>
						</form:form>
					</td>
					<td>
						<form:form id="" action="/dat/delete">
							<input type="hidden" name="file" value="${file}" />
							<input type="hidden" name="type" value="dat" />
							<button class="btn btn-danger btn-xs">Delete</button>
						</form:form>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</div>

<div>
	<h4>CSV Files</h4>
	
	<table class="table" style="width: inherit;">
		<tbody>
		
			<c:forEach items="${csvFiles}" var="file">
				<tr>
					<td>${file}</td>
					<td>
						<form:form id="" action="/dat/ingest">
							<input type="hidden" name="csv" value="${file}" />
							<button class="btn btn-info btn-xs">Ingest to Database</button>
						</form:form>
					</td>
					<td>
						<form:form id="" action="/dat/delete">
							<input type="hidden" name="file" value="${file}" />
							<input type="hidden" name="type" value="csv" />
							<button class="btn btn-danger btn-xs">Delete</button>
						</form:form>
					</td>
				</tr>
			</c:forEach>
		
		</tbody>
	</table>
</div>
