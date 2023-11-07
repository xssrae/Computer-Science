let num = document.querySelector("#txtnum")

function validarValor(event) {

    if ((event.charCode >= 48 && event.charCode <= 57) || event.charCode == 46) {
        saida = true
    }
    else {
        event.preventDefault()
    }
}


num.addEventListener("keypress", validarValor)

document.querySelector("#botao").addEventListener("click", function(){
    somaValores()
})


function somaValores(){

    var valor = Number(num.value)
    var soma = 0
    for (let i = 1; i<= valor ; i++) {
        
        soma = soma + i
    }

    document.querySelector("#txtsoma").value = soma

}