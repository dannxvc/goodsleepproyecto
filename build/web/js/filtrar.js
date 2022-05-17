

$(document).ready(function () {
    //cuando se escriba caracteres en la caja de texto  
    $(document).on('keyup', '#txtnom', function () {
        let valor = $(this).val();

        listado(valor);
    });


    function listado(consulta) {
        opc = "4";
        $.get("control", {opc, consulta}, (response) => {
            const misDatos = JSON.parse(response); //recuperar la informacion q envio el controlador
            let template = "";
            console.log(misDatos);

            template += `  
             <table class="table table-hover">  
                                    <thead class="text-white bg-dark">  
                                        <tr>  
                                            <th>Codigo</th>  
                                            <th>Nombre</th>  
                                            <th>apellido</th>  
                                        </tr>  
                                    </thead>  
                                    <tbody>`;
            misDatos.forEach(midato => {
                template += `  
                <tr>  
                    <td>${midato.coda}</td>  
                    <td>${midato.noma}</td>  
                    <td>${midato.ape}</td> 
                    <td><a href="javascript:pasaSeleccion('${midato.coda}', '${midato.noma}', '${midato.ape}');"> 
                    <img src="botones/buscar.png" height="20" width="20" class="center-block"></a> 
                </tr>`;
            })
            template += `</tbody></table>`;
            $("#tablares").html(template);
        })
    }
})


