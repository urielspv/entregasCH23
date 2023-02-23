//Prueba efectiva
// const indexTest = require("../calculadora/index")
import { indexTest } from "../calculadora";
test('test de suma', () =>{
    const r = indexTest.suma(1,2);
    expect(r).toBe(3);

});

test.todo('test resta');
test.todo('test mult');
test.todo('test divide');   