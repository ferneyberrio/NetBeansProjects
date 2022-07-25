package nominamain;

import javax.swing.JOptionPane;

public class Vista {
  private String nombreEmpleado;
    private int salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int diasNoTrabajados;   
    private String cargo;
    private int bonificacion;
    public void  datos(){
//        nombreEmpleado=JOptionPane.showInputDialog("Digite su nombre");
//        salarioBasico=Integer.parseInt(JOptionPane.showInputDialog("Digite su salario basico"));
//        horasExtrasDiurnas=Integer.parseInt(JOptionPane.showInputDialog("Digite las horas extras diurnas"));
//        horasExtrasNocturas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas extras noctunas"));
//        horasExtrasFestivas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas extras festivas"));
//        horasExtrasDominicales=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas extras dominicales"));
//        diasNoTrabajados=Integer.parseInt(JOptionPane.showInputDialog("Digite los dias no trabajados"));
//       Nomina nm=new Nomina(nombreEmpleado, salarioBasico, horasExtrasDiurnas, horasExtrasNocturas, horasExtrasFestivas, horasExtrasDominicales, diasNoTrabajados);
//         nm.totalHorasExtras();
//        nm.diasNotrabajados();
//        nm.ingresos();
//        nm.TotalDescuento();
//        nm.totalPgagar();
//        System.out.println(nm.toString());
        
        //DATOS PARA LA NOMINA ADMINISTRATIVOS
    
      nombreEmpleado=JOptionPane.showInputDialog("Digite su nombre");
      cargo=JOptionPane.showInputDialog("Digite su cargo");
      salarioBasico=Integer.parseInt(JOptionPane.showInputDialog("Digite su salario basico"));
      bonificacion=Integer.parseInt(JOptionPane.showInputDialog("Digite su bonificacion "));
      diasNoTrabajados=Integer.parseInt(JOptionPane.showInputDialog("Digite su bonificacion "));
     
      

      //  NominaAdmin nadmin=new NominaAdmin(cargo, bonificacion, nombreEmpleado, salarioBasico, diasNoTrabajados);
      NominaAdmin nadmin=new NominaAdmin();
      nadmin.setNombreEmpleado(nombreEmpleado);
      nadmin.setCargo(cargo);
      nadmin.setSalarioBasico(salarioBasico);
      nadmin.setDiasNoTrabajados(diasNoTrabajados);
      nadmin.setBonificacion(bonificacion);
      
        
        nadmin.diasNotrabajados();
        nadmin.ingresos();
        nadmin.TotalDescuento();
        nadmin.totalPgagar();
          System.out.println("Nombre "+nadmin.getNombreEmpleado());
          System.out.println("Cargo "+nadmin.getCargo());
          System.out.println("Bonificación "+nadmin.getBonificacion());
          System.out.println("Salario "+ nadmin.getSalarioBasico());
          System.out.println("Descuentos "+ nadmin.getDescuentos());
          System.out.println("Total Pago"+ nadmin.getTotalPago());
        
         
   
    }
    
}