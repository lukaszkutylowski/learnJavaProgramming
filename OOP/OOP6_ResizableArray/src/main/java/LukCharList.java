public class LukCharList implements CharList {

    private char[] array;

    public LukCharList(){
        array = new char[0];
    }

    public int save(char letter) {
        char[] temporaryArray = new char[0];
        if(array.length > 0) {
            temporaryArray = array;
        }
        array = new char[array.length + 1];
        rewrite(temporaryArray);
        array[array.length - 1] = letter;
        return array.length - 1;
    }

    private void rewrite(char[] temporaryArray) {
        if(temporaryArray.length > 0) {
            for (int index = 0; index < temporaryArray.length; index++) {
                array[index] = temporaryArray[index];
            }
        }
    }

    private char[] rewriteDel(char[] array, int indexOfDeleted) {
        char[] temp = new char[this.length() - 1];
        int arrayIndex = 0;

        for(int index = 0; index < this.length() - 1; index++) {
            if(index == indexOfDeleted) {
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
        try {
            return array[index];
        } catch (IllegalArgumentException exception) {
            return 0;
        }
    }

    public char[] getAll() {
        return array;
    }

    public char delete(int index) {
        try {
            char[] temporaryArray;
            temporaryArray = array;
            char deletedChar = this.getByIndex(index);
            array = rewriteDel(temporaryArray, index);
            return deletedChar;
        } catch (IllegalArgumentException exception) {
            return 0;
        }
    }

    public int length() {
        try {
            return array.length;
        } catch (IllegalArgumentException exception) {
            return 0;
        }
    }

    public int countChar(char letter) {
        int numberOfChar = 0;

        for(int index = 0; index < array.length; index++)
        {
            if(array[index] == letter) {
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

    public int[] findAllIndex(char letter) {
        int numberOfIndexes = 0;
        int[] temporaryArray = new int[this.array.length];
        int j = 0;

        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] == letter) {
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

    public int[] deleteKindOfChar(char letter) {
        int numberOfIndexes = 0;
        char[] temporaryArray = new char[this.array.length];
        int[] temporaryCounter = new int[this.array.length];
        int j = 0;

        for(int i = 0; i < this.array.length; i++) {
            if (this.array[i] == letter) {
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
