<#import "/spring.ftl" as spring/>
<#import "esqueleto.ftl" as esqueleto/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Time ${time.agremiacao}!</title>
</head>
<body>
<@esqueleto.menu>
    <div class="container">
        <h1>Time</h1>
        Id: ${time.id}
        <br/>
        Agremiação: ${time.agremiacao}
    </div>
</@esqueleto.menu>
</body>
</html>