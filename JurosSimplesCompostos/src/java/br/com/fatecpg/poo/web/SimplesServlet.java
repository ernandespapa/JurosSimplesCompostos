/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.poo.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ernandes
 */
@WebServlet(name = "SimplesServlet", urlPatterns = {"/juros-simples.html"})
public class SimplesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html lang='pt-br'>");
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<meta name='viewport' content='width=device-width', initial-scale=1, shrink-to-fit=no>");
            out.println("<meta name='description' content=''>");
            out.println("<meta name='author' content=''>");
            out.println("<title>Juros Simples e Composto</title>");

            out.println( "<!-- Bootstrap core CSS -->");
            out.println ("<link href='vendor/bootstrap/css/bootstrap.min.css' rel='stylesheet'>");

            out.println ("<!-- Custom styles for this template -->");
            out.println("<link href='css/small-business.css' rel='stylesheet'>");

            out.println("</head>");

            out.println("<body>");
            
            
            out.println("<!-- Navigation -->");
            out.println("<nav class='navbar navbar-expand-lg navbar-dark bg-dark fixed-top'>");
            out.println("<div class='container'>");
            out.println("<a class='navbar-brand' href='home.html'>Home </a>");
            out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarResponsive' aria-controls='navbarResponsive' aria-expanded='false' aria-label='Toggle navigation'>");
            out.println("<span class='navbar-toggler-icon'></span>");
            out.println("</button>");
            out.println("<div class='collapse navbar-collapse' id='navbarResponsive'>");
            out.println("<ul class='navbar-nav ml-auto'>");
            out.println("<li class='nav-item active'>");
            out.println("<a class='nav-link' href='juros-simples.html'>Juros Simples");
            out.println("<span class='sr-only'>(current)</span>");
            out.println("</a>");
            out.println(" </li>");
            out.println("<li class='nav-item'>");
            out.println("<a class='nav-link' href='juros-compostos.html'>Juros Compostos </a>");
            out.println("</li>");
           
            out.println("</ul>)");
            out.println("</div>");
            out.println("</div>");
            out.println("</nav>");

 out.println("<!-- Page Content -->");
  out.println("<div class='container'>");

    out.println("<!-- Heading Row -->");
    
    out.println("<div class='card text-white bg-secondary my-5 py-4 text-center'>");
      out.println("<div class='card-body'>");
        out.println("<p style='font-size: 30pt' class='text-white m-0'>  Juros Simples </p>");
      out.println("</div>");
    out.println("</div>");
   

  
               out.println("<br/>");
               out.println("<br/>");
               out.println("<br/>");
               out.println("<br/>");
               
out.println("<form action= 'simples.html'>");
            out.println(" Capital Inicial: <input type='text' name='c'>");
            out.println(" Taxa de Juros: <input type='text' name='i'>");
            out.println(" Tempo(Anos): <input type='text' name='t'>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("</form>");
            
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            out.println("<br/");
            
                out.println("<div class='col-md-4 mb-5'>");
        out.println("<div class='card h-100'>");
          out.println("<div class='card-body'>");   
               out.println("<h2 class='card-title'>Equipe</h2>");
            out.println("<p class='card-text'> Daniel Ribeiro Ferreira da Silva </p>");
            out.println("<p class='card-text'> Ernandes Roberto Papa Braga</p>");
          out.println("</div>");
          out.println("<div class='card-footer'>");
           
          out.println("</div>");
        out.println("</div>");
      out.println("</div>");
      out.println("<!-- /.col-md-4 -->");

    out.println("</div>");
   out.println(" <!-- /.row -->");

  out.println("</div>");
  out.println("<!-- /.container -->"); 
  out.println("<!-- Footer -->");
  out.println("<footer class='py-5 bg-dark'>");
    out.println("<div class='container'>");
      out.println("<p class='m-0 text-center text-white'>Copyright &copy; Your Website 2019</p>");
    out.println("</div>");
    out.println("<!-- /.container -->");
 out.println("</footer>");

  out.println("<!-- Bootstrap core JavaScript -->");
  out.println("<script src='vendor/jquery/jquery.min.js'></script>");
  out.println("<script src='vendor/bootstrap/js/bootstrap.bundle.min.js'></script>");

out.println("</body");

out.println("</html>");

           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
