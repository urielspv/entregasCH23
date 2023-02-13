//Control de flujo
/*
if (condition){
    Bloque de código
}
*/

let edad = parseInt(prompt("Escribe tu edad: "));

if(edad < 18){
    document.write("no Eres mayor de edad");
}
else if(edad >= 18){
    document.write("<h2>eres mayor de edad</h2>");
}

else{
    document.write("Valor no vaido");
}