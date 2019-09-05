/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function agregar() {



    $.get("agregar.jsp", function (data) {
        $("#formulario").html(data);
        console.log("error");
    }
    );
}
function agregarpregunta(){
    $.ajax({
        method: "POST",
        url: "insertarpregunta",
        data: {enunciado: $("#enunciado").val(), valor: $("#txtvalor").val() }
    })
            .done(function (resultado) {
                $("#tabla").html(resultado);
            });
}



function formuario(){
    $.ajax({
        method: "POST",
        url: "listarpregunta",
        data: {correo: $("#correo").val(), clave: $("#clave").val() }
    })
            .done(function (resultado) {
                $("#tabla").html(resultado);
            });
}
function eliminar(id){
    $.ajax({
        method: "POST",
        url: "eliminarpregunta",
        data: {id:id}
    })
            .done(function (resultado) {
                $("#tabla").html(resultado);
            });
}
formuario();