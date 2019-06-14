public class Wheel {

    private int revolutions;

    public int roll(int rev) {
        this.revolutions+=rev;
        return this.revolutions;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
