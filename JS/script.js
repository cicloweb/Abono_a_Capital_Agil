
function Entrar() {
   var username, password;
   username = document.getElementById("correo electronico").value;
   password = document.getElementById("contraseña").value;

   if (username == "eduardosce@hotmail.com" && password == "eduar2022" || username == "carpeta.sanchez@hotmail.com" && password == "rucarp2022") {
      window.location = "Filtro de seguridad.html";


   }

}
