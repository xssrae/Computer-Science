let valorCadastro = document.querySelector("#texto")
let listaCastro = []
let out = document.querySelector("#saida")

document.querySelector("#btn1").addEventListener("click", function(){

    listaCastro.push(valorCadastro.value)
    console.log(listaCastro)
    valorCadastro.value = ""
    alert("Valor Atribuido")
})


document.querySelector("#btn2").addEventListener("click", function(){
    exibir()
})


function exibir() {

    
    let tabela = document.createElement("table")
    let cabe1 = document.createElement("th")
    let cabe2 = document.createElement("th")
    

    out.appendChild(tabela)
    tabela.appendChild(cabe1)
    tabela.appendChild(cabe2)

    cabe1.innerText = "Índice"
    cabe2.innerText = "Nome"

    cabe1.classList.add("cab")
    cabe2.classList.add("cab")
    

    for(let i =0; i < listaCastro.length; i++){

        let linha = document.createElement("tr")
        let coluna1 = document.createElement("td")
        let coluna2 = document.createElement("td")
        

        console.log(i + 1)
        console.log(listaCastro[i]) 

        tabela.appendChild(linha)
        tabela.appendChild(coluna1)
        tabela.appendChild(coluna2)

        coluna1.innerText =  i + 1
        coluna2.innerText = listaCastro[i]

    
        coluna1.classList.add("cont")
        coluna2.classList.add("cont")
        

    }


}