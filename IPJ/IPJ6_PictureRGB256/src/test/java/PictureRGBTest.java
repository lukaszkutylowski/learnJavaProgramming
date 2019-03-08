import org.junit.Test;
import static org.junit.Assert.*;

public class PictureRGBTest {

    @Test
    public void should_check_api_variables() {
        //given
        final int[] RGB = {128, 28, 8};
        final int width = 128;
        final int height = 256;
        final String errorMessage = "bad";
        final String fileFormat = "jpg";
        final String pathName = "//home//lukasz//Pulpit//matrixToFile256pxl.jpg";
        PictureRGB picture = new PictureRGB(RGB, width, height, errorMessage, fileFormat, pathName);
        //when
        final int[] actualRGB = picture.getRGB();
        final int actualWidth = picture.getWidth();
        final int actualHeight = picture.getHeight();
        final String actualError = picture.getErrorMessage();
        final String actualFileFormat = picture.getFileFormat();
        final String actualPathName = picture.getPathName();
        //then
        assertArrayEquals(RGB, actualRGB);
        assertEquals(width, actualWidth);
        assertEquals(height, actualHeight);
        assertEquals(errorMessage, actualError);
        assertEquals(fileFormat, actualFileFormat);
        assertEquals(pathName, actualPathName);
    }
}