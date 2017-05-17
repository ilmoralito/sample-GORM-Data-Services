<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="layout" content="main"/>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <g:link action="create">Create</g:link>

        <table>
            <caption>Posts</caption>

            <thead>
                <tr>
                    <th>Title</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

            <tbody>
                <g:each in="${postList}" var="post">
                    <tr>
                        <td>${post.title}</td>
                        <td>
                            <g:link action="show" id="${post.id}">Show</g:link>
                        </td>
                        <td>
                            <g:link action="delete" id="${post.id}">Delete</g:link>
                        </td>
                    </tr>
                </g:each>
            </tbody>
        </table>
    </body>
</html>
