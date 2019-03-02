public class LukCharList implements CharList {

    public char[] array = new char[0];
    public char[] temporaryArray = new char[0];

    public LukCharList(){
    }

    public int save(char charToSave) {
        if(this.array.length > 0) {
            temporaryArray = this.array;
        }
        this.array = new char[this.array.length + 1];
        rewrite(temporaryArray);
        array[this.array.length - 1] = charToSave;
        return this.array.length - 1;
    }

    private char[] rewrite(char[] temporary) {
        if(temporary.length > 0) {
            for(int newLength = 0; newLength < temporary.length; newLength++) {
                this.array[newLength] = temporary[newLength];
            }
        }
        return this.array;
    }

    private char[] rewriteDel(char[] temporary) {
        if(temporary.length > 0) {
            for(int newLength = 0; newLength < temporary.length - 1; newLength++) {
                this.array[newLength] = temporary[newLength];
            }
        }
        return this.array;
    }

    public char getByIndex(int index) {
        return this.array[index];
    }

    public char[] getAll() {
        char[] charArray = new char[this.array.length];
        for(int i = 0; i < this.array.length; i++){
            charArray[i] = array[i];
        }
        return charArray;
    }

    public char delete(int indexDel) {
        temporaryArray = this.array;
        char deletedChar = this.array[indexDel];
        this.array = new char[indexDel];
        this.rewriteDel(temporaryArray);
        return deletedChar;
    }

    public int length() {
        return this.array.length;
    }

    public int countChar(char var) {
        int numberOfChar = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == var) {
                numberOfChar++;
            }
        }

        return numberOfChar;
    }

    public int findFirst(char var) {
        int charIndex = -1;

        for(int i = 0; i < this.array.length; i++) {
            if(this.array[i] == var) {
                charIndex = i;
                i = this.array.length;
            }
        }
        return charIndex;
    }

    public int findLast(char var) {
        int charIndex = -1;

        for(int i = this.array.length; i > 0; i--) {
            if(this.array[i - 1] == var) {
                charIndex = i - 1;
                i = 0;
            }
        }
        return charIndex;
    }

    public int[] findAllIndex(char var) {
        return new int[0];
    }

    public int[] deleteKindOfChar(char val) {
        return new int[0];
    }
}
