<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Phantom 3 Flight Log Processing</h2>

<div>
	<form:form action="/data-files/upload" enctype="multipart/form-data" class="form-inline">
		
		<div class="input-group">
			<label class="input-group-btn">
				<span class="btn btn-primary">
					Browse&hellip; <input id="file-field" type="file" name="file" style="display: none;" autocomplete="off" />
				</span>
			</label>
			   
			<input type="text" class="form-control" autocomplete="off" readonly="readonly" />
		</div>
		
		<button id="btn-upload" class="btn btn-primary">Upload Phantom 3 DAT File</button>
		
	</form:form>
</div>

<br />

<div class="file-list">
	<h4>DAT Files</h4>
	
	<table class="table">
		<tbody>
		
			<c:forEach items="${dats}" var="dat">
				<tr>
				
					<td>${dat.name}</td>
					
					<td>
						<c:if test="${dat.processed}">
							<button class="btn btn-info btn-sm disabled">Processed</button>
						</c:if>
						<c:if test="${not dat.processed}">
							<form:form id="" action="/data-files/process-dat">
								<input type="hidden" name="dat" value="${dat.name}" />
								<button class="btn btn-info btn-sm">Process Dat File</button>
							</form:form>
						</c:if>
					</td>
					
					<td>
						<form:form id="" action="/data-files/delete">
							<input type="hidden" name="file" value="${dat.name}" />
							<input type="hidden" name="type" value="dat" />
							<button class="btn btn-danger btn-sm">Delete</button>
						</form:form>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
</div>

<div class="file-list">
	<h4>CSV Files</h4>
	
	<table class="table">
		<tbody>
		
			<c:forEach items="${csvs}" var="csv">
				<tr>
				
					<td>${csv.name}</td>
					
					<td>
						<c:if test="${csv.processed}">
							<button class="btn btn-info btn-sm disabled">Processed</button>
						</c:if>
						<c:if test="${not csv.processed}">
							<form:form id="" action="/data-files/process-csv">
								<input type="hidden" name="csv" value="${csv.name}" />
								<button class="btn btn-info btn-sm">Process CSV File</button>
							</form:form>
						</c:if>
					</td>
					
					<td>
						<form:form id="" action="/data-files/delete">
							<input type="hidden" name="file" value="${csv.name}" />
							<input type="hidden" name="type" value="csv" />
							<button class="btn btn-danger btn-sm">Delete</button>
						</form:form>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
</div>

<div class="file-list">
	<h4>JSON Files</h4>
	
	<table class="table">
		<tbody>
		
			<c:forEach items="${jsons}" var="json">
				<tr>
				
					<td>${json}</td>
					
					<td>
						<form:form id="" action="/data-files/delete">
							<input type="hidden" name="file" value="${json}" />
							<input type="hidden" name="type" value="json" />
							<button class="btn btn-danger btn-sm">Delete</button>
						</form:form>
					</td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
</div>
