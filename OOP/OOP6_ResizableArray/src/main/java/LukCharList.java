public class LukCharList implements CharList {

    private char[] array;
    private char[] temporaryArray;

    public LukCharList(){
        array = new char[0];
        temporaryArray = new char[0];
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

    private void rewrite(char[] temporary) {
        if(temporary.length > 0) {
            for (int newLength = 0; newLength < temporary.length; newLength++) {
                this.array[newLength] = temporary[newLength];
            }
        }
    }

    private char[] rewriteDel(char[] temporary) {
        if(temporary.length > 0) {
            for(int lenghtOldArray = 0; lenghtOldArray < temporary.length - 1; lenghtOldArray++) {
                this.array[lenghtOldArray] = temporary[lenghtOldArray];
            }
        }
        return this.array;
    }

    public char getByIndex(int index) {
        return this.array[index];
    }

    public char[] getAll() {
        return this.array;
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

    public int findFirst(char letter) {

        for(int index = 0; index < this.length(); index++) {
            if(this.array[index] == letter) {
                return index;
            }
        }

        return -1;
    }

    public int[] findAllIndex(char var) {
        int numberOfIndexes = 0;
        int[] temporaryArray = new int[this.array.length];
        int j = 0;

        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] == var) {
                numberOfIndexes++;
                temporaryArray[j] = i;
                j++;
            }
        }

        int[] allIndexes = new int[numberOfIndexes];
        for(int i = 0; i <= numberOfIndexes - 1; i++) {
            allIndexes[i] = temporaryArray[i];
        }

            return allIndexes;
    }

    public int[] deleteKindOfChar(char var) {
        int numberOfIndexes = 0;
        char[] temporaryArray = new char[this.array.length];
        int[] temporaryCounter = new int[this.array.length];
        int j = 0;

        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] == var) {
                numberOfIndexes++;
                temporaryCounter[j] = i;
                j++;
            } else {
                temporaryArray[i] = this.array[i];
            }
        }

        int[] allIndexes = new int[numberOfIndexes];
        for(int i = 0; i <= numberOfIndexes - 1; i++) {
            allIndexes[i] = temporaryCounter[i];
        }
        this.array = new char[numberOfIndexes];
        for(int i = 0; i <= numberOfIndexes - 1; i++) {
            this.array[i] = temporaryArray[i];
        }

        return allIndexes;
    }

    @Override
    public String toString() {
        String arrayToString = "[";

        for(int i = 0; i < this.array.length; i++){
            arrayToString += array[i];
        }
        arrayToString += "]";

        return arrayToString;
    }
}
