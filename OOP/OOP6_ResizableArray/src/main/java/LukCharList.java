public class LukCharList implements CharList {

    char[] array = new char[0];

    public LukCharList(){
    }

    public int save(char var1) {
        char[] var2 = this.array;
        this.array = new char[this.array.length + 1];
        this.rewrite(var2);
        this.array[this.array.length - 1] = var1;
        return this.array.length - 1;
    }

    private void rewrite(char[] var1) {
        if(var1.length < 0) {
            for(int var2 = 0; var2 < var1.length; var2++) {
                this.array[var2] = var1[var2];
            }
        }
    }

    public char getByIndex(int var1) {
        return this.array[var1];
    }

    public char[] getAll() {
        return this.array;
    }

    public char delete(int var1) {
        char[] val1 = this.array;
        char deletedChar = this.array[array.length-1];
        this.array = new char[this.array.length -1];
        this.rewrite(val1);
        return deletedChar;
    }

    public int length() {
        return this.array.length;
    }
}
