function Continuar(){
    var credito,tipodedocumento,numerodedocumento,fechaexpedicioncedula;
    credito = document.getElementById("Credito").value; 
    tipodedocumento = document.getElementById("Tipo de documento").value; 
    numerodedocumento = document.getElementById("Numero documento").value; 
    fechaexpedicioncedula = document.getElementById("Fecha expedicion").value;



 
 
 
     if( credito == "101021" && tipodedocumento == "colombiana" && numerodedocumento =="10228673545" && fechaexpedicioncedula == "16/02/2003"  ){
     window.location= "ResumenEstadoCuenta.html";
      
 
    }
    
 }
 function Salir(){
  window.location= "Login.html";
 }