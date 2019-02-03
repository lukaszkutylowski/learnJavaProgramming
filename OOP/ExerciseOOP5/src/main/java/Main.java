import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Master master = new Master();
        System.out.println(master.name);
        System.out.println(master.getName());
        System.out.println(master.returnName());

        Slave slave = new Slave();
        System.out.println(slave.name);
        System.out.println(slave.getName());
        System.out.println(slave.returnName());
    }
}
