let botao1 = document.querySelector("#btn1")
let botao2 = document.querySelector("#btn2")
let botao3 = document.querySelector("#btn3")

var numInicio = 0
var numImg = 0

botao1.addEventListener("click", function () {
    exibirDiv("divCronometro")

    if(numInicio == 0){
        numInicio =  setInterval(function(){

            numInicio++
            document.querySelector("#txtNum").innerHTML = numInicio
            document.querySelector("#txtNum").style.display = "block"
            console.log(numInicio)
        })
    }
   
    
    
})


botao2.addEventListener("click", function () {
    exibirDiv("divSlide")
    
    document.querySelector("#conteudo").style.display = "block"
    
})

document.querySelector("#ant").addEventListener("click",function(){
    if(numImg <= 1){
        numImg = 1
    }
    else{
        numImg--
    }
    console.log(numImg)
    document.querySelector("#imagens").src =`imagens/img${numImg}.jpg`
})

document.querySelector("#prox").addEventListener("click",function(){

    if(numImg >= 5){
        numImg = 5
    }
    else{
        numImg++
    }
    
    console.log(numImg)
    document.querySelector("#imagens").src =`imagens/img${numImg}.jpg`
})






botao3.addEventListener("click", function () {
    exibirDiv("divTabuada")
    document.querySelector("#restab").style.display = "block"
})



let valorTab = document.querySelector("#txtNumTab")

document.querySelector("#btntab").addEventListener("click", function () {
    
    let num = valorTab.value
    
    let tab = []
    let saida =""

    for(let i = 0;i<=10;i++){
        tab[i] =  `${num} x ${i} = ${num*i} <br>`
    }

    for(let i = 0;i<=10;i++){
        saida = saida + tab[i]
    }
    
    document.querySelector("#restab").innerHTML = saida

})


function exibirDiv(nomeDiv) {
    let vetDiv = document.querySelectorAll("div")
    console.log(vetDiv)

    for (let i = 0; i < vetDiv.length; i++) {
        console.log(nomeDiv)
        console.log(vetDiv[i])
        if (nomeDiv == vetDiv[i].id) {
            vetDiv[i].style.display = "block"
        } else {
            vetDiv[i].style.display = "none"
        }
    }

}