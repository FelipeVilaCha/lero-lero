package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class erro_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt\" class=\"no-js\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Mobile Specific Meta -->\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\"\r\n");
      out.write("      content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/fav.png\" />\r\n");
      out.write("    <!-- Author Meta -->\r\n");
      out.write("    <meta name=\"author\" content=\"colorlib\" />\r\n");
      out.write("    <!-- Meta Description -->\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <!-- Meta Keyword -->\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <!-- meta character set -->\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <!-- Site Title -->\r\n");
      out.write("    <title>LeroLero - Cursos de TI online</title>\r\n");
      out.write("\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Playfair+Display:900|Roboto:400,400i,500,700\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <!--\r\n");
      out.write("      CSS\r\n");
      out.write("      =============================================\r\n");
      out.write("    -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/linearicons.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/hexagons.min.css\" />\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/themify-icons/0.1.2/css/themify-icons.css\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- ================ Start Header Area ================= -->\r\n");
      out.write("    <header class=\"default-header\">\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg  navbar-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <a class=\"navbar-brand text-white\" href=\"index.jsp\">\r\n");
      out.write("            LeroLero\r\n");
      out.write("          </a>\r\n");
      out.write("          <button\r\n");
      out.write("            class=\"navbar-toggler\"\r\n");
      out.write("            type=\"button\"\r\n");
      out.write("            data-toggle=\"collapse\"\r\n");
      out.write("            data-target=\"#navbarSupportedContent\"\r\n");
      out.write("            aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("            aria-expanded=\"false\"\r\n");
      out.write("            aria-label=\"Toggle navigation\"\r\n");
      out.write("          >\r\n");
      out.write("            <span class=\"lnr lnr-menu\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"collapse navbar-collapse justify-content-end align-items-center\"\r\n");
      out.write("            id=\"navbarSupportedContent\"\r\n");
      out.write("          >\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("              <li><a href=\"about.jsp\">Sobre</a></li>\r\n");
      out.write("              <li><a href=\"http://localhost:8080/LeroLero/ListagemCursosDisponiveis\">Cursos</a></li>\r\n");
      out.write("              <li><a href=\"http://localhost:8080/LeroLero/VisualizarInstrutores\">Instrutores</a></li>\r\n");
      out.write("              <li><a href=\"http://localhost:8080/LeroLero/ListaComentarios\">Comentários</a></li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a\r\n");
      out.write("                  class=\"text-white\"\r\n");
      out.write("                  style=\"cursor: pointer\"\r\n");
      out.write("                  data-toggle=\"modal\"\r\n");
      out.write("                  data-target=\"#register\"\r\n");
      out.write("                  >Registrar</a\r\n");
      out.write("                >\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a\r\n");
      out.write("                  class=\"text-white\"\r\n");
      out.write("                  style=\"cursor: pointer\"\r\n");
      out.write("                  data-toggle=\"modal\"\r\n");
      out.write("                  data-target=\"#login\"\r\n");
      out.write("                  >Login</a\r\n");
      out.write("                >\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ================ End Header Area ================= -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ================ Start Login Modal ================= -->\r\n");
      out.write("    <div\r\n");
      out.write("      class=\"modal fade\"\r\n");
      out.write("      id=\"login\"\r\n");
      out.write("      tabindex=\"-1\"\r\n");
      out.write("      role=\"dialog\"\r\n");
      out.write("      aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("      aria-hidden=\"true\"\r\n");
      out.write("    >\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"card\">\r\n");
      out.write("            <article class=\"card-body\">\r\n");
      out.write("              <h4 class=\"card-title mb-4 mt-1\">Login</h4>\r\n");
      out.write("              <form method=\"POST\" action=\"http://localhost:8080/LeroLero/ProcessaLogin\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Login</label>\r\n");
      out.write("                  <input\r\n");
      out.write("                    name=\"login\"\r\n");
      out.write("                    class=\"form-control\"\r\n");
      out.write("                    placeholder=\"Login\"\r\n");
      out.write("                    type=\"text\"\r\n");
      out.write("                    required\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <a class=\"float-right\" href=\"#\">Esqueceu sua senha?</a>\r\n");
      out.write("                  <label>Senha</label>\r\n");
      out.write("                  <input\r\n");
      out.write("                    name = \"senha\"\r\n");
      out.write("                    class=\"form-control\"\r\n");
      out.write("                    placeholder=\"******\"\r\n");
      out.write("                    minlength=\"3\"\r\n");
      out.write("                    type=\"password\"\r\n");
      out.write("                    required\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"checkbox\">\r\n");
      out.write("                    <label> <input type=\"checkbox\" /> Salvar senha </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- checkbox .// -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label> <input type=\"radio\" name=\"permissao\" value=\"alunos\"/> Alunos </label>\r\n");
      out.write("                    <label> <input type=\"radio\" name=\"permissao\" value=\"instrutores\"/> Instrutores </label>\r\n");
      out.write("                    <label> <input type=\"radio\" name=\"permissao\" value=\"administrador\"/> Administrador </label>\r\n");
      out.write("                  <!-- checkbox .// -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("                    Entrar\r\n");
      out.write("                  </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("              </form>\r\n");
      out.write("            </article>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ================ End Login Modal ================= -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ================ Start Register Modal ================= -->\r\n");
      out.write("    <div\r\n");
      out.write("      class=\"modal fade\"\r\n");
      out.write("      id=\"register\"\r\n");
      out.write("      tabindex=\"-1\"\r\n");
      out.write("      role=\"dialog\"\r\n");
      out.write("      aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("      aria-hidden=\"true\"\r\n");
      out.write("    >\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"card\">\r\n");
      out.write("            <article class=\"card-body\">\r\n");
      out.write("              <h4 class=\"card-title mb-4 mt-1\">Registrar</h4>\r\n");
      out.write("              <form method=\"POST\" action=\"http://localhost:8080/LeroLero/CadastraAluno\">\r\n");
      out.write("                <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Nome</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"nome\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      minlength=\"3\"\r\n");
      out.write("                      placeholder=\"Nome\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>E-mail</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"email\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      placeholder=\"Email\"\r\n");
      out.write("                      type=\"email\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>CPF</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"cpf\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      minlength=\"11\"\r\n");
      out.write("                      maxlength=\"11\"\r\n");
      out.write("                      placeholder=\"999.999.999-99\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Celular</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"celular\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      placeholder=\"99 999 99999999\"\r\n");
      out.write("                      minlength=\"14\"\r\n");
      out.write("                      maxlength=\"14\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>CEP</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"cep\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      minlength=\"8\"\r\n");
      out.write("                      maxlength=\"8\"\r\n");
      out.write("                      placeholder=\"21930150\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Endereço</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"endereco\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      placeholder=\"Estrada do Galeão, 10\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      minlength=\"3\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Cidade</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"cidade\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      placeholder=\"Rio de Janeiro\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      minlength=\"3\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <label>Bairro</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"bairro\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      placeholder=\"Rio de Janeiro\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      minlength=\"3\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>Login</label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      name=\"login\"\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      minlength=\"3\"\r\n");
      out.write("                      placeholder=\"Login\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Senha</label>\r\n");
      out.write("                  <input\r\n");
      out.write("                    name=\"senha\"\r\n");
      out.write("                    class=\"form-control\"\r\n");
      out.write("                    placeholder=\"******\"\r\n");
      out.write("                    type=\"password\"\r\n");
      out.write("                    minlength=\"3\"\r\n");
      out.write("                    required\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <label>Confirmar senha</label>\r\n");
      out.write("                  <input\r\n");
      out.write("                    class=\"form-control\"\r\n");
      out.write("                    placeholder=\"******\"\r\n");
      out.write("                    minlength=\"3\"\r\n");
      out.write("                    type=\"password\"\r\n");
      out.write("                    required\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("                    Cadastrar\r\n");
      out.write("                  </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- form-group// -->\r\n");
      out.write("              </form>\r\n");
      out.write("            </article>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ================ End Registrar Modal ================= -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ================ start banner Area ================= -->\r\n");
      out.write("    <section class=\"home-banner-area\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row justify-content-center fullscreen align-items-center\">\r\n");
      out.write("          <div class=\"col-lg-5 col-md-8 home-banner-left\">\r\n");
      out.write("            <h1 class=\"text-white\">\r\n");
      out.write("              Ih rapaz, Deu erro!\r\n");
      out.write("            </h1>\r\n");
      out.write("            <p class=\"mx-auto text-white  mt-20 mb-40\">\r\n");
      out.write("              O erro eu vou deixar aqui pra você ver, foi o seguinte:\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"offset-lg-2 col-lg-5 col-md-12 home-banner-right\">\r\n");
      out.write("            <img class=\"img-fluid\" src=\"img/interrogation.png\" alt=\"\" />\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ================ End banner Area ================= -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- ================ start footer Area ================= -->\r\n");
      out.write("    <footer class=\"footer-area section-gap\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"footer-bottom row align-items-center\">\r\n");
      out.write("          <p class=\"footer-text m-0 col-lg-8 col-md-12\">\r\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("            Copyright &copy;\r\n");
      out.write("            <script>\r\n");
      out.write("              document.write(new Date().getFullYear());\r\n");
      out.write("            </script>\r\n");
      out.write("            Desenvolvido\r\n");
      out.write("            <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> por\r\n");
      out.write("            <a href=\"#\" target=\"_blank\">Nicholas e Felipe</a>\r\n");
      out.write("            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("          </p>\r\n");
      out.write("          <div class=\"col-lg-4 col-md-12 footer-social\">\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\r\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ================ End footer Area ================= -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\"\r\n");
      out.write("      integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script src=\"js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("    <script\r\n");
      out.write("      type=\"text/javascript\"\r\n");
      out.write("      src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/parallax.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("    <script src=\"js/hexagons.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("            \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
