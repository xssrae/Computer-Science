document.querySelector("#botao").addEventListener("click", function(){
    let num = Number(document.querySelector("#txtnum").value);
    let res = document.querySelector("#txtfat");
    let fat = 1;

    for(let i=1; i <= num; i++){
        fat = fat*i;
    }
    res.value = fat;
});