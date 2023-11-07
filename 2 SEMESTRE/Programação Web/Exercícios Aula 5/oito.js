"use strict"
document.querySelector("#btn").addEventListener("click",function(){
    let salario = Number(document.querySelector("#salario").value);
    let impRenda;
    
    if(salario < 1434){
        document.querySelector("#impRenda").value = "ISENTO";
    }else if(salario <= 2150){
        impRenda = salario*0.075;
    }else if(salario <= 2822){
        impRenda = salario*0.15;
    }else if(salario <= 3582){
        impRenda = salario*0.225;
    }else{
        impRenda = salario*0.275
    }

    document.querySelector("#impRenda").value = impRenda;
});