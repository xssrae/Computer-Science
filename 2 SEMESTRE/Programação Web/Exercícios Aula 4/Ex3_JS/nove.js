// 9 - Faça um script que leia o nome de uma pessoa, o ano de nascimento dessa pessoa e o ano atual,
// calcule e mostre a idade dessa pessoa e seu nome em linhas separadas.

"use strict"

let nome = prompt("Digite um nome: ");
let anoNasc = parseInt(prompt("Digite o ano de nascimento: "));
let anoAtual = parseInt(prompt("Digite o ano atual: "));
let idade = anoAtual - anoNasc;

alert(`O nome da pessoa é: ${nome} \nA idade da pessoa é: ${idade} anos`)