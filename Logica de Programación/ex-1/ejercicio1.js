// Solicitar los tres números al usuario
var num1 = prompt("Ingrese el primer numero");
var num2 = prompt("Ingrese el segundo numero");
var num3 = prompt("Ingrese el tercer numero");

// Convertir los valores ingresados a números 
num1 = number(num1);
num2 = number(num2);
num3 = number(num3);


  // Encontrar el número mayor
  var max = num1;
  if (num2 > max) {
    max = num2;
  }
  if (num3 > max) {
    max = num3;
  }

  // Encontrar el número menor
  var min = num1;
  if (num2 < min) {
    min = num2;
  }
  if (num3 < min) {
    min = num3;
  }

  // Encontrar el número del centro
  var mid = num1 + num2 + num3 - max - min;

  // Mostrar los números ordenados de mayor a menor y de menor a mayor
  console.log("Números ordenados de mayor a menor: " + max + ", " + mid + ", " + min);
  console.log("Números ordenados de menor a mayor: " + min + ", " + mid + ", " + max);

  // Comprobar si los números son iguales y mostrar un mensaje si es así
  if (num1 === num2 && num2 === num3) {
    console.log("Los números ingresados son iguales");
  }

