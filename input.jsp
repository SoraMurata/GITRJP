<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>名前と国籍</title>
    </head>

    <body>
        <h1>名前と国籍</h1>

        <form method="post" action="./rjptest">
            名前<input type="text" name="name"><br>

            国籍<input type="text" name="nationality"><br>

            <input type="submit" value="決定" />
        </form>
    </body>
</html>