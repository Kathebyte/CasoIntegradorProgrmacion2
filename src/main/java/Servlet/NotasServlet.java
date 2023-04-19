
package Servlet;

import backend.Alumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "NotasClientes", urlPatterns = {"/NotasClientes"})
public class NotasServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
   
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("nombre");
        String corte1=request.getParameter("corte1");
        String corte2=request.getParameter("corte2");
        String corte3=request.getParameter("corte3");
        
        Alumno alumno = new Alumno();

        double nota1= 0;
        double nota2= 0;
        double nota3=0;
       
        if (corte1 != null) {
           nota1=Double.parseDouble(corte1);
        }
        if(corte2 != null){
            nota2=Double.parseDouble(corte2);
        }
         if(corte3 != null){
            nota3=Double.parseDouble(corte3);
        }
         
        alumno.setNombre(nombre);
        alumno.setCorte1(nota1);
        alumno.setCorte2(nota2);
        alumno.setCorte3(nota3);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("alumno", alumno);

        response.sendRedirect("CalculoNotas.jsp");
        
        
//        response.setContentType("text/plain"); 
//        response.getWriter().println("Nombre:"+ (nombre) );
//        response.getWriter().println("Corte 1:"+ (nota1) );
//        response.getWriter().println("Corte 2:"+ (nota2) );
//        response.getWriter().println("Corte 3:"+ (nota3) );
//        response.getWriter().println("Nota definitiva"+ (alumno.calcularNotaFinal(nota1, nota2, nota3)) );
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
