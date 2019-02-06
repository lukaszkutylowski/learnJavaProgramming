public class LukCharList implements CharList {

    char[] array = new char[0];

    public LukCharList(){
    }

    public int save(char charToSave) {
        char[] temporaryArray = this.array;
        this.array = new char[this.array.length + 1];
        this.rewrite(temporaryArray);
        this.array[this.array.length - 1] = charToSave;
        return this.array.length - 1;
    }

    private void rewrite(char[] temporary) {
        if(temporary.length < 0) {
            for(int newLength = 0; newLength < temporary.length; newLength++) {
                this.array[newLength] = temporary[newLength];
            }
        }
    }

    public char getByIndex(int var1) {
        return this.array[var1];
    }

    public char[] getAll() {
        return this.array;
    }

    public char delete(int indexDel) {
        char[] temporaryArrayDel = this.array;
        char deletedChar = this.array[indexDel];
        this.array = new char[indexDel];
        this.rewrite(temporaryArrayDel);
        return deletedChar;
    }

    public int length() {
        return this.array.length;
    }
}
