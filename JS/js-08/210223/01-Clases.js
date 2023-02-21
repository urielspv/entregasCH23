class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    get getNombre(){
        return this.nombre;
    }
    set setNombre(name){
        this.nombre = name; 
    }

    get getApellido(){
        return this.apellido;

    }

    set setApellido(apellido){
        this.apellido = apellido;
    }

    nombreCompleto(){
        return this.nombre +' '+ this.apellido;
    }
}


let persona1 = new Persona('Uriel','Pérez');
console.log(persona1);

let persona2 = new Persona('Maria','Jimenez');
console.log(persona2);


let persona3 = new Persona('Johony','Deep');
console.log(persona3)


class Empleado extends Persona{
    constructor(depa,name,ape){
        super(name,ape);
        this.depa = depa;
    }

    set setDepa(depa){
        this.depa = depa;
    }

    get getDepa(){
        return this.depa;
    }

    //sobreescritura de metodos delpadre 
    nombreCompleto(){
        return super.nombreCompleto() + ' ' + this.depa;
    }
}



let persona4 = new Persona('Ursulo','Galván');
console.log(persona4);
let Empleado1 = new Empleado(243,'Urucuato','Limon');
console.log(Empleado.getNombre);
