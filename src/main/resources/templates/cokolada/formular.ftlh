[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Obchůdek pro mlsné jazýčky: čokoláda</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
    <form class="kosik" action="/cokolada" method="post">
        <h1>Objednávka čokolády</h1>
        <!--
        Formulář bude obsahovat:

        * výběr z druhů čokolády, např.: mléčná, bíla, hořká (select)
        * Jméno a příjmení (input)
        * e-mail – volitelný údaj (input)
        * souhlas s obchodními podmínkami (check box)
        -->

        <label for="druh" class="radek">Druh:</label>
        [@spring.formSingleSelect path="form.druh" options={
        "": "",
        "MLECNA": "Mléčná",
        "BILA": "Bílá",
        "HORKA": "Hořká"
        } /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="jmeno" class="radek">Jméno:</label>
        [@spring.formInput path="form.jmeno" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="prijmeni" class="radek">Příjmení:</label>
        [@spring.formInput path="form.prijmeni" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email" class="radek">E-mail:</label>
        [@spring.formInput path="form.email" fieldType="email" /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div class="radek">
            [@spring.formCheckbox path="form.souhlas" /]
            <label for="souhlas">Souhlasím s obchodními podmínkami</label>
        </div>

        <div class="error">[@spring.showErrors "<br>"/]</div>
        <div class="radek controls">
            <button type="submit">Objednat</button>
        </div>

    </form>
</div>
</body>
</html>
