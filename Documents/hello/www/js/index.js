$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/Sicogelan/opcaoCardapio.json"
    }).then(function(data) {
  
 $("#tblOpcaoCardapio tbody").html("");
                      $.each(data,function(idx,opcaoCardapio){
                            var html = "<tr data-id=\""+opcaoCardapio.id+"\">";
                              html += "<td>"+opcaoCardapio.arquivo.id+"</td>";
                              html += "<td>"+opcaoCardapio.descricao+"</td>";
                              html += "<td>"+opcaoCardapio.preco+"</td>";
                              html += "<td>"+opcaoCardapio.categoriaOpcaoCardapio.id+"</td>";
                              html += "<td>"+opcaoCardapio.cardapio.id+"</td>";
                            html += "</tr>";
                            $("#tblOpcaoCardapio tbody").append(html);
                          });
    });
});
   


   $(document).ready(function() {

      // Save Person AJAX Form Submit
      $('#newPersonForm').submit(function(e) {
        // will pass the form data using the jQuery serialize function
        $.post('http://localhost:8080/ProjetoREST/people/create', {"age":10,"firstName":"João3","lastName":"José"}, function(response) {
         
          console.log(response);
          $('#personFormResponse').text(response);

          var xmlhttp = new XMLHttpRequest();

          xmlhttp.open("POST","http://localhost:8080/ProjetoREST/people/create",true);
          xmlhttp.send(JSON.stringify({"age":10,"firstName":"João2","lastName":"José"}));

        });
         
        e.preventDefault(); // prevent actual form submit and page reload
      });
       
    });
var listar = function() {
    $.ajax({
        url: "http://localhost:8080/Sicogelan/opcaoCardapio"
    }).then(function(data, status, jqxhr) {
      console.log("tamanho da lista")
      console.log(data.length);
       
        for (i=0; i< data.length; i++) {
       $('.nome').append(data[i].id);
       $('.telefone').append(data[i].cardapio);

        }
    })};


 var atualizar = function(){

   $.ajax({
   url: 'http://localhost:8080/api/contato/',
   type: 'PUT',
   data: {"id":"1","nome":"GuilhermePaiva","telefone":"1323232"},
   dataType: "json",
   contentType: 'application/json',
   success: function(data) {
     alert('deu certo')
   },
    error: function (xhr) {
        alert('error');
    }
});

 }

 var salvar = function(){
   $.post("http://localhost:8080/Sicogelan/arquivo",{"descricao":"Programando com Grails","contentType:":"jpeg" ,
     "arquivo:"+document.getElementById('file')}, function(data){
        alert(data);
   },"json")

 }

 var list = function(){
  $.get('http://localhost:8080/Sicogelan/opcaoCardapio',function(data){

    console.log(data);
  },"json");
 }



 