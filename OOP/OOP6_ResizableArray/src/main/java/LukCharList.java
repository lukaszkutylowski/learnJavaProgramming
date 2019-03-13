public class LukCharList implements CharList {

    private char[] body;

    public LukCharList() {
        body = new char[0];
    }

    public int save(char aChar) {
        body = rewriteCharArray(body, new char[this.length() + 1]);
        body[this.length() - 1] = aChar;
        return this.length() - 1;
    }

    private char[] rewriteCharArray(char[] original, char[] copy) {
        if (original.length > 0) {
            for (int index = 0; index < original.length; index++) {
                copy[index] = original[index];
            }
        }
        return copy;
    }

    private char[] rewriteAndDeleteChar(char[] array, int indexOfDeleted) {
        char[] temp = new char[this.length() - 1];
        int arrayIndex = 0;

        for (int index = 0; index < this.length() - 1; index++) {
            if (index == indexOfDeleted) {
                arrayIndex++;
                temp[index] = array[arrayIndex];
            } else {
                temp[index] = array[arrayIndex];
            }
            arrayIndex++;
        }

        return temp;
    }

    public char getByIndex(int index) {
        return body[index];
    }

    public char[] getAll() {
        return body;
    }

    public char delete(int index) {
        char[] temporaryArray = rewriteCharArray(body, new char[this.length()]);
        char deletedChar = this.getByIndex(index);
        body = rewriteAndDeleteChar(temporaryArray, index);
        return deletedChar;
    }

    public int length() {
        return body.length;
    }

    public int countChar(char aChar) {
        int numberOfChar = 0;

        for (int index = 0; index < this.length(); index++) {
            if (this.getByIndex(index) == aChar) {
                numberOfChar++;
            }
        }

        return numberOfChar;
    }

    public int findFirst(char aChar) {
        for (int index = 0; index < this.length(); index++) {
            if (this.getByIndex(index) == aChar) {
                return index;
            }
        }
        return -1;
    }

    public int findLast(char aChar) {
        for (int index = this.length() - 1; index >= 0; index--) {
            if (this.getByIndex(index) == aChar) {
                return index;
            }
        }
        return -1;
    }

    private int[] rewriteIntArray(int[] temporaryArray, int[] finalArray) {
        for (int index = 0; index <= finalArray.length - 1; index++) {
            finalArray[index] = temporaryArray[index];
        }
        return finalArray;
    }

    public int[] findAllIndex(char aChar) {
        int numberOfIndexes = 0;
        int[] temporaryArray = new int[this.length()];
        int jIndex = 0;

        for (int index = 0; index < this.length(); index++) {
            if (this.getByIndex(index) == aChar) {
                numberOfIndexes++;
                temporaryArray[jIndex] = index;
                jIndex++;
            }
        }
        int[] finalArray = new int[numberOfIndexes];
        return rewriteIntArray(temporaryArray, finalArray);
    }

    public int[] deleteKindOfChar(char aChar) {
        int[] indexes = this.findAllIndex(aChar);

        for (int index = indexes.length - 1; index >= 0; index--) {
            this.delete(indexes[index]);
        }

        return indexes;
    }

    @Override
    public String toString() {
        String arrayAsString = "[";

        for (int index = 0; index < this.length(); index++) {
            arrayAsString += this.getByIndex(index) + ",";
        }
        int lastIndex = arrayAsString.length() - 1;
        if(arrayAsString.length() > 1) {
            arrayAsString = arrayAsString.substring(0, lastIndex);
        }
        arrayAsString += "]";

        return arrayAsString;
    }

    @Override
    public boolean equals(Object obj) {
        //this?

        //instanceOf - czy mozna uzyc?


        if (obj.getClass().equals(this.getClass())) {

            LukCharList lukCharList = (LukCharList) obj;
            if (lukCharList.getClass().equals(this.getClass()) && lukCharList.length() == this.length()) {
                for (int index = 0; index < this.length() - 1; index++) {
                    if (this.getByIndex(index) != lukCharList.getByIndex(index)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
//todo equals() and hashcode() @Override
    //length
    //for iteration all indexes
}
