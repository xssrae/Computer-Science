"use strict"
document.querySelector("#btn").addEventListener("click", function(){
    let n1 = Number(document.querySelector("#n1").value);
    let n2 = Number(document.querySelector("#n2").value);
    let resp = document.querySelector("#res");
    resp.value = comparaNum(n1,n2);
})

function comparaNum(n1,n2){
    if(n1 > n2){
        return(`${n1} é maior`);
    }else if(n1 < n2){
        return(`${n2} é maior`);
    }else{
        return(`${n1} e ${n2} são iguais`);
    }
};
