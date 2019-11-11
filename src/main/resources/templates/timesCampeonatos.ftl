<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Times por Campeonato!</title>
    <link rel="stylesheet"
    <#--          type="text/css" href="<@spring.url '/css/cliente.css'/>"/>-->
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Lista de Times por Campeonato</h1>
        <table>
            <thead>
            <tr>
                <th>
                    Time
                </th>
                <th>
                    Campeonato
                </th>
            </tr>
            </thead>
            <tbody>
            <#list timeCampeonatoList as timeCampeonato>
                <tr>
                    <td>
                        <a>${timeCampeonato.time.agremiacao}</a>
                    </td>
                    <td>
                        ${timeCampeonato.campeonato.descricao}
                    </td>
                    <td>
                        <a href="http://localhost:8080/time-campeonato-screen/deletar/${timeCampeonato.id}">Excluir Registro</a>
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@esqueleto.menu>
</body>
</html>
