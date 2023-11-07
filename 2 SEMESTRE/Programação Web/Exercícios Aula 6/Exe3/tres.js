"use strict"
let pMaiuscula = "";
let pEspaco = "";
let saida;
document.querySelector("#b1").addEventListener("click", function(){
    palavraMaiuscula(palavra);
});

document.querySelector("#b2").addEventListener("click",function(){
    inserirEspaço(palavra);
});

function palavraMaiuscula(palavra){

    palavra = document.getElementById("palavra").value; 
    saida += `<p>`
    for(let i = 0; i <= palavra.length; i++){
        pMaiuscula += (palavra[i].toUpperCase());
    }
    saida += `</p>`

    document.getElementById("Saida").innerHTML= saida;
}


function inserirEspaço(palavra){
    let espaco = " ";
    saida += `<p>`
    for(i=0; i < palavra.length-1; i++){
        pEspaco += palavra[i] + espaco;
    }
    pEspaco += palavra[i];

    saida += `</p>`
    document.getElementById('saida').innerHTML = pEspaco;
}

/*
function inserirSimbolo(t, s){
    let saida = "";

    for(let i = 0; i < t.length-1 ; i++){
        saida += t[i] + s;
    }
    saida += t[t.length-1];
    console.log(saida);
};
*/