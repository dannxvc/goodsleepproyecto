$(document).ready(function () {  
    $('#categoria').on('change', function (){       
        let cod = $(this).find(':selected').attr('value');
          
        listado(cod);  
         
    });  

     
     
   function listado(consulta) {  
        opc = "5";  
        $.get("clientecontrol", {opc, consulta}, (response) => {  
            const misDatos = JSON.parse(response);//recuperar la informacion q envio el controlador  
            let template = "";  
            console.log(misDatos);  
             
           template += `  
             <table class="table table-dark mx-auto" style="width: 800px;">  
                                    <thead>  
                                        <tr>  
                                            <th>Nro Habitacion</th>  
                                            <th>Categoria</th>  
                                            <th>Piso</th>  
                                            <th>Imagen</th>  
                                           </tr>  
                                    </thead>  
                                    <tbody>`;    
            misDatos.forEach(midato => {  
                template += `  
                <tr>           
                    <td>${midato.codHabitacion}</td>  
                    <td>${midato.descripcionCategoria}</td>  
                    <td>${midato.piso}</td> 
                    <td><img src="img/${midato.descripcionCategoria}.jpg" width="200" class="center-block"></a> 
                                </tr>`;              
                  
            });  
            template += `</tbody></table>`;  
            $("#filtrar_hab").html(template);  
  
        }) ; 
    }  
     
}) 