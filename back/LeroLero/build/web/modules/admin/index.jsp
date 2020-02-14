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
    <link rel="shortcut icon" href="../../img/fav.png" />
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
    <link rel="stylesheet" href="../../css/linearicons.css" />
    <link rel="stylesheet" href="../../css/font-awesome.min.css" />
    <link rel="stylesheet" href="../../css/bootstrap.css" />
    <link rel="stylesheet" href="../../css/magnific-popup.css" />
    <link rel="stylesheet" href="../../css/owl.carousel.css" />
    <link rel="stylesheet" href="../../css/nice-select.css" />
    <link rel="stylesheet" href="../../css/hexagons.min.css" />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/themify-icons/0.1.2/css/themify-icons.css"
    />
    <link rel="stylesheet" href="../../css/main.css" />
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
              <li><a href="index.jsp">Painel Administrativo</a></li>
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
            <h4 class="text-white">
              Painel Administrativo
            </h4>
          </div>
        </div>
      </div>
    </section>
    <!-- ================ End banner Area ================= -->

    <!-- ================ Start Popular Course Area ================= -->
    <section class="popular-course-area section-gap">
      <div class="container-fluid">
        <div class="row justify-content-center section-title">
          <div class="col-lg-12">
            <h2>Painel Administrativo</h2>
          </div>
        </div>

        <div class="container">
          <div class="row">
            <div class="col-sm-4">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Alunos</h5>
                  <p class="card-text">
                    Lista, inclui, altera e exclui dados dos alunos no sistema.
                  </p>
                  <a href="http://localhost:8080/LeroLero/ListaAlunos" class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
            <div class="col-sm-4">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Instrutores</h5>
                  <p class="card-text">
                    Lista, inclui, altera e exclui dados dos intrutores no
                    sistema.
                  </p>
                  <a href="http://localhost:8080/LeroLero/ListaInstrutores" class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
            <div class="col-sm-4">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Cursos</h5>
                  <p class="card-text">
                    Lista, inclui, altera e exclui dados dos cursos no sistema.
                  </p>
                  <a href="http://localhost:8080/LeroLero/ListaCursos" class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
            <div class="col-sm-4 mt-3">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Turmas</h5>
                  <p class="card-text">
                    Lista, inclui, altera e exclui dados dos turmas no sistema.
                  </p>
                  <a href="http://localhost:8080/LeroLero/ListaTurmas" class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
            <div class="col-sm-4 mt-3">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Alunos no curso</h5>
                  <p class="card-text">
                    Lista todos os alunos de um curso/turma e suas respectivas
                    notas.
                  </p>
                  <a href="http://localhost:8080/LeroLero/ListaNotasAlunos" class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
            <div class="col-sm-4 mt-3">
              <div class="card">
                <div class="card-body">
                  <h5 class="card-title">Cursos de cada instrutor</h5>
                  <p class="card-text">
                    Lista todos os cursos/turma de cada instrutor indicando o
                    valor total que irá receber.
                  </p>
                  <a
                    href="http://localhost:8080/LeroLero/ListaCursosInstrutor"
                    class="btn btn-dark"
                    >Mais informações</a
                  >
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- ================ End Popular Course Area ================= -->

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

    <script src="../../js/vendor/jquery-2.2.4.min.js"></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
      integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
      crossorigin="anonymous"
    ></script>
    <script src="../../js/vendor/bootstrap.min.js"></script>
    <script
      type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"
    ></script>
    <script src="../../js/jquery.ajaxchimp.min.js"></script>
    <script src="../../js/jquery.magnific-popup.min.js"></script>
    <script src="../../js/parallax.min.js"></script>
    <script src="../../js/owl.carousel.min.js"></script>
    <script src="../../js/jquery.sticky.js"></script>
    <script src="../../js/hexagons.min.js"></script>
    <script src="../../js/jquery.counterup.min.js"></script>
    <script src="../../js/waypoints.min.js"></script>
    <script src="../../js/jquery.nice-select.min.js"></script>
    <script src="../../js/main.js"></script>
  </body>
</html>
