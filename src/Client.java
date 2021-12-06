import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.reverse("RAGNAR"));
            MyInterface service2 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service2.minChar("Dexter"));
            MyInterface service3 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service3.caseChanger("ThAnOs"));



        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}