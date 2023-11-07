"use strict"

let elemento1 = document.getElementById("txtv1");
let elemento2 = document.getElementById("txtv2");

//arrow function

let validarDados = (event) => {
    console.log(event.charCode);
    return ((event.charCode >= 48 && event.charCode <= 57) || event.charCode == 48)? true : event.preventDefalt();
    eventpreventDefalt();
}

evento1.addEventListener("keypress" , validarDados)
evento2.addEventListener("keypress" , validarDados)

document.querySelector("#btn").addEventListener("click", function(){
    let v1 = Number(elemento1.value);
    let v2 = Number(elemento2.value);
    document.querySelector("#res".value = (v1+v2))
})