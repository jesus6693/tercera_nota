package semana07.model;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public Vendedor(String nombre,double salarioBase,Direccion direccion,double ventas, double comision){
        super(nombre, salarioBase, direccion);
        this.ventas=ventas;
        this.comision=comision;
    }

    public double getVentas(){
        return  ventas;
    }

    public double getComision(){
        return comision;
    }

    @Override
    public double calcularPago(){
        return salarioBase+(ventas*comision);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Vendedor: "+nombre+"|"+direccion.getFullAddres()+" | Salario total: $"+calcularPago());
    }
}
