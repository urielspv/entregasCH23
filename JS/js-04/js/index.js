let miVariable = 5;
let miArray =[2,3,4,5,6];
let miArray2 = new Array();

let miArray1 = [
    [1,2,3],
    [2,5,6],
    [7,8,9]
]

console.log("mi array " + miArray1[0][0]);
console.log("mi array " + miArray1[0][2]);
console.log("mi array " + miArray1[0][1]);
console.log("mi array " + miArray1[1][0]);
console.log("mi array " + miArray1[1][2]);
console.log("mi array " + miArray1[1][1]);


console.log("Too el indice" + miArray1[0]);
console.log("Too el indice" + miArray1[1]);
console.log("Too el indice" + miArray1[2]);


// Ciclo FOR *****************************
let miArray4 = [2, 3, 4, 5, 6, 7];

for (let i = 0; i <= 5; i++) {
    console.log("imprimiendo miArray -> " + miArray4);
}

let miArray5 = [ 
    [1, 2, 3],    
    [4, 5, 6],     
    [7, 8, 9]
];
let matrizR= [
    [],[],[]
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray5[i][j] * miArray4[i][j];
    }
    
}
console.log("MatrizR->"+matrizR);








for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("matrizR -> " + miArray1[i][j]);
    }
}


// ciclo whileeee **************************************

