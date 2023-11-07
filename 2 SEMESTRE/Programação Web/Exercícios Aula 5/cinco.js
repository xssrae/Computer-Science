"use strict"
document.querySelector("#btn").addEventListener("click",function(){
    let n1 = Number(document.querySelector("#n1").value);
    let n2 = Number(document.querySelector("#n2").value);
    let n3 = Number(document.querySelector("#n3").value);
    let media = (n1+n2+n3)/3;
    let msg = "";
    if(media >= 6){
        msg = "APROVADO";
    }else if(media >= 3 && media < 6){
        msg = "EXAME";
    }else{
        msg = "REPROVADO";
    }
    document.querySelector("#resultado").value = msg;
})