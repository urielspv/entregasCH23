class operacionesAritmeticas{
    numero0 = 0;
    numero1 = 0;

    // sumar(a,b){
    //     return a+b;
    // }
    constructor(){
        this.numero0 = 4;
        this.numero1 = 32;
    }

    sumar(){
        return this.numero0 + this.numero1;
    }
}

let obj2;
obj2 = new operacionesAritmeticas();

console.log(obj2.sumar(2,3));


obj2 = new operacionesAritmeticas();
let a;

a = obj2.numero0;


let obj3 = new operacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;

console.log(obj3.sumar(obj3.numero0,obj3.numero1));


let obj4 = new operacionesAritmeticas();

 
console.log(obj4.sumar());




