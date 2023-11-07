"use strict"

document.querySelector("#calcular").addEventListener("click", function(){
    let valor = Number(document.querySelector("#valor").value);
    let resultado = calculoFatorial(valor);
    document.querySelector("#resultado").innerHTML = resultado;  
})

function calculoFatorial(n){
    let fatorial;
    for(let i=1; i <= n; i++){
        fatorial = n*n-1;
    }
    console.log(fatorial);
    return fatorial
}