"use strict"

let timer = 0;
let segundos = 0;
let minutos = 0;
let horas = 0;
document.querySelector("#btn1").addEventListener("click".function(){
    exibirDiv("divCronometro");
    timer++;    
})

function exibirDiv(div){
    let tagsdiv = document.querySelectorAll("div");

    for (let i = 0; i < tagsdiv.length; i++){
        if (tagsdiv[i].id.indexOf("div") >= 0){
            if (tagsdiv[i] == div){
                tagsdiv[i].style.display = "block";
            }else{
                tagsdiv[i].style.display = "none";
            }
        }
    }
}

function exibirImagem(){
    let img = `img${contImagem}.jpg`;
    document.querySelector("#imagens").src = `imagens/${img}`;
}