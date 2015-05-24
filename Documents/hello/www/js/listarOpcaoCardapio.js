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
   

