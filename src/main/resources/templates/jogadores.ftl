<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Jogadores!</title>
    <link rel="stylesheet"
    <#--          type="text/css" href="<@spring.url '/css/cliente.css'/>"/>-->
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Lista de Jogadores</h1>
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
                    Posição
                </th>
                <th>
                    Idade
                </th>
                <th>
                    Time
                </th>
            </tr>
            </thead>
            <tbody>
            <#list jogadorList as jogador>
                <tr>
                    <td>
                        <a href="http://localhost:8080/jogador-screen/${jogador.id}">${jogador.id}</a>
                    </td>
                    <td>
                        ${jogador.nome}
                    </td>
                    <td>
                        ${jogador.jogadorPosicao}
                    </td>
                    <td>
                        ${jogador.idade}
                    </td>
                    <td>
                        ${jogador.time.agremiacao}
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</@esqueleto.menu>
</body>
</html>
