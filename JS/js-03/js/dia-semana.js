//Dia de la semana


function calculaDia(dia){
    
    let numeroDia = dia;
    let respuesta ="";
      let diasSemana = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"];

      if (numeroDia >= 0 && numeroDia <= 6) {
        respuesta =diasSemana[numeroDia];
      } else {
        respuesta = "Inválido";
      }

    return respuesta;


    
}


let q = true;
    let p = false;

    if(q&&p) console.log("verdadero")
  
