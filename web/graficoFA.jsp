<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,dao.graficoDAO"%>

<html>
  <link
    rel=
"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
    type="text/css"
  />
  <script src=
"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script
    src=
"https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"
    type="text/javascript"
  ></script>
  <script src=
"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
  <script src=
"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.min.js"></script>
  <style>
    .container {
      width: 45%;
      margin: 15px auto;
    }
    body {
      text-align: center;
      color: green;
    }
    h2 {
      text-align: center;
      font-family: "Verdana", sans-serif;
      font-size: 30px;
    }
  </style>
  <body>
     
   
   <%
       int op=Integer.parseInt(request.getParameter("opc"));
       String tipo="";
        if(op==1)tipo = "pie";
        if(op==2)tipo = "bar";
        if(op==3)tipo = "line";      
        String label="",dato="";
        graficoDAO obj = new graficoDAO();
        for(FacturaPorMes x:obj.lisFacPorMes()){
            label+="'"+x.Lmes()+"',";
            dato += x.getCantidad()+",";
        }
        label="["+label.substring(0,label.length()-1)+"]";
     dato="["+dato.substring(0,dato.length()-1)+"]";
   %>
    <div class="container">
          <h2>Grafico de Reservas por Mes</h2>
          <div>
              <canvas id="myChart"></canvas>
          </div>
      </div>
  </body>
  <script>
    var ctx = document.getElementById("myChart").getContext("2d");
    var myChart = new Chart(ctx, {
      type: "<%=tipo%>",
      data: {
        labels: <%=label%>,
        datasets: [
          {
            label: "work load",
            data: <%=dato%>,
            backgroundColor: ["rgba(153,205,1,0.6)",
             'yellow',
             'orange',
             'red'
            ]
          },
          ],
      },
    });
  </script>

</html>
