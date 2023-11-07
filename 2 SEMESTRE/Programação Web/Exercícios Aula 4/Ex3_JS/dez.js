// 10 - Faça um script que receba a altura de um degrau de uma escada e a altura que um pedreiro
//deseja alcançar utilizando essa escada, calcule e mostre quantos degraus ele deverá subir para
//atingir seu objetivo, os valores fornecidos devem ser em metros.

"use strict"

let degrau = Number(prompt('Digite a altura do degrau: '));
let altura = Number(prompt('Digite a altura desejada: '));
let qtdeDegrais

//Supondo que você quer subir 2 metros e o degrau tem 10 centímetros (0,1 m)
//Altura que você quer alcançar = 2 m
//Altura do degrau = 10 cm = 0,1 m
//Número de degraus = 2 / 0,1 = 20 degraus

degrau = degrau/100;
qtdeDegrais = altura/degrau;

alert(`A quantidade necesária de degrais é: ${qtdeDegrais}`);