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

        <g:form action="save" autocomplete="off">
            <p>
                <label for="title">Title</label>
                <g:textField name="title" value="${post?.title}"/>
            </p>

            <p>
                <label for="body">Body</label>
                <g:textArea name="body" value="${post?.body}"/>
            </p>

            <p>
                <g:submitButton name="send" value="Add"/>
            </p>
        </g:form>
    </body>
</html>
