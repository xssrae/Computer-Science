let num0 = document.querySelector("#btn_0")
let num1 = document.querySelector("#btn_1")
let num2 = document.querySelector("#btn_2")
let num3 = document.querySelector("#btn_3")
let num4 = document.querySelector("#btn_4")
let num5 = document.querySelector("#btn_5")
let num6 = document.querySelector("#btn_6")
let num7 = document.querySelector("#btn_7")
let num8 = document.querySelector("#btn_8")
let num9 = document.querySelector("#btn_9")
let numPonto = document.querySelector("#btn_p")

let tela = document.querySelector("#res")

let teclaPow = document.querySelector("#btn_pow")
let teclaRound = document.querySelector("#btn_round")
let teclaSqrt = document.querySelector("#btn_sqrt")

let teclaDiv = document.querySelector("#btn_div")
let teclaMul = document.querySelector("#btn_mul")
let teclaSub = document.querySelector("#btn_sub")
let teclaSum = document.querySelector("#btn_sum")

let teclaIgual = document.querySelector("#btn_igual")

let teclaC = document.querySelector("#btn_c")



let entrada = ""
let saida = 0
let memoriaNumerica = []
let memoriaOperacao = []


numPonto.addEventListener("click", function () {
    btnNumero(".")
})

num0.addEventListener("click", function () {
    btnNumero("0")
})

num1.addEventListener("click", function () {
    btnNumero("1")
})
num2.addEventListener("click", function () {
    btnNumero("2")

})
num3.addEventListener("click", function () {
    btnNumero("3")
})
num4.addEventListener("click", function () {
    btnNumero("4")
})
num5.addEventListener("click", function () {
    btnNumero("5")
})
num6.addEventListener("click", function () {
    btnNumero("6")
})
num7.addEventListener("click", function () {
    btnNumero("7")
})
num8.addEventListener("click", function () {
    btnNumero("8")
})
num9.addEventListener("click", function () {
    btnNumero("9")
})


teclaC.addEventListener("click", function () {
    entrada = ""
    tela.value = ""
    memoriaNumerica = []
    memoriaOperacao = []
    saida = 0
})


function btnNumero(numero) {
    entrada = entrada + numero
    tela.value = entrada
}


function btnOperador(operador) {
    memoriaNumerica.push(Number(entrada))
    entrada = ""
    tela.value = ""
    memoriaOperacao.push(operador)
    console.log(memoriaOperacao)

}

teclaDiv.addEventListener("click", function () {
    btnOperador("div")
})
teclaMul.addEventListener("click", function () {
    btnOperador("multi")
})
teclaSub.addEventListener("click", function () {
    btnOperador("sub")
})
teclaSum.addEventListener("click", function () {
    btnOperador("soma")
})



teclaIgual.addEventListener("click", function () {

    memoriaNumerica.push(Number(entrada))
    entrada = ""
    tela.value = ""
   

    console.log("Saida: " + saida)

    for (let i = 0; i < memoriaNumerica.length; i++) {



        console.log("Loop: " + i)

        if (saida == 0) {
            saida = memoriaNumerica[i]
            console.log("Saida: " + saida)
        }
        else {
            console.log(memoriaOperacao[i - 1])
            console.log("Saida: " + saida)

            let caso = ""

            if(memoriaOperacao[i - 1] ==  undefined){
                caso = memoriaOperacao[i]
            }
            else{
                caso = memoriaOperacao[i - 1] 
            }

            switch (caso) {

                case "multi":
                    saida = saida * memoriaNumerica[i]
                    break
                case "div":
                    saida = saida / memoriaNumerica[i]
                    break
                case "soma":
                    saida = saida + memoriaNumerica[i]
                    break
                case "sub":
                    saida = saida - memoriaNumerica[i]
                    break
            }


        }

    }

    console.log("Saida: " + saida)
    console.log("Memoria numerica: " + memoriaNumerica)
    console.log("Memoria Operação: " + memoriaOperacao)

    tela.value = saida
    memoriaNumerica = []
   
    memoriaOperacao = []

    console.log("Saida: " + saida)
    console.log("Memoria numerica: " + memoriaNumerica)
    console.log("Memoria Operação: " + memoriaOperacao)

})



teclaPow.addEventListener("click", function () {
    memoriaNumerica.push(Number(entrada))
    entrada = ""
    tela.value = ""
    let exp = prompt("Digite o expoente :")

    saida = Math.pow(memoriaNumerica[memoriaNumerica.length-1],Number(exp))

    console.log(saida)
    tela.value = saida
})




teclaRound.addEventListener("click", function () {
    memoriaNumerica.push(Number(entrada))
    entrada = ""
    tela.value = ""
    let saida = Math.round(memoriaNumerica[memoriaNumerica.length - 1])
    console.log(saida)
    tela.value = saida
    memoriaNumerica = []
    memoriaOperacao = []
})

teclaSqrt.addEventListener("click", function () {

    memoriaNumerica.push(Number(entrada))
    entrada = ""
    tela.value = ""
    let saida = Math.sqrt(memoriaNumerica[memoriaNumerica.length - 1])
    console.log(saida)
    tela.value = saida
    memoriaNumerica = []
    memoriaOperacao = []
})
