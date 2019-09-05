/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.PreguntaDao;
import Modelo.Vo.PreguntaVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 57313
 */
public class Controlador_pregunta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    PreguntaDao dao=new PreguntaDao();
    PreguntaVO pvo=new PreguntaVO();
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /* TODO output your page here. You may use following sample code. */
 /*    out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_pregunta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_pregunta at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/

        String url = request.getServletPath();
        switch (url) {
            case "/listarpregunta":
                listarpregunta(request, response);
                break;
             case"/eliminarpregunta":
                 eliminar(response,request);
                 break;
                 case"/insertarpregunta":
                     agregarpregunta(request,response);
                     
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

    private void listarpregunta(HttpServletRequest request, HttpServletResponse response) {
        PreguntaDao dao=new PreguntaDao();
        PreguntaVO pvo=new PreguntaVO();
         ArrayList<PreguntaVO> listar=new ArrayList<>();
        listar=(ArrayList<PreguntaVO>) dao.listarme();
        try (PrintWriter out = response.getWriter()) {
            
            out.println("");
            out.println("<table border=\"1\">");
            out.println(" <thead>\n" +
"                <tr>\n" +
"                    <th>id</th>\n" +
"                    <th>Enunciado</th>\n" +
"                    <th>Valor</th>\n" +
"                    <th>Modificar</th>\n" +
"                    <th>Eliminar</th>\n" +
"                </tr>\n" +
"            </thead>");
            for (int i = 0; i < listar.size(); i++) {
                
            out.println(" <tr>\n" +
"                    <td>"+listar.get(i).getIdpregunta()+"</td>\n" +
"                    <td>"+listar.get(i).getEnunciado()+"</td>\n" +
"                    <td>"+listar.get(i).getValor()+"</td>\n" +
"                    <td><input type=\"submit\" value=\"Modificar\"></td>\n" +
"                    <td><input type=\"submit\" value=\"Eliminar\" onclick='eliminar("+listar.get(i).getIdpregunta()+")'></td>\n" +
"                </tr>");
            }
     out.println("</table>");
        } catch (Exception e) {
        }

    }

    private void eliminar(HttpServletResponse response, HttpServletRequest request) throws IOException {
       int id=Integer.parseInt(request.getParameter("id"));
       PreguntaDao dao=new PreguntaDao();
       dao.eliminar(id);
       try (PrintWriter out = response.getWriter()) {
          out.println("<script>formuario()</script>");
       }
       
    }

    private void agregarpregunta(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String enunciado=request.getParameter("enunciado");
        int valor =Integer.parseInt(request.getParameter("valor"));
        pvo.setEnunciado(enunciado);
        pvo.setValor(valor);
        dao.insertar(pvo);
        try (PrintWriter out = response.getWriter()) {
          out.println("<script>formuario()</script>");
       }
    }
}
