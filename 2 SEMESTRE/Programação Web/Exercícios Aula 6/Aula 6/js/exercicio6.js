let inNome = document.querySelector("#nome")
let inRgm = document.querySelector("#rgm")
let inNotaParc = document.querySelector("#nota_parc")
let inNotaExer = document.querySelector("#nota_exer")
let inNotaProj = document.querySelector("#nota_proj")
let inNotaReg = document.querySelector("#nota_regi")

let saidaDiv = document.querySelector("#resposta")

function validarValor(event) {

    if ((event.charCode >= 48 && event.charCode <= 57) || event.charCode == 46) {
        saida = true
    }
    else {
        event.preventDefault()
    }
}


inRgm.addEventListener("keypress", validarValor)
inNotaParc.addEventListener("keypress", validarValor)
inNotaExer.addEventListener("keypress", validarValor)
inNotaProj.addEventListener("keypress", validarValor)
inNotaReg.addEventListener("keypress", validarValor)



document.querySelector("#btn1").addEventListener("click", function () {
    if (inNome.value == "" || inRgm.value == "" || inNotaParc.value == "" || inNotaExer.value == "" || inNotaProj.value == "" || inNotaReg.value == "") {
        alert("Digite todos os campos")
    }
    else if (inNotaParc.value < 0 || inNotaParc.value > 2) {
        alert("A Nota Parcial deve ser entre 0 e 2")
    }
    else if (inNotaExer.value < 0 || inNotaExer.value > 1) {
        alert("A Nota de Exercicio deve ser entre 0 e 1")
    }
    else if (inNotaProj.value < 0 || inNotaProj.value > 2) {
        alert("A Nota de Projeto deve ser entre 0 e 2")
    }
    else if (inNotaReg.value < 0 || inNotaReg.value > 5) {
        alert("A Nota de Projeto deve ser entre 0 e 5")
    }
    else {

        cadastra()
        inNome.value = ""
        inRgm.value = ""
        inNotaParc.value = ""
        inNotaExer.value = ""
        inNotaProj.value = ""
        inNotaReg.value = ""
    }


})



document.querySelector("#btn2").addEventListener("click", function () {
    exibirCadastro()
})


let nome = []

let rgm = []

let notaParcial = []

let notaExercicio = []

let notaRegimantal = []

let notaProjeto = []

let notaFinal = []

function cadastra() {

    nome.push(inNome.value)
    rgm.push(inRgm.value)
    notaParcial.push(inNotaParc.value)
    notaExercicio.push(inNotaExer.value)
    notaRegimantal.push(inNotaReg.value)
    notaProjeto.push(inNotaProj.value)

    notaFinal.push(Number(inNotaParc.value) + Number(inNotaExer.value) + Number(inNotaReg.value) + Number(inNotaProj.value))
    console.log(notaFinal)
}


function exibirCadastro() {



    let tabela = document.createElement("table")

    let cNome = document.createElement("th")
    let cRgm = document.createElement("th")
    let cNotaP = document.createElement("th")
    let cNoataE = document.createElement("th")
    let cNoataR = document.createElement("th")
    let cNoataProj = document.createElement("th")
    let cNotaFinal = document.createElement("th")
    let cStatus = document.createElement("th")

    let linha = document.createElement("tr")

    saidaDiv.appendChild(tabela)



    tabela.appendChild(cNome)
    tabela.appendChild(cRgm)
    tabela.appendChild(cNotaP)
    tabela.appendChild(cNoataE)
    tabela.appendChild(cNoataR)
    tabela.appendChild(cNoataProj)
    tabela.appendChild(cNotaFinal)
    tabela.appendChild(cStatus)


    cNome.innerHTML = "Nome do aluno"
    cRgm.innerHTML = "RGM do Aluno"
    cNotaP.innerHTML = "Nota Parcial"
    cNoataE.innerHTML = "Nota de Exercicio"
    cNoataR.innerHTML = "Nota Regimetal"
    cNoataProj.innerHTML = "Nota de Projeto"
    cNotaFinal.innerHTML = "Nota Final"
    cStatus.innerHTML = "Conceito Final"

    tabela.appendChild(linha)

    for (let i = 0; i < nome.length; i++) {
        let linha = document.createElement("tr")
        let outNome = document.createElement("td")
        let outRgm = document.createElement("td")
        let outNotaP = document.createElement("td")
        let outNoataE = document.createElement("td")
        let outNoataR = document.createElement("td")
        let outNoataProj = document.createElement("td")
        let outNotaFinal = document.createElement("td")
        let outStatus = document.createElement("td")

        tabela.appendChild(outNome)
        tabela.appendChild(outRgm)
        tabela.appendChild(outNotaP)
        tabela.appendChild(outNoataE)
        tabela.appendChild(outNoataR)
        tabela.appendChild(outNoataProj)
        tabela.appendChild(outNotaFinal)
        tabela.appendChild(outStatus)

        outNome.innerHTML = nome[i]
        outRgm.innerHTML = rgm[i]
        outNotaP.innerHTML = notaParcial[i]
        outNoataE.innerHTML = notaExercicio[i]
        outNoataR.innerHTML = notaRegimantal[i]
        outNoataProj.innerHTML = notaProjeto[i]
        outNotaFinal.innerHTML = notaFinal[i]

        let conceito = conceitoFinal(notaFinal[i])

        console.log(conceito)

        if (conceito == "APROVADO") {

            outStatus.innerHTML = conceito
            outStatus.classList.add("aprovado")
            outNotaFinal.classList.add("aprovado")

        } else if (conceito == "AVALIÇÃO FINAL") {

            outStatus.innerHTML = conceito
            outStatus.classList.add("exame")
            outNotaFinal.classList.add("exame")

        } else {

            outStatus.innerHTML = conceito
            outStatus.classList.add("reprovado")
            outNotaFinal.classList.add("reprovado")

        }
        tabela.appendChild(linha)
    }



}


function conceitoFinal(nota) {
    console.log(nota)
    if (nota >= 6) {
        return "APROVADO"
    } else if (nota >= 4) {
        return "AVALIÇÃO FINAL"
    } else {
        return "REPROVADO"
    }

}