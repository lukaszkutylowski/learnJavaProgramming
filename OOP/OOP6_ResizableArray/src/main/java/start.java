public class żaba {
    public static void main(String[] args) {
        LukCharList lukCharList = new LukCharList();

        lukCharList.save('a');
        lukCharList.save('b');
        lukCharList.save('a');
        System.out.println(lukCharList.countChar('a'));
        System.out.println(lukCharList.getByIndex(0));
        System.out.println(lukCharList.getByIndex(1));
        System.out.println(lukCharList.getByIndex(2));
        //System.out.println(lukCharList.save('a'));

    }

}
