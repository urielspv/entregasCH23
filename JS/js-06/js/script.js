/*

TIPOS DE NODOS
-Element: son todos llaquellos definidos por etiquetas <div>,<img>,<h1> etc
-Attributes: Nodos que dan informacion asociada al tipo de elemento

-Comentarios:  Comentarios  y otros elementos que estan dentro del HTML, son considerados nodos.


Como leer nodos e mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)

    -  document.getElementById(btnSuma)
    -  document.getElementByTagName(<button>)
    -  document.getElementByClassName(botones)



// distintas maneras de llamar objetos del DOM

var elementoID = document.getElementById("btnSuma");

console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);

var elementoClase = document.getElementsByClassName("botones");

console.log(elementoClase);


Metodos recientes
    -document.querySelector
    -document.querySelectorALL





CREACION DE NODOS
----creacion de una etiqueta del tipo imagen-----

const imagenPerrito = document.createElement("img");

---creacion de atributos ----
imagenPerrito.src = "../imagen.jpg";
imagenPerrito.style.width = "150px";
imagenPerrito.alt = "Foto de perrito feliz";


---Poner elementos o nodos en el html

document.body.append(imagenPerrito);




var unElemenento = document.querySelector("#input1");
console.log(unElemenento);

var variosElementos = document.querySelectorAll(".botones");

console.log(variosElementos);


*/


//Traigo todos los elementos que necesito del DOM





var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");


var btnSuma = document.getElementById("btnSuma");
var btnResta = document.getElementById("btnResta");
var btnMult = document.getElementById("btnMult");
var btnDivision = document.getElementById("btnDivision");

var resultado = document.getElementById("resultado");

resultado.innerHTML = "Saludos cambió esto";

