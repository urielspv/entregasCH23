alert("cohorte 23");
console.log("Hola buen dia");
alert("Dia dell gatito");
console.log("adios");


// setTimeout(
//     function(){
//         console.log("Hola mundo, con retraso");
//     },1000);

//     console.log("sorpresa");

const myCallback = () => console.log("Hola mundo con retraso");

setTimeout(myCallback);