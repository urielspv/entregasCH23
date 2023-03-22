let number;

while (isNaN(number)) {
  number = prompt("Ingresa un numero para calcular la serie de Fibonacci");
  
  if (isNaN(number)) {
    console.log("********* Error: Debes ingresar un nimero válido.");
  }
}

number = Number(number); // Convertir a número

let fibonacci = "";

let a = 0;
let b = 1;
let c;

while (a <= number) {
  fibonacci += a + ", ";
  c = a + b;
  a = b;
  b = c;
}

console.log("La serie de Fibonacci hasta " + number + " es: " + fibonacci.slice(0, -2));
