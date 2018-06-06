/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.ExamenesDaoLocal;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.model.Examenes;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * La clase PdfServlet se encarga de recibir y responder las peticiones que
 * se le envian de Examenes.jsp.
 *
 * @author USER
 */
public class PdfServlet extends HttpServlet {

    @EJB
    private ExamenesDaoLocal examenesDao;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * En este metodo se crea el documento pdf con los datos que se extraen 
     * de la base de datos (de la tsbla Examenes). y posterior mente lo muestra en pantalla.
     * 
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        List<Examenes> examenes = examenesDao.getAllExamenes();
        try {
            try {
                Document documento = new Document();
                PdfWriter.getInstance(documento, out);

                documento.open();

                Image img1 = Image.getInstance("C:\\Users\\USER\\Documents\\UDEA\\2018-1\\Tecn. de Prog\\Practica web - Laboratorio clinico\\App con derby\\La buena\\Con enteros y FK\\AplicacionWebLaboratorio\\web\\img\\UmbrellaLogo.png");
                img1.setAbsolutePosition(30, 725);
                img1.scaleToFit(100, 100);
                documento.add(img1);

                Paragraph ph1 = new Paragraph();
                Font titulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.DARK_GRAY);
                ph1.add(new Phrase(Chunk.NEWLINE));
                ph1.add(new Phrase("Examenes", titulo));
                ph1.setAlignment(Element.ALIGN_CENTER);
                ph1.add(new Phrase(Chunk.NEWLINE));
                ph1.add(new Phrase(Chunk.NEWLINE));
                ph1.add(new Phrase(Chunk.NEWLINE));
                ph1.add(new Phrase(Chunk.NEWLINE));
                ph1.add(new Phrase(Chunk.NEWLINE));
                documento.add(ph1);

                Paragraph descripcion = new Paragraph();
                descripcion.setAlignment(Element.ALIGN_JUSTIFIED);
                Font fontDesc = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);
                descripcion.add(new Phrase("En Umbrella Corporation se prestan diferentes servicios,"
                        + "como distintos examenes clinicos que ayudan a la gente a determinar su estado"
                        + "actual de salud fisica. Los examenes que se realizan en el actualidad son los siguientes: ", fontDesc));
                descripcion.add(new Phrase(Chunk.NEWLINE));
                descripcion.add(new Phrase(Chunk.NEWLINE));
                documento.add(descripcion);

                Paragraph ex = new Paragraph();
                Font fontEx = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);

                for (Examenes examen : examenes) {
                    ex.add(new Phrase(examen.getIdExamen() + ". " + examen.getNombreExamen(), fontEx));
                    ex.setAlignment(Element.ALIGN_JUSTIFIED);
                    ex.add(new Phrase(Chunk.NEWLINE));
                }

                documento.add(ex);

                documento.close();

            } catch (Exception e) {
                e.getMessage();
            }
        } finally {
            out.close();
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
