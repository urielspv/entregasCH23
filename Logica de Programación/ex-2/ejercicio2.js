let celsius = prompt("Ingresa la temperatura en grados Celsius:");

  // Verificar si el valor ingresado es un número con la funcion isNaN
  while (isNaN(celsius)) {
    alert("Debes ingresar un numero.");
    celsius = prompt("Ingresa la temperatura en grados Celsius:");
  }

  // Convertir de Celsius a Fahrenheit
  let fahrenheit = (celsius*9/5)+32;
  console.log(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

  // Convertir de Celsius a Kelvin
  let kelvin = parseFloat(celsius) + 273.15;
  console.log(celsius + " grados Celsius son " + kelvin + " grados Kelvin.");