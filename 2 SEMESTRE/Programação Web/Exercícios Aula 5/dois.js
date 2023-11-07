"use strict"
document.querySelector("#btn").addEventListener("click", function(){
    let num = Number(document.querySelector("#num").value);
    let resp = document.querySelector("#res");
    resp.value = calcNum(num);
})

function calcNum(num){
    if(num % 2 == 0){
        return("par");
    }else{
        return("impar");
    }
}