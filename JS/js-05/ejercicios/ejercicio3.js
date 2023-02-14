console.log("----------Ejercicio 3-------------")



function RangoNumeros(num) {
    if (num >= 0 && num <= 25) {
        return num + ' is between 0 and 25';
    } else if (num >= 26 && num <= 100) {
        return num + ' is between 26 and 100';
    } else if (num > 100) {
        return num + ' is greater than 100';
    } else if (num < 0) {
        return num + ' is less than 0';
    } else {
        return 'Please enter a valid number';
    }
}


console.log(RangoNumeros(25));   // '25 is between 0 and 25'
console.log(RangoNumeros(75));   // '75 is between 26 and 100'
console.log(RangoNumeros(125));  // '125 is greater than 100'
console.log(RangoNumeros(-25));  // '-25 is less than 0'