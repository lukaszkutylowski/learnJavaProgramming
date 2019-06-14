import org.junit.Test;

public class ReadFileTableTest {

    @Test
    public void processReadTableThreeColumn() throws Exception {
        //given
        ReadFileTable file = new ReadFileTable();
        String path = "//home//lukasz//Pulpit//plik.txt";
        file.processReadTableThreeColumn(path);
        //when
        //then
    }
}