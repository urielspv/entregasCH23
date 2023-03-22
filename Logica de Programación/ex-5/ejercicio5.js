let intentos = [];

do {
  numeroAdivinado = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto 70:");
  intentos.push(numeroAdivinado);
  
  if (numeroAdivinado == 70) {
    console.log("Felicidades, adivinaste el número secreto.");
  } else {
    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
  }
} while (numeroAdivinado != 70);

console.log("La lista de números introducidos es: " + intentos.join(", "));
