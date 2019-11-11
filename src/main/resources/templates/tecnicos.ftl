<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Técnicos!</title>
    <link rel="stylesheet"
    <#--          type="text/css" href="<@spring.url '/css/cliente.css'/>"/>-->
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Lista de Técnicos</h1>
        <table>
            <thead>
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Nome
                </th>
                <th>
                    Time
                </th>
            </tr>
            </thead>
            <tbody>
            <#list tecnicoList as tecnico>
                <tr>
                    <td>
                        <a href="http://localhost:8080/tecnico-screen/${tecnico.id}">${tecnico.id}</a>
                    </td>
                    <td>
                        ${tecnico.nome}
                    </td>
                    <td>
                        ${tecnico.time.agremiacao}
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@esqueleto.menu>
</body>
</html>
