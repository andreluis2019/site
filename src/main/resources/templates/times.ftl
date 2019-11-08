<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Times!</title>
    <link rel="stylesheet"
<#--          type="text/css" href="<@spring.url '/css/cliente.css'/>"/>-->
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Lista de Times</h1>
        <table>
            <thead>
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Agremiação
                </th>
            </tr>
            </thead>
            <tbody>
            <#list timeList as time>
                <tr>
                    <td>
                        <a href="http://localhost:8080/time-screen/${time.id}">${time.id}</a>
                    </td>
                    <td>
                        ${time.agremiacao}
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@esqueleto.menu>
</body>
</html>
