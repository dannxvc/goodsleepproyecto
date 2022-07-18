<%@page import="dao.graficoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*"%>

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
        String label="",dato="";
        graficoDAO obj = new graficoDAO();
        for(CantPorEstado x:obj.lisCantPorEstado()){
            label+="'"+x.getEstado()+"',";
            dato += x.getCant()+",";
        }
        //label="["+label.substring(0,label.length())+"]";
       //  dato="["+dato.substring(0,dato.length())+"]";
   %>
    <div class="container">
          <h2>Esta</h2>
          <div>
              <canvas id="myChart"></canvas>
          </div>
      </div>
  </body>
  <script>
    var ctx = document.getElementById("myChart").getContext("2d");
    var myChart = new Chart(ctx, {
      type: "pie",
      data: {
        labels: <%="["+label+"]"%>,
        datasets: [
          {
            label: "work load",
            data: <%="["+dato+"]"%>,
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
