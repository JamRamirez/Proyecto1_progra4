/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.login;

import Service.Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Usuario;
import model.usuario.ModelLogin;

/**
 *
 * @author jamca
 */
@WebServlet(name = "ControllerLogin", urlPatterns = {"/ControllerLogin","/Login"})
public class ControllerLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    private ModelLogin model;
    private Service service;
            
            
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String _request =  request.getServletPath();
        String urlresponse = "";
        switch(_request){
            case "/Login":
                urlresponse =".";
                String contrasenna = request.getParameter("contrasena");
                String id_usuario = request.getParameter("cedula");
                Usuario u = Service.singleton().crear_usuario(new Usuario(id_usuario, "", contrasenna, "", "", 0, ""));
                if(u!=null){
                    model.setCurrent_user(u);
                    HttpSession session = request.getSession(true);
                    request.setAttribute("ModelLogin", model);//No se debe mandar el modelo, ya que es una instancia
                    //a sesión general debe ser manejada por el objeto httpsession debido a que es el cookie quien va a identificar
                    session.setAttribute("Usuario", u);
                    urlresponse="view/profile/profile.jsp";
                }
                
                
                
                request.getRequestDispatcher(urlresponse).forward(request, response);
                break;
            
            
            default:
                break;
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
