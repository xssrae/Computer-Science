/*Faça um script que receba o raio de uma esfera, calcule e mostre o volume de uma esfera. 
/*Sabe-se que V = 3/4 * PI * R3. Utilize prompt para ler os dados e alert para a resposta*/


"use strict";
let volume;
let raio = Number(prompt("Informe o raio: "));

volume = 3/4*3.14*(raio**3);

alert("O volume da esfera é: " + volume);

    