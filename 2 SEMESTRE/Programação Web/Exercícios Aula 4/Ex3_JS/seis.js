//6 - Faça um script que leia três notas reais, calcule e mostre a média dessas notas


"use strict"

let media;
let n1 = parseFloat(prompt("Digite a 1ª nota: "));
let n2 = parseFloat(prompt("Digite a 2ª nota: "));
let n3 = parseFloat(prompt("Digite a 3ª nota: "));
let n4 = parseFloat(prompt("Digite a 4ª nota: "));

media = (n1+n2+n3+n4)/4;


alert("A média das notas é: " + media);