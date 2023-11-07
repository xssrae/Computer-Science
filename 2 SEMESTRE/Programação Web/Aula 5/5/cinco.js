"use strict"

let soma = 0;
let num;
while(true){
    num = Number(prompt("Digite o número:"));
    if (num <= 0){
        break;
    }
    soma += num;
}
alert(soma);