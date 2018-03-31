
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<c:if test="${vendor.type == 'REGULAR'}"><c:set var="regular" value='checked'/></c:if>
<c:if test="${vendor.type == 'CONTRACT'}"><c:set var="contract" value='checked'/></c:if>

<!DOCTYPE html>
<html lang="en">
<body>
	    <pre>
            <form action="updateVendor" method="POST" readonly="true" >
            id: <input type="text" name="id" value='<c:out value="${vendor.id}"/>'/>
            code: <input type="text" name="code" value='<c:out value="${vendor.code}"/>'/>
            name: <input type="text" name="name" value='<c:out value="${vendor.name}"/>'/>

            type: Regular: <input type="radio" name="type" <c:out value="${regular}"/> value="REGULAR"/>
                  Contract: <input type="radio" name="type" <c:out value="${contract}"/> value="CONTRACT"/>

            email: <input type="text" name="email" value='<c:out value="${vendor.email}"/>'/>
            phone: <input type="text" name="phone" value='<c:out value="${vendor.phone}"/>'/>
            address: <input type="text" name="address" value='<c:out value="${vendor.address}"/>'/>
            <input type="submit" value="save"/>
            </form>
        </pre>
${msg}

<a href="displayVendors">View All</a>
</body>
</html>