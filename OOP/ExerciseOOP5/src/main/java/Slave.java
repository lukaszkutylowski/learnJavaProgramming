public class Slave extends Master {

    public String name = "slave";

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String returnName() {
        return "NEW generate name";
    }
}
