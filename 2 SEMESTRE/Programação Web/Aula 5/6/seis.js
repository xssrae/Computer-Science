let botao = document.getElementById("btn");
let div = document.querySelector("#relatorio");

botao.addEventListener("click", function(){
    let tab = Number(prompt("Digite tab"));

    for (let i=0 ; i <= 10; i ++){
        div.innerHTML += `${tab} X ${i} = ${tab * i}<br>`;} 
    });
    alert(tab); 