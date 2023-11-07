"use strict"

// se usar o querySelector para pegar um ID utilize a #



let num_secreto;
let tentativas = 0;

num_secreto = sortearNum(100)

function sortearNum(n) {
    return Math.round(Math.random() * n);
}

document.querySelector("#txtchute").addEventListener("keypress", function (event) {

    if (event.keyCode == 13) {
        verificaJogada();
    }

})



function verificaJogada() {

    let msg = document.querySelector("#msg");
    let dica = document.querySelector("#txtdica")
    tentativas++
    let chute = Number(document.querySelector("#txtchute").value)

    if (chute < num_secreto) {
        dica.value = "O num secreto é maior"
    } else if (chute > num_secreto) {
        dica.value = "O num secreto é menor"
    } else {
        msg.innerHTML = `<h1>Parabéns, vc acertou em ${tentativas} tentativas</h1>`

        setTimeout(function(){
            if(confirm("Deseja jogar novamente?")){
                num_secreto = sortearNum(100)
                window.location.reload()
    
            }
        },2000)
        
    }
}