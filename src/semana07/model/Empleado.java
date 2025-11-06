package semana07.model;

public class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected Direccion direccion;

    public Empleado(String nombre, double salarioBase, Direccion direccion){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
        this.direccion=direccion;
    }
     
  
    public double calcularPago(){
        return salarioBase;
    }

    public void mostrarInfo(){
        System.out.println("empleado: "+nombre+direccion.getFullAddres()+" | salario base:$ "+salarioBase);
    }
}
