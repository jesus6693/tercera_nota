package semana07.model;

public class Gerente extends Empleado {
    private double bono;
    

    public Gerente(String nombre,double salarioBase,Direccion direccion, double bono){
        super(nombre, salarioBase, direccion);
        this.bono=bono;
        
    }

    public double getBono(){
        return bono;
    }

    @Override
    public double calcularPago(){
        return salarioBase+bono;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Gerente: "+nombre+"|"+direccion.getFullAddres()+" | Salario total: $"+calcularPago());
    }

}