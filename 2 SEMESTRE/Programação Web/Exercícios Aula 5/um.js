"use strict"
document.querySelector("#btn").addEventListener("click", function(){
    let compra = Number(document.querySelector("#compra").value);
    let parcela = document.querySelector("#parcela"); 
    let total;

    if (parcela == 1){
        total = compra;
    }else if(parcela == 2){
        total = (compra + (compra*0,3))/2;
    }else{
        total = (compra + (compra*0,7))/4;
    }
    document.querySelector("#total").value = total.toFixed(2);
});