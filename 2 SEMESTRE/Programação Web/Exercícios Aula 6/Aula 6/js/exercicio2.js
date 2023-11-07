let col = document.querySelector("#qtdcolunas")
let lin = document.querySelector("#qtdlinhas")
let out = document.querySelector("#saida")

col.addEventListener("keypress", validarValor)
lin.addEventListener("keypress", validarValor)

document.querySelector("#btn1").addEventListener("click", function () {
    criarTabela()
})


function validarValor(event) {

    if ((event.charCode >= 48 && event.charCode <= 57) || event.charCode == 46) {
        saida = true
    }
    else {
        event.preventDefault()
    }
}


function criarTabela() {

    let qtdColuna = Number(col.value)
    let qtdLinha = Number(lin.value)

    let tabela = document.createElement("table")
    out.appendChild(tabela)


    for (let x = 1; x <= qtdLinha; x++) {

        let linha = document.createElement("tr")
        tabela.appendChild(linha)
        for (let i = 1; i <= qtdColuna; i++) {

            let coluna = document.createElement("td")

            tabela.appendChild(coluna)

            coluna.innerText = `${x},${i}`

            //let linha = document.createElement("tr")

            if (i % 2 == 0) {
                coluna.classList.add("par")
            }
            else {
                coluna.classList.add("impar")
            }

        }


    }


    lin.value = ""
    col.value = ""


}