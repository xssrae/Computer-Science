export class Bolinha{
    constructor(x,y){
        this.x = x;
        this.y = y;
    }

    setX(v){this.x = v;}
    getX(){return this.x;}

    set by(v) {this.y = v}
    get by() {return this.y}
}