"use strict"
let nomes = [];
document.querySelector("btn1").addEventListener("click",function(){
    cadNome();
})

document.querySelector("#btn2").addEventListener("click", function(){
    exibirDados();
});

function cadNome(){
    nomes.push(document.querySelector("#texto").value);
}

function exibirDados(){
    let saida = "<table border = '1'>";
    for(let i = 0; i < nomes.length; i++){
        saida += `<tr class = 'count'>`;
        saida += `<td>${i+1}</td> <td>${nomes[i]}</td>`
        saida += "</tr>";
    }
    saida += `</table>`;
    document.querySelector("#saida").innerHTML = saida;
};


