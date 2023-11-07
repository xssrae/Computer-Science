"use strict"
let nomes = [];

document.querySelector("#cadastrar").addEventListener("click",function(){
    cadNome();
})

document.querySelector("#exibir").addEventListener("click", function(){
    exibirDados();
});

function cadNome(){
    nomes.push(document.querySelector("#nome").value);
}

function exibirDados(){
    let saida = "<table border = '1'>";
    for(let i = 0; i < nomes.length; i++){
        saida += `<tr class = 'count'>`;
        saida += `<td>${i+1}</td> <td>${nomes[i]}</td>`;
        saida += "</tr>";
    }   
    saida += "</table>";
    document.getElementById("saida").innerHTML = saida;
};