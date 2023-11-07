let dh = new Date();
let ds = dh.getDay();

switch(ds){   // método para ultilizar em casos em que o "==" se tornar repetitivo
    case 0: alert("Domingo"); break;
    case 1: alert("Segunda"); break;
    case 2: alert("Terça"); break;
    case 3: alert("Quarta"); break;
    case 4: alert("Quinta"); break;
    case 5: alert("Sexta"); break;
    case 6: alert("Sábado"); break;

}