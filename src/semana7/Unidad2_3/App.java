package semana7.Unidad2_3;

public class App {
    public static class BankAccount {
        String accountnumber;
        String owner;
        double balance;
        //metodos
        void deposit(double amount){
            balance += amount;
            System.out.println("deposito:" + amount + "nuevo blanace:"+ balance );
        }
        void withdraw(double amount){
            if (balance>=amount) {
                balance -=amount;
                System.out.println("retiro:"+ amount +"ahora el balance es:"+ balance);
                
            }else{
                System.out.println("no tiene fondos suficientes");
            }
        }
        void showBalance(){
            System.out.println( owner+ " su balance es:"+ balance);
        }    }
    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.accountnumber = "555-555-5555";
        account1.balance = 2000000;
        account1.owner = "yisus";
       
        account1.showBalance();
        account1.deposit(200000);
        account1.withdraw(1000000);

    }
    
}