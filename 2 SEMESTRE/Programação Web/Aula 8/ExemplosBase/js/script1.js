//ORIENTAÇÃO A OBJETOS

let bolinha = {
    cor : "red",
    x : Math.round(Math.random()*500), //posição em tela
    y : Math.round(Math.random()*500),
    raio : Math.round(Math.random()*40) + 10 // formato da bolinha
}

function desenhar(){
    let canvas = document.querySelector("#canvas");
    let ctx = canvas.getContext("2d");
    ctx.beginPath();
    ctx.arc(bolinha.x,bolinha.y, bolinha.raio, 0,2*Math.PI);
    ctx.fillStyle = bolinha.cor;
    ctx.fill();
}

desenhar();