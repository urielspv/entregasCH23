/*Exercise #1
You want to build a page that says "Hello name". Underneath the text will be a button that says, "Change the name!". When someone clicks the button, a prompt should pop up and ask, "What is your name?". The person is able to input a name into the prompt and the new text of the page should say, "Hello {inputted name}".

Make sure to use the built in prompt() function to get the name.

Hint: Use the DOM API to update the name.*/

let  nombre = "Uriel";

function cambiaNombre(){
     nombre = prompt("Que nombre quieres: ");

    var h3 = document.getElementById('nombre');
    h3.innerHTML = "Hola " + nombre;
     

}
