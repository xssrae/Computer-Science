"use strict"

document.querySelector("#btn").addEventListener("click", function(){
    let altura = Number(document.querySelector("#altura").value);
    let peso = Number(document.querySelector("#peso").value);
    let msg = "";
    let imc = peso/(altura*altura);

    if(document.querySelector("#sexM").checked){
        if(imc < 20.7){
            msg = "abaixo do peso";
        }else if(imc => 20.7 && imc < 26.4){
            msg = "normal";
        }else if(imc => 26.4 && imc < 27.8){
            msg = "marginalmente acima do peso";
        }else if(imc => 27.8 && imc < 31.1){
            msg = "acima do peso";
        }else{
            msg = "obeso";
        }
    }else{
        if(imc < 19.1){
            msg = "abaixo do peso";
        }else if(imc => 19.1 && imc < 25.8){
            msg = "normal";
        }else if(imc => 25.8 && imc < 27.3){
            msg = "marginalmente acima do peso";
        }else if(imc => 27.3 && imc < 31.1){
            msg = "acima do peso";
        }else{
            msg = "obeso";
        }
    }
    document.querySelector("#imc").value = imc;
    document.querySelector("#condicao").value = msg;

});