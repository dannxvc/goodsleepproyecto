$(document).ready(function () {
    $("#btn-cerrar").click(function (e) {
        e.preventDefault();
        swal({
            title: "Esta seguro/a de cerrar sesion?",
            type: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-danger",
            confirmButtonText: "Sí, Cerrar!",
            cancelButtonText: "No, Cancelar!",
            closeOnConfirm: false,
            closeOnCancel: false
        },
                function (isConfirm) {
                    if (isConfirm) {
                        setTimeout(function (){
                            parent.location.href="uacontrol?accion=cerrar"
                        }, 1000);
                    } else {
                        swal("Sigues en sesion", "Puedes seguir administrando", "success");
                    }
                });
    });
     $("#btn-cerrar-cliente").click(function (e) {
        e.preventDefault();
        swal({
            title: "Esta seguro/a de cerrar sesion?",
            type: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-danger",
            confirmButtonText: "Sí, Cerrar!",
            cancelButtonText: "No, Cancelar!",
            closeOnConfirm: false,
            closeOnCancel: false
        },
                function (isConfirm) {
                    if (isConfirm) {
                        setTimeout(function (){
                            parent.location.href="uccontrol?accion=cerrar"
                        }, 1000);
                    } else {
                        swal("Sigues en tu cuenta :)", "success");
                    }
                });
    });
    
//    $("td #btn-eliminar-reserva").click(function (e) {
//        e.preventDefault();
//        var cod = $(this).parent().find('#cod').val();
//        var cod2 = $(this).parent().find('#cod2').val();
//        swal({
//            title: "Esta Seguro de Eliminar?",
//            text: "Una vez eliminado deberá agregar de nuevo!",
//            type: "warning",
//            showCancelButton: true,
//            confirmButtonClass: "btn-danger",
//            confirmButtonText: "Sí, Eliminar!",
//            cancelButtonText: "No, Cancelar!",
//            closeOnConfirm: false,
//            closeOnCancel: false
//        },
//                function (isConfirm) {
//                    if (isConfirm) {
//                        eliminarReserva(cod,cod2);
//                        swal("Eliminada!", "Reserva se ha eliminado", "success");
//                        setTimeout(function (){
//                            parent.location.href = "pagListaReservas.jsp"
//                        }, 1000);
//                    } else {
//                        swal("Cancelado", "Cancelaste la eliminación", "error");
//                    }
//                });
//    });
//    
//        function eliminarReserva(cod,cod2) {
//        var url = "svReserva?opc=6&cod=" + cod+"&cod2="+cod2;
//        console.log("eliminado");
//        $.ajax({
//            type: 'POST',
//            url: url,
//            async: true,
//            success: function (r) {
//                
//            }
//        });
//    }
    
});

//svReserva?opc=5&idcliente=23963624&habitacion=D0002&codupdateh=OCUPADO&updateh=D0002&servicioad=S0001&npersonas=1&fcheckin=2022-06-03&fcheckout=2022-06-10&ndias=7&subtotal=600.0&precio=40.0&estadoh=PENDIENTE&monto=4240