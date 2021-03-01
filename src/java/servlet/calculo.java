/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jsolis
 */
@WebServlet(name = "calculo", urlPatterns = {"/calculo"})
public class calculo extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String condicion = null;
        float altura = Float.parseFloat(request.getParameter("altura"));
      float peso = Float.parseFloat(request.getParameter("peso"));
      
      float total = peso / (altura * altura);
    if(total<20.7){
        condicion = "Bajo Peso";
    }
    else if(total >= 20.7 & total<26.4){
        condicion = "Peso Ideal";
    }
    else if(total >=26.4 & total <27.8){
        condicion = "Encima de Peso Ideal";
    }
    else if(total >= 27.8 & total < 31.1){
        condicion = "Obesidad";
    }
    else if(total >= 31.1){
        condicion = "Obesidad Morbida";
    }
            
      request.setAttribute("total", total);
      request.setAttribute("condicion", condicion);

      RequestDispatcher rd = request.getRequestDispatcher("calculo.jsp");
        rd.forward(request, response);
    }
}
