"use strict"

let numSecreto;
let tentativas;
numSecreto = sorterNum(100);

function sortearNum(n){
    return Math.round(Math.random() * n);
}

document.querySelector("#txtchute").addEventListener("keypress",function(event){
    if (event.key == "Enter"){
        validarJogada();
    }
    function validarJogada(){
        let chute = Number(document.querySelector("#txtchute").value)
        let dica = document.querySelector("#txtdica");
        let msg = document.querySelector("#msg");
        tentativas++;
        if (chute > numSecreto){
            dica.value = "o num sorteado é menor";
        }else if (chute < numSecreto){
            dica.value = "o num sorteado é maior";
        }else{
            msg.innerHTML = <h1>Parabéns, vc acertou em `${tentativas}` tentativas</h1>
        }
    }
});