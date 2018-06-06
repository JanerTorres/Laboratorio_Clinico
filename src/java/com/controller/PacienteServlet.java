package com.controller;

import com.dao.PacienteDaoLocal;
import com.model.Paciente;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * La clase PacienteServlet se encarga de recibir y responder
 * las peticiones que se le envian del registroPaciente.jsp.
 * 
 * @author USER
 */
public class PacienteServlet extends HttpServlet {

    @EJB
    private PacienteDaoLocal pacienteDao;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     * 
     * Este metodo se utiliza para traer la informacion especificada del
     * DAO y a su vez usar metodos de este, para asignar y/o consultar en
     * la tabla Paciente de la base de datos.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        String idStr = request.getParameter("id");
        
        int id = 0;
        if(idStr != null && !idStr.equals("") )
            id = Integer.parseInt(idStr);        
        
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        String edadStr = request.getParameter("edad");
        int edad = 0;
        if(edadStr != null && !edadStr.equals(""))
            edad = Integer.parseInt(edadStr);
        
        String eps = request.getParameter("eps");
        String direccion = request.getParameter("direccion");
        
        String telefonoStr = request.getParameter("telefono");
        int telefono = 0;
        if(telefonoStr != null && !telefonoStr.equals(""))
            telefono = Integer.parseInt(telefonoStr);
        
        
        Paciente paciente = new Paciente(id, nombre, apellidos, edad, eps, direccion, telefono);
        
        if("Add".equalsIgnoreCase(action) && id != 0 && !nombre.equals("") && !apellidos.equals("") && 
                edad != 0 && !eps.equals("") && !direccion.equals("") && telefono != 0){
            pacienteDao.addPaciente(paciente);
        }
        
        request.setAttribute("paciente", paciente);
        request.setAttribute("pacientes", pacienteDao.getAllPacientes());
        request.getRequestDispatcher("registroPaciente.jsp").forward(request, response);
        
        
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
