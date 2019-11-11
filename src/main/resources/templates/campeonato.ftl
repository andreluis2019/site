<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Campeonato ${campeonato.descricao}!</title>
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Campeonato</h1>
        Id: ${campeonato.id}
        <br/>
        Descrição: ${campeonato.descricao}
        <br/>
        Data de Início: ${campeonato.dataInicio}
        <br/>
        Data de Término: ${campeonato.dataFim}
        <br/>
        Prêmio: R$ ${campeonato.premio}
    </div>
</@esqueleto.menu>
</body>
</html>