public class Slave extends Master {

    public String name = "slave";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMessage() {
        return "message from slave! ";
    }
}
