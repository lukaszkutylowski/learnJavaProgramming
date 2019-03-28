import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTextTest {

    @Test
    public void processReadText() throws IOException {
        //given
        ReadFileText phrase = new ReadFileText();
        String path2 = "//home//lukasz//Pulpit//plik2.txt";
        phrase.processReadText(path2);
        //when
        //then
    }
}