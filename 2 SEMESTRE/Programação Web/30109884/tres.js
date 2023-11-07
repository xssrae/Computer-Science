/*
Faça um script que receba vários salários, 
calcule e mostre a média dos salários digitados. Finalize a digitação com o valor 0.

OBS: Utilize prompt para ler os dados e apresente a saída utilizando uma DIV no HTML,
 a não utilização destas regras irá invalidar a resposta.
*/
"use strict";
let acumulador = 0;
let contador = 0
let i = 0;
let saida;
while(i<=0){
    let salario = Number(prompt("Informe os salários: "));
    if(salario == 0){
        i+=1;
        saida = `<table border = '1'> <tr> <td>${contador}</td> <td>${media}</td> </tr> </table>`;
    }else{
        acumulador += salario;
        contador += 1;
    }
    document.getElementById("saida").innerHTML = saida;
}
