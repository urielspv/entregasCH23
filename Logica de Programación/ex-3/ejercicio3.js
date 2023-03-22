let n;
let factorial = 1;

while (isNaN(n)) {
  n = prompt("Ingresa un numero para calcular su factorial");
  
  if (isNaN(n)) {
    console.log("********* Error: Debes ingresar un número válido.");
  }
}
number = Number(n); // Convertir a número

for (let i = 1; i <= n; i++) {
  factorial *= i;
}

console.log("El factorial de " + n + " es: " + factorial);
