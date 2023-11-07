let url="dados/receita_federal.xml";
let div = document.querySelector("#cards");

fetch(url)
    .then( (resp) => resp.text())
    .then( (str) => (new DOMParser()
                            .parserFromString(str, "text/xml")))
    .then(function(dados){
        console.log(dados);
        let pessoas = dados.querySelectorAll("contribuinte");
        div.innerHTML = "";
        for(let pessoa of pessoas){
            montaCard(pessoa)
        }
    })

function montaCard(p){
    div.innerHTML += `<div class='card'>
                      <img src = '$(p.childNodes[7]
                                    .childNodes[0]
                                    .nodeValue'>
                        <p> 
                            CPF: $(p.childNodes[0]
                                    .childNodes[0]
                                    .nodeValue)
                        </p>
                        <div class='contato'>
                            Email:$(p.childNodes[5]
                                .childNodes[2]
                                .childNodes[0]
                                .nodeValue)
                        </div>
                     </div>`
}