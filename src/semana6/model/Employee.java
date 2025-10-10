package semana6.model;

public class Employee {
    public String role;

    public Employee (String role){
        this.role = role;
    }

    public void showResponsabities(){
        switch (role) {
            case "manager":
            System.out.println("maneja el equipo ");
                break;
                case "developer":
                System.out.println("programa y textea");
                case "Designer":
                System.out.println("diseña");
            default:
            System.out.println("no conocido");
                break;
        }
    }
}
