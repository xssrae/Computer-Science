let entrada = document.querySelector("#txt_texto")
let saida = document.querySelector("#saida")
let mai = document.querySelector("#b1")
let sep = document.querySelector("#b2")


mai.addEventListener("click", function(){
    
    let palavra = entrada.value
    saida.innerHTML = palavra.toUpperCase()
   
})


sep.addEventListener("click", function(){
    
    let palavra = entrada.value

    let spt = palavra.split(" ")
    


   for(let i = 0; i < spt.length;i++){

    let ent = document.createElement("div")

    saida.appendChild(ent)

    ent.innerHTML = spt[i]


   }

    

})