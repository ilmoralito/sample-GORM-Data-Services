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
        <g:link action="edit" id="${post.id}">Edit</g:link>

        <p>${post.title}</p>
        <p>${post.body}</p>

        <g:each in="${post.comments}" var="comment">
            <p>${comment.body}</p>
        </g:each>
    </body>
</html>
