<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Técnico ${tecnico.nome}!</title>
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Técnico</h1>
        Id: ${tecnico.id}
        <br/>
        Nome: ${tecnico.nome}
        <br/>
        Time: ${tecnico.time.agremiacao}
    </div>
</@esqueleto.menu>
</body>
</html>