<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Jogador ${jogador.nome}!</title>
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Jogador</h1>
        Id: ${jogador.id}
        <br/>
        Nome: ${jogador.nome}
        <br/>
        Posição: ${jogador.jogadorPosicao}
        <br/>
        Idade: ${jogador.idade}
        <br/>
        Time: ${jogador.time.agremiacao}
    </div>
</@esqueleto.menu>
</body>
</html>