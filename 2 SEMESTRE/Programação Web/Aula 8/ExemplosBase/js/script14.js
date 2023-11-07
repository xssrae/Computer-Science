$("button1").on("click", function(){  // acessando um id do html
    localStorage.setItem("rgm", $("rgm").val());
});

$("button2").on("click", function(){  // acessando um id do html
    if(localStorage.length > 0){
        alert(localStorage.getItem("rgm"))
    }else{
        alert("erro")
    }
});