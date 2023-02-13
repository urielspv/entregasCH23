//sesion con Felipe Masqeda teutiizar, mudularizar, coigo limpio,



/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/ 


    /*
    -Nombre descriptivo y evoque al funcionamiento de ese bloque de codigo
    -Datos de entrada (parametros)
    -Procesos o instrucciones a ejecutar
    -salida

    */


    //Fncion directa
   function agregarCarritoCompra(){
    //Lo que hace mi funcion

   }

   //invocar fncion
   agregarCarritoCompra();

   //Funcion anonima

   let x = function(){
    let valor = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta es una fncion anonima: ",suma);

   }

   //Hoisting
   console.log(edad);
   let edad = "30";

   //llamada a funion anonima
   x();

//fncion

function division (parametro1, parametro2){
    let resultado = parametro1/parametro2;
    
    console.log(resultado);
}

division(88,10);


/*
Tipos de funciones:
    -Funciones directas() - nombre (comunes)
    -Funciones anonimas - viven pegadas a na variable o constante
    -Funciones como metodos (para especficar que hace mi objeto)
    -Funciones como constructores (para construir o crear un objeto)
*/ 


//Funciones flecha

//Sintaxis de una ncion flecha

function suma(a,b){
    let sum1 = a + b;
    console.log(sum1);



}

const suma = (a,b) => a + b;


const sumarMultiplicar = (a,b) =>{
    const sum = a+ b;
    const res = sum * 2;
    console.log(res)
}

//Return
/*La senencia return finaliza la ejecucion y especifica un valor para ser devuelto a quien llama a la funcion.OO lo que es 
lo mismo, usamos retrn para finalizar y tambien para asignar y tambien pde asignar el resultado  una variable

si no usamos el return, la funcion nunca termina , y si qyermos usar e resultado para algo despues, no se podra*/     





function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("El area de mi cuadrado es:",area );
    return area;|
}

let resultado = areaCuadrado();
