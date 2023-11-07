/*
Faça um script que receba o saldo médio de um cliente e calcule o valor do crédito, 
de acordo com a tabela a seguir. Mostre o saldo médio e o valor do crédito.
*/

/*
Utilize formulário para receber os dados 
e mostrar a saída solicitada, a não utilização de formulário irá invalidar a resposta.
*/

"use strict"

document.getElementById("btn").addEventListener("click", function(){
    let salario = Number(document.getElementById("salario").value);
    let credito;
    let msg = ""

    if(salario > 400){
        credito = salario*0.3;
    }else if(salario >= 400 && salario >= 300){
        credito = salario*0.25;
    }else if(salario >= 200){
        credito = salario*0.1;
    }else{
        msg = "Não posui crédito"
    }

    document.getElementById("credito").value = credito;
});



