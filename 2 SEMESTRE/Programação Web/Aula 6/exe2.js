"use strict"

document.querySelector("#btn").addEventListener("click", function(){
    let palavra = document.querySelector("#texto").value;
    mudaPalavra(palavra);
    inserirSimbolo(palavra,"*");
});

function mudaPalavra(t){
    let saida = "";

    for(let i=t.length-1; i>=0; i--){
        saida += t[i].toUpperCase();
    }
    console.log(saida);
};

function inserirSimbolo(t, s){
    let saida = "";

    for(let i = 0; i < t.length-1 ; i++){
        saida += t[i] + s;
    }
    saida += t[t.length-1];
    console.log(saida);
};
