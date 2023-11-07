/*
Crie um arquivo HTML que utilizando JavaScript leia a base e a altura de um retângulo (por meio de um
formulário), calcule sua área e apresente os resultados em um campo de texto ou textarea.
*/
"use strict"

document.querySelector("#btn").addEventListener("click", function(){
    let altura = Number(document.querySelector("#altura").value);
    let base = Number(document.querySelector("#base").value);
    let area = (base*altura)/2;
    let resultado = document.querySelector("#resultado").value = area

});