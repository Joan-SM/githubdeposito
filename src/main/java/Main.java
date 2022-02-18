public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

    try{
        Cuenta1.op_cuenta();
        }catch (Exception e){
            System.out.print("Fallo de operativa");
        }    
   
    }
}
