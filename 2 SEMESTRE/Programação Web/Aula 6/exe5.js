"use strict"

let x = new Array();
let frutas = [];

frutas = ["uva", "maça", "pera","banana", "ameixa"];

frutas.push("banana");
console.log(frutas);

let meses = ["jan", "fev", "mar", 'abr', "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"];

let dh = new Date();
alert(meses[dh.getMonth()]);

//FOR CLASSICO
for(let i=0; i < meses.length; i++ ){
    console.log(`${i+1} ${meses[i]}`)
}

//FOR... OF
for (let mes of meses){
    console.log(mes);
}

//FOR EACH
meses.forEach(function(mes, i){
    console.log(`${i+1} ${mes}`);
})

