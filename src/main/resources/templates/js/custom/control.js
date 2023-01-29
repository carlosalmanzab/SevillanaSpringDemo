function modalEliminar() {
  var codigo = document.getElementById("codigo").value;
  var modalEliminar = document.getElementById("valorModalEliminar");
  modalEliminar.innerHTML = codigo;
}

function buscar() {
  $(document).ready(function () {
    $("#search").keyup(function () {
      _this = this;
      // solo muestra la busqueda y oculta el resto
      $.each($("#table tbody tr"), function () {
        if (
          $(this).text().toLowerCase().indexOf($(_this).val().toLowerCase()) ===
          -1
        )
          $(this).hide();
        else $(this).show();
      });
    });
  });
}



function seleccionar() {
  var codigoInput = document.getElementById("codigoInput");

  $(document).ready(function () {
    $(".codigoTabla").click(function () {
      var number = "";

      // Obtenemos todos los valores contenidos en los <td> de la fila
      // seleccioanada
      $(this)
        .parents("tr").find(".codigoTabla").each(function () {
          number += $(this).html() + "\n";
        });
      console.log(number);
    });
  });
}
