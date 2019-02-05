public class Start {

    public Start() {
    }

    public static void main(String[] args) {

        LukCharList lukCharList = new LukCharList();

        boolean var1 = true;
        boolean var2 = true;

        System.out.println(lukCharList.save('5'));
        System.out.println(lukCharList.save('9'));
        //System.out.println(lukCharList.save('8'));

        System.out.println("index 0: " + lukCharList.getByIndex(0));
        System.out.println("index 1: " + lukCharList.getByIndex(1));

        System.out.println(lukCharList.delete(1));
        System.out.println("index 0: " + lukCharList.getByIndex(0));

        System.out.println(lukCharList.length());
    }
}
