<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="layout" content="main"/>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Document</title>

        <style>
            label { display: block; }
        </style>
    </head>

    <body>
        <g:link action="index">Go to list</g:link>

        <g:form action="update" id="${post.id}" autocomplete="off">
            <g:render template="form"/>

            <p>
                <g:submitButton name="send" value="Update"/>
            </p>
        </g:form>
    </body>
</html>
