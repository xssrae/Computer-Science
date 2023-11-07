"use strict"

document.querySelector("#btn").addEventListener("click", function(){
    let num = Number(document.querySelector("#txtnum").value);
    let resp1 = document.querySelector("#res");
    resp1.value = quadrado(num);
    
});

//função que calcula um número ao quadrado

//função clássica
function quadrado(n){
    return n**2;
}

//arrow function
let dobra = (n) => {
    return n**2;
}