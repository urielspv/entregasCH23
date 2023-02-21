//clase adivinador


class Adivinador5000{
    constructor (numSec){
        this.intentos=[];
        this.numSecreto = numSec;
        this.intentoActual;
    }
//metodo que compara el numero ingresado con el numero secreto
    comparar(){
        if(this.intentoActual === this.numSecreto){
            alert("Excelente adivinaste el numero "+ this.intentoActual + " despues de estos intentos " + this.intentos);
            return false;
        }
        else{
            alert("Estas equivocado vuelve a intentarlo ");
            return true;
        }
    }

//metodo que solicita el numero y verifique que esté entre 0 y 100
    pideNumero(){
        this.intentoActual = Number(prompt("Introduce un numero del 1-100: "));
        if((this.intentoActual) > 0 && (this.intentoActual<=100)){
            this.intentos.push(this.intentoActual);
        }
        else{
            alert("Error en el ingreso del mumero intentalo otra vez: ");
            this.pideNumero();
       }
    }
}



//Instancia del objeto pasando solo el numero secreto
let adiv = new Adivinador5000(45);

//se hará hasta que se encuentre el numero secreto

do{
    adiv.pideNumero();

}while(adiv.comparar())
