/*Ejercicio 1



*/

let names = ["Maria", "Antony", "Joy", "Juan"];

//parte 1

insertName(names,'Uriel');

console.log("[ ejercicio 1-1 ]La lista después de agregar dato: " + names);

//parte 2
let coincidencias = buscaCoincidencia(names,'Antony');

console.log("[ ejercicio 1-2 ]El resultado de la busqueda fue... " + coincidencias );


//parte 3
let names2 = ["Martha","Marco", "Juan","Fabricio","Bonifacio", "Perengano","Maria"];

let listaUnificada = unifica(names,names2);

console.log("[ ejercicio 1-3 ]La lista nueva con todos los nombres que coincide es: " + listaUnificada);


//parte 4
let tamanioCadenas = cuenta(names);

console.log("Estos son los tamaños de cada cadena: " + tamanioCadenas);





//Inserta el parametro name en la lista de nombres
function insertName( lista, name){
    lista.push(name);
}


//busca si el parametro name existe en la lista
function buscaCoincidencia(lista , name){
    let siExiste = false;
    for(let i = 0 ; i < lista.length; i++ ){
        
        
        if(lista[i] === name){
            siExiste = true;
        }
    }
    return siExiste;

}


//UNIICA EN UNA LISTA LOS NOMBRES QUE ESTÁN EN LAS 2 LISTAS

function unifica(listaA , listaB){
    let listaC = [];

    for(let i = 0 ; i < listaA.length ; i++ ){
        for(let k = 0 ; k < listaB.length ; k++){
            if(listaA[i] === listaB[k]){
                
                listaC.push(listaA[i]);
            }
        }
    }
    return listaC;
    

}

//Funcion que devuelve el tamaño de los strings dentro de un array

function cuenta(lista){
    let numeros = [];
    for (let i = 0 ; i < lista.length ; i++){
        let contador = lista[i].length;
        numeros.push(contador);
    }
    return numeros;
}



