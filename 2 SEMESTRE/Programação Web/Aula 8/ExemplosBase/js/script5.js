import { Bolinha } from "./Bolinha.js";

let b1 = new Bolinha(10,20);
let b2 = new Bolinha(20,30);
let p1 = new Pessoa("Raquel", 19);

b1.setX(30);
alert(b1.getX());

b1.by = 20;
alert(b1.by);