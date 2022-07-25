package nominamain;

public class NominaAdmin extends Nomina{

    private String cargo;
    private int bonificacion;

    public NominaAdmin(String cargo, int bonificacion, String nombreEmpleado, int salarioBasico, int diasNoTrabajados) {
        super(nombreEmpleado, salarioBasico, diasNoTrabajados);
        this.cargo = cargo;
        this.bonificacion = bonificacion;
    }

    public NominaAdmin() {
    }

    public String getCargo() {
        return cargo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    @Override
    public void totalPgagar() {
        totalPago = ingresos - descuentos + bonificacion;

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

}// fin clase
