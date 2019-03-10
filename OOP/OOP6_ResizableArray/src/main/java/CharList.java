public interface CharList {

    int save(char var);

    char getByIndex(int var);

    char[] getAll();

    char delete(int var);

    int length();

    int countChar(char var);

    int findFirst(char var);

    int[] findAllIndex(char var);

    int[] deleteKindOfChar(char var);

    String toString();
}
