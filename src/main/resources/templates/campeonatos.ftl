<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Campeonatos!</title>
    <link rel="stylesheet"
    <#--          type="text/css" href="<@spring.url '/css/cliente.css'/>"/>-->
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Lista de Campeonatos</h1>
        <table>
            <thead>
            <tr>
                <th>
                    ID
                </th>
                <th>
                    Descrição
                </th>
                <th>
                    Data de Início
                </th>
                <th>
                    Data de Término
                </th>
                <th>
                    Prêmio
                </th>
            </tr>
            </thead>
            <tbody>
            <#list campeonatoList as campeonato>
                <tr>
                    <td>
                        <a href="http://localhost:8080/campeonato-screen/${campeonato.id}">${campeonato.id}</a>
                    </td>
                    <td>
                        ${campeonato.descricao}
                    </td>
                    <td>
                        ${campeonato.dataInicio}
                    </td>
                    <td>
                        ${campeonato.dataFim}
                    </td>
                    <td>
                        ${campeonato.premio}
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@esqueleto.menu>
</body>
</html>
