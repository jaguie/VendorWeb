
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<body>
<h2> Vendors : </h2>
<table>
    <tr>
        <th>id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
        <th>email</th>
        <th>phone</th>
        <th>address</th>
    </tr>

    <c:forEach items="${vendors}" var="vendor">
        <c:set var="vendor_id" value='$(vendor.id}' />
        <tr>
            <td>${vendor.id}</td>
            <td>${vendor.code}</td>
            <td>${vendor.name}</td>
            <td>${vendor.type}</td>
            <td>${vendor.email}</td>
            <td>${vendor.phone}</td>
            <td>${vendor.address}</td>
            <td><a href='deleteVendor?id=<c:out value="${vendor.id}"/>'>delete</a></td>
            <td><a href='editVendor?id=<c:out value="${vendor.id}"/>'>edit</a></td>
        </tr>
    </c:forEach>
</table>
<pre>${msg}</pre>
<br/>
<a href="createVendor">Create New Vendor</a>
</body>
</html>