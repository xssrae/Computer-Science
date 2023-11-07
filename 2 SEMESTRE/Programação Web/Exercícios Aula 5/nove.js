"use strict"
let res;
let n1 = Number(document.querySelector("#n1").value);
let n2 = Number(document.querySelector("#n2").value);

function exibirResultado() {
    let resposta = document.querySelector("#res");

    if (document.querySelector("#somar").onclick) {
        resposta = somar(n1,n2);
        console.log(resposta);
    }else if (document.querySelector("#subtrair").onclick) {
        resposta = subtrair(n1,n2);
    }else if (document.querySelector("#multiplicar").onclick) {
        resposta = multiplicar(n1,n2);
    }else if (document.querySelector("#dividir").onclick) {
        resposta = dividir(n1,n2)
    }
}

function somar(x, y) {
    let soma = x + y;
    return soma;
}

function subtrair(x, y) {
    let subtracao = x - y;
    return subtracao;
}

function multiplicar(x, y) {
    let multiplicacao = x * y;
    return multiplicacao;
}

function dividir(x, y) {
    let divisao = x / y;
    return divisao;
}
