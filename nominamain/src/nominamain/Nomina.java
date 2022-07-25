package nominamain;

public class Nomina {
    private String nombreEmpleado;
    private int salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int diasNoTrabajados;
    private int totalHorasExtras;
    protected int descuentos;
    protected int ingresos;
    protected int totalPago;

    public Nomina() {
    }
    

    public Nomina(String nombreEmpleado, int salarioBasico, int diasNoTrabajados) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioBasico = salarioBasico;
        this.diasNoTrabajados = diasNoTrabajados;
    }

public Nomina(String nombreEmpleado, int salarioBasico, int horasExtrasDiurnas, int horasExtrasNocturas, int horasExtrasFestivas, int horasExtrasDominicales, int diasNoTrabajados) {
        this.nombreEmpleado = nombreEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtrasDiurnas = horasExtrasDiurnas;
        this.horasExtrasNocturas = horasExtrasNocturas;
        this.horasExtrasFestivas = horasExtrasFestivas;
        this.horasExtrasDominicales = horasExtrasDominicales;
        this.diasNoTrabajados = diasNoTrabajados;
    }
   //Creacion de metodos para hacer los cálculo de la nómina
    public void  ingresos(){
       ingresos=salarioBasico+totalHorasExtras-descuentos;
    
    }
    public void totalHorasExtras(){
        double vht,vhed,vhen,vhef,vhedo;
        vht=salarioBasico/240;
        vhed=(int)vht*1.25*horasExtrasDiurnas;
        vhen=vht*1.35*horasExtrasNocturas;
        vhef=vht*1.75*horasExtrasFestivas;
        vhedo=vht*2*horasExtrasDominicales;
        totalHorasExtras=(int)(vhed+vhen+vhef+vhedo);

    }
    public void diasNotrabajados(){
        float vd;
        vd=salarioBasico/30;
        descuentos=(int)vd*diasNoTrabajados;
    
        
    }
    public void TotalDescuento(){
      double salud, pension;
      salud=ingresos*0.04;
      pension=ingresos*0.04;
      descuentos=(int)(salud+pension);
    
      
    }
    public void totalPgagar(){
    
        totalPago=ingresos-descuentos;
     
    }
     public String getNombreEmpleado() {

        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int  getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getHorasExtrasDiurnas() {
        return horasExtrasDiurnas;
    }

    public void setHorasExtrasDiurnas(int horasExtrasDiurnas) {
        this.horasExtrasDiurnas = horasExtrasDiurnas;
    }

    public int getHorasExtrasNocturas() {
        return horasExtrasNocturas;
    }

    public void setHorasExtrasNocturas(int horasExtrasNocturas) {
        this.horasExtrasNocturas = horasExtrasNocturas;
    }

    public int getHorasExtrasFestivas() {
        return horasExtrasFestivas;
    }

    public void setHorasExtrasFestivas(int horasExtrasFestivas) {
        this.horasExtrasFestivas = horasExtrasFestivas;
    }

    public int getHorasExtrasDominicales() {
        return horasExtrasDominicales;
    }

    public void setHorasExtrasDominicales(int horasExtrasDominicales) {
        this.horasExtrasDominicales = horasExtrasDominicales;
    }

    public int getDiasNoTrabajados() {
        return diasNoTrabajados;
    }

    public void setDiasNoTrabajados(int diasNoTrabajados) {
        this.diasNoTrabajados = diasNoTrabajados;
    }

    public double getTotalHorasExtras() {
        return totalHorasExtras;
    }

    public void setTotalHorasExtras(int totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(int  ingresos) {
        this.ingresos = ingresos;
    }

    public int  getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(int totalPago) {
        this.totalPago = totalPago;
    }

    @Override
    
    public String toString() {
        return  "nombreEmpleado=" + nombreEmpleado + "\n, salarioBasico=" + salarioBasico +
                     "\n horasExtrasDiurnas=" + horasExtrasDiurnas + "\n horasExtrasNocturas=" + horasExtrasNocturas + 
                     "\n horasExtrasFestivas=" + horasExtrasFestivas + ",\n horasExtrasDominicales=" + horasExtrasDominicales +
                     "\n diasNoTrabajados=" + diasNoTrabajados + "\n totalHorasExtras=" + totalHorasExtras +
                      "\n descuentos=" + descuentos + "\ningresos=" + ingresos + "\n totalPago=" + totalPago ;
    }
    
    
    
}