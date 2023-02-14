let lista = [12,15,80,34,7];


let lNueva = ista.map(
    function(valor){
        return valor * 2;
    }
);

console.log(lNueva);



let listaNueva = lista.slice(1,3);//metodo que imprime una copia de una porcion del array
console.log(listaNueva);

lista.sort(
    function(valor1,valor2){
        return valor1 - valor2;
    }
)

console.log(lista)


lista.sort();
console.log(lista);



lista.reverse; //cambia el orden
console.log(lista);



lista.splice(1,2);
lista.splice(2,2,100,200,80);
console.log(lista);

lista.push(45);
console.log(lista);

lista.pop(34);
console.log(lista);

lista.concat(100,200,300);
console.log(lista); //agrega otro array

lista.join("-");//agrega separacion a cada elemento
console.log(lista)

lista.shift;
console.log(lista);




for(let i = 0; i<lista.length; i++){
    console.log("-->"+lista[i]);
}
console.log(lista);
