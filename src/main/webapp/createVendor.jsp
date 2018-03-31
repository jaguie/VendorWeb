<!DOCTYPE html>
<html lang="en">
<body>
	    <pre>
            <form action="saveVendor" method="POST">
            id: <input type="text" name="id"/>
            code: <input type="text" name="code"/>
            name: <input type="text" name="name"/>
            type: Regular: <input type="radio" name="type" value="REGULAR"/>
                  Contract: <input type="radio" name="type" value="CONTRACT"/>
            email: <input type="text" name="email"/>
            phone: <input type="text" name="phone"/>
            address: <input type="text" name="address"/>
            <input type="submit" value="save"/>
            </form>
        </pre>
${msg}

<a href="displayVendors">View All</a>
</body>
</html>