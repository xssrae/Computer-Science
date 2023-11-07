let url = "https://randomuser.me/api/?format=json&results=10";

fetch(url)
    .then((resp) => resp.json())
    .then(function(json){
        console.log(json)
        let usuarios = json.results;
        let lista = document.getElementById("lista");
        usuarios.forEach(function(user){
            lista.innerHTML += `<img src = '${user.picture.large}'>
            <br>${user.name.first}<br>`
        });
    })


