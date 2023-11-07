"use strict";

let a = parseInt(prompt("Digite A: "));
let b = parseInt(prompt("Digite B: "));
let c = parseInt(prompt("Digite C: "));

let delta = b**2 - 4 * a * c;

let r1 = (-b + Math.sqrt(delta)) /(2*a);
let r2 = (-b - Math.sqrt(delta)) /(2*a);

alert(`R1 = ${r1} \nR2 = ${r2}`);

