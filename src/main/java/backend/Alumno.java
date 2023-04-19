
package backend;


public class Alumno {
    
    private String nombre;
    private double corte1;
    private double corte2;
    private double corte3;

    public Alumno(String nombre, double corte1, double corte2,double corte3) {
        this.nombre = nombre;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3=  corte3;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCorte1() {
        return corte1;
    }

    public void setCorte1(double corte1) {
        this.corte1 = corte1;
    }

    public double getCorte2() {
        return corte2;
    }

    public void setCorte2(double Corte2) {
        this.corte2 = Corte2;
    }

    public double getCorte3() {
        return corte3;
    }

    public void setCorte3(double corte3) {
        this.corte3 = corte3;
    }
    
    
    public double calcularNotaFinal(double corte1, double corte2,double corte3){
            double notaDefinitiva = (corte1 * 0.35) + (corte2 * 0.35) + (corte3 * 0.30);
            return notaDefinitiva;
    }
   
}
