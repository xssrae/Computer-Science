"use strict"

//Elabore um script que leia o valor (preço) de um produto e a condição de pagamento conforme tabela
//abaixo. Exiba ao final do script, o valor real do produto e o valor a ser pago (conforme tabela), leia os
//valores por meio de um formulário e mostre as mensagens em campos de texto do form.

document.querySelector("#btn").addEventListener("click", function(){
    let produto = Number(document.querySelector("#produto").value);
    let pagamento = document.querySelector("#pagamento");
    let total;

    if(pagamento == "1"){
        total = produto - (produto*0.1);
    }else if(pagamento == "2"){
        total = produto - (produto*0.05);
    }else{
        total = (produto + (produto*0.1))/2;
    }
    document.querySelector("#valor").value = produto;
    document.querySelector("#total").value = total;
});