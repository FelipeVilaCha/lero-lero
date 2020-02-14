<%@page import="br.uff.model.Alunos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">
  <head>
    <!-- Mobile Specific Meta -->
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <!-- Favicon -->
    <link rel="shortcut icon" href="../../../img/fav.png" />
    <!-- Author Meta -->
    <meta name="author" content="colorlib" />
    <!-- Meta Description -->
    <meta name="description" content="" />
    <!-- Meta Keyword -->
    <meta name="keywords" content="" />
    <!-- meta character set -->
    <meta charset="UTF-8" />
    <!-- Site Title -->
    <title>LeroLero - Cursos de TI online</title>

    <link
      href="https://fonts.googleapis.com/css?family=Playfair+Display:900|Roboto:400,400i,500,700"
      rel="stylesheet"
    />
    <!--
      CSS
      =============================================
    -->
    <link rel="stylesheet" href="../../../css/linearicons.css" />
    <link rel="stylesheet" href="../../../css/font-awesome.min.css" />
    <link rel="stylesheet" href="../../../css/bootstrap.css" />
    <link rel="stylesheet" href="../../../css/magnific-popup.css" />
    <link rel="stylesheet" href="../../../css/owl.carousel.css" />
    <link rel="stylesheet" href="../../../css/nice-select.css" />
    <link rel="stylesheet" href="../../../css/hexagons.min.css" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/themify-icons/0.1.2/css/themify-icons.css"
    />
    <link rel="stylesheet" href="../../../css/main.css" />
  </head>

  <body>
    <!-- ================ Start Header Area ================= -->
    <header class="default-header">
      <nav class="navbar navbar-expand-lg  navbar-light">
        <div class="container">
          <a class="navbar-brand text-white" href="index.jsp">
            LeroLero
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-toggle="collapse"
            data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="lnr lnr-menu"></span>
          </button>

          <div
            class="collapse navbar-collapse justify-content-end align-items-center"
            id="navbarSupportedContent"
          >
            <ul class="navbar-nav">
              <li><a href="../index.jsp">Painel Administrativo</a></li>
              <li><a href="http://localhost:8080/LeroLero/ListaSolicitacoes">Novos Registros</a></li>
              <li><a href="http://localhost:8080/LeroLero/ProcessaLogout">Logout</a></li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
    <!-- ================ End Header Area ================= -->

    <!-- ================ start banner Area ================= -->
    <section class="banner-area">
      <div class="container">
        <div class="row justify-content-center align-items-center">
          <div class="col-lg-12 banner-right">
            <h1 class="text-white">
              Admin
            </h1>
            <p class="mx-auto text-white  mt-20 mb-40">
              Alunos
            </p>
          </div>
        </div>
      </div>
    </section>
    <!-- ================ End banner Area ================= -->

    <!-- ================- Start Table Area ================= -->
    <section class="about-area section-gap">
      <div class="container">
        <div class="row ">
          <div class="col-lg-12">
            <div class="d-flex mb-4 mt-1 justify-content-between">
              <h4 class="card-title">Alunos</h4>
              <button
                class="btn btn-primary btn-xs"
                data-title="Inclui"
                data-toggle="modal"
                data-target="#inclui"
              >
                Incluir
              </button>
            </div>
            <table id="mytable" class="table table-bordred table-striped">
              <thead>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>CPF</th>
                <th>Celular</th>
                <th>CEP</th>
                <th>Endereço</th>
                <th>Cidade</th>
                <th>Bairro</th>
                <th>Editar</th>
                <th>Excluir</th>
              </thead>
              <tbody>
                  <% for (int i = 0; i < ((List<Alunos>) session.getAttribute("listaAlunos")).size(); i++){
                      out.println("<tr>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getId() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getNome() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getEmail() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getCpf() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getCelular() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getCep() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getEndereco() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getCidade() + " </td>");
                      out.println("<td> " + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getBairro() + " </td>");
                      out.println("<td> <p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\">");
                      out.println("<button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\" data-target=\"#edit\" data-id=\"" + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getId() + "\">Editar</button>");
                      out.println("</p></td>");
                      out.println("<td> <p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\">");
                      out.println("<button class=\"btn btn-danger btn-xs\" data-title=\"Delete\" data-toggle=\"modal\" data-target=\"#delete\" data-id=\"" + ((List<Alunos>) session.getAttribute("listaAlunos")).get(i).getId() + "\">Excluir</button>");
                      out.println("</p></td></tr>");
                  }%>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </section>
    <!-- ================- End Table Area ================= -->
    <!-- inclui modal -->
    <div
      class="modal fade"
      id="inclui"
      tabindex="-1"
      role="dialog"
      aria-labelledby="inclui"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="card">
            <article class="card-body">
              <h4 class="card-title mb-4 mt-1">Cadastrar</h4>
              <form method="POST" action="http://localhost:8080/LeroLero/AdicionaAluno">
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>Nome</label>
                    <input
                      name="nome"
                      class="form-control"
                      minlength="3"
                      placeholder="Nome"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>E-mail</label>
                    <input
                      name="email"
                      class="form-control"
                      placeholder="Email"
                      type="email"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>CPF</label>
                    <input
                      name="cpf"
                      class="form-control"
                      minlength="11"
                      maxlength="11"
                      placeholder="999.999.999-99"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Celular</label>
                    <input
                      name="celular"
                      class="form-control"
                      placeholder="99 999 99999999"
                      minlength="14"
                      maxlength="14"
                      type="text"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>CEP</label>
                    <input
                      name="cep"
                      class="form-control"
                      minlength="8"
                      maxlength="8"
                      placeholder="21930150"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Endereço</label>
                    <input
                      name="endereco"
                      class="form-control"
                      placeholder="Estrada do Galeão, 10"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>Cidade</label>
                    <input
                      name="cidade"
                      class="form-control"
                      placeholder="Rio de Janeiro"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Bairro</label>
                    <input
                      name="bairro"
                      class="form-control"
                      placeholder="Rio de Janeiro"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                </div>
                <div class="form-group">
                    <label>Login</label>
                    <input
                      name="login"
                      class="form-control"
                      minlength="3"
                      placeholder="Login"
                      type="text"
                      required
                    />
                </div>
                <!-- form-group// -->
                <div class="form-group">
                  <label>Senha</label>
                  <input
                    name="senha"
                    class="form-control"
                    placeholder="******"
                    type="password"
                    minlength="3"
                    required
                  />
                </div>
                <div class="form-group">
                  <label>Confirmar senha</label>
                  <input
                    class="form-control"
                    placeholder="******"
                    minlength="3"
                    type="password"
                    required
                  />
                </div>
                <!-- form-group// -->

                <!-- form-group// -->
                <div class="form-group">
                  <button type="submit" class="btn btn-primary btn-block">
                    Cadastrar
                  </button>
                </div>
                <!-- form-group// -->
              </form>
            </article>
          </div>
        </div>
      </div>
    </div>
    <!-- edit modal -->
    <div
      class="modal fade"
      id="edit"
      tabindex="-1"
      role="dialog"
      aria-labelledby="edit"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="card">
            <article class="card-body">
              <h4 class="card-title mb-4 mt-1">Atualizar</h4>
              <form method="POST" action="http://localhost:8080/LeroLero/AtualizaAluno">
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>Nome</label>
                    <input
                      name="nome"
                      class="form-control"
                      minlength="3"
                      placeholder="Nome"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>E-mail</label>
                    <input
                      name="email"
                      class="form-control"
                      placeholder="Email"
                      type="email"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>CPF</label>
                    <input
                      name="cpf"
                      class="form-control"
                      minlength="11"
                      maxlength="11"
                      placeholder="999.999.999-99"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Celular</label>
                    <input
                      name="celular"
                      class="form-control"
                      placeholder="99 999 99999999"
                      minlength="14"
                      maxlength="14"
                      type="text"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>CEP</label>
                    <input
                      name="cep"
                      class="form-control"
                      minlength="8"
                      maxlength="8"
                      placeholder="21930150"
                      type="text"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Endereço</label>
                    <input
                      name="endereco"
                      class="form-control"
                      placeholder="Estrada do Galeão, 10"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                </div>
                <div class="d-flex justify-content-between">
                  <div class="form-group">
                    <label>Cidade</label>
                    <input
                      name="cidade"
                      class="form-control"
                      placeholder="Rio de Janeiro"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                  <div class="form-group">
                    <label>Bairro</label>
                    <input
                      name="bairro"
                      class="form-control"
                      placeholder="Rio de Janeiro"
                      type="text"
                      minlength="3"
                      required
                    />
                  </div>
                </div>
                <div class="form-group">
                    <label>Login</label>
                    <input
                      name="login"
                      class="form-control"
                      minlength="3"
                      placeholder="Login"
                      type="text"
                      required
                    />
                </div>
                <!-- form-group// -->
                <div class="form-group">
                  <label>Senha</label>
                  <input
                    name="senha"
                    class="form-control"
                    placeholder="******"
                    type="password"
                    minlength="3"
                    required
                  />
                </div>
                <div class="form-group">
                  <label>Confirmar senha</label>
                  <input
                    class="form-control"
                    placeholder="******"
                    minlength="3"
                    type="password"
                    required
                  />
                </div>
                <!-- form-group// -->

                <!-- form-group// -->
                <div class="form-group">
                <input type="hidden" class="form-control" name="id" id="id" >  
                <button type="submit" class="btn btn-primary btn-block">
                    Atualizar
                  </button>
                </div>
                <!-- form-group// -->
              </form>
            </article>
          </div>
        </div>
      </div>
    </div>
    <!-- delete modal -->
    <div
      class="modal fade"
      id="delete"
      tabindex="-1"
      role="dialog"
      aria-labelledby="edit"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button
              type="button"
              class="close"
              data-dismiss="modal"
              aria-hidden="true"
            >
              <span
                class="glyphicon glyphicon-remove"
                aria-hidden="true"
              ></span>
            </button>
            <h4 class="modal-title" id="Heading">
              Excluir
            </h4>
          </div>
          <div class="modal-body">
            <form action="http://localhost:8080/LeroLero/DeletaAluno" method="POST">
                <input type="hidden" class="form-control" name="alunoID" id="id" >
              <div class="alert alert-danger">
              <span class="glyphicon glyphicon-warning-sign"></span> Você tem
              certeza que deseja excluir?
            </div>
            <div class="modal-footer ">
            <input type="submit" value="Sim" class="btn btn-success">
            <button type="button" class="btn btn-default" data-dismiss="modal">
              <span class="glyphicon glyphicon-remove"></span> Não
            </button>
            </div>
            </form>
          </div>
        </div>
        <!-- /.modal-content -->
      </div>
      <!-- /.modal-dialog -->
    </div>

    <!-- ================ start footer Area ================= -->
    <footer class="footer-area section-gap">
      <div class="container">
        <div class="footer-bottom row align-items-center">
          <p class="footer-text m-0 col-lg-8 col-md-12">
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            Copyright &copy;
            <script>
              document.write(new Date().getFullYear());
            </script>
            Desenvolvido
            <i class="fa fa-heart-o" aria-hidden="true"></i> por
            <a href="#" target="_blank">Nicholas e Felipe</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
          </p>
          <div class="col-lg-4 col-md-12 footer-social">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-dribbble"></i></a>
            <a href="#"><i class="fa fa-behance"></i></a>
          </div>
        </div>
      </div>
    </footer>
    <!-- ================ End footer Area ================= -->

    <script>
      $(document).ready(function() {
        $("#mytable #checkall").click(function() {
          if ($("#mytable #checkall").is(":checked")) {
            $("#mytable input[type=checkbox]").each(function() {
              $(this).prop("checked", true);
            });
          } else {
            $("#mytable input[type=checkbox]").each(function() {
              $(this).prop("checked", false);
            });
          }
        });

        $("[data-toggle=tooltip]").tooltip();
      });
    </script>

    <script src="../../../js/vendor/jquery-2.2.4.min.js"></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
      integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
      crossorigin="anonymous"
    ></script>
    <script src="../../../js/vendor/bootstrap.min.js"></script>
    <script
      type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"
    ></script>
    <script src="../../../js/jquery.ajaxchimp.min.js"></script>
    <script src="../../../js/jquery.magnific-popup.min.js"></script>
    <script src="../../../js/parallax.min.js"></script>
    <script src="../../../js/owl.carousel.min.js"></script>
    <script src="../../../js/jquery.sticky.js"></script>
    <script src="../../../js/hexagons.min.js"></script>
    <script src="../../../js/jquery.counterup.min.js"></script>
    <script src="../../../js/waypoints.min.js"></script>
    <script src="../../../js/jquery.nice-select.min.js"></script>
    <script src="../../../js/main.js"></script>
    <script>
        $(function () {
            $('#delete').on('show.bs.modal', function (event) {
            var button = $(event.relatedTarget); // Button that triggered the modal
            var id = button.data('id'); // Extract info from data-* attributes
            var modal = $(this);
            modal.find('#id').val(id);
            });
        });
    </script>
    <script>
        $(function () {
            $('#edit').on('show.bs.modal', function (event) {
            var button = $(event.relatedTarget); // Button that triggered the modal
            var id = button.data('id'); // Extract info from data-* attributes
            var modal = $(this);
            modal.find('#id').val(id);
            });
        });
    </script>
  </body>
</html>
