package com.azizkale.junittestingproject.assertj;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

public class FileTest {

    @Test
    public void testFile(){
        File file = new File("C:/Users/azizk/Desktop/myFile.txt");

        assertThat(file)
                .exists()
                .hasFileName("myFile.txt")
                .canWrite()
                .hasExtension("txt")
                .hasName("myFile.txt");

        assertThat(contentOf(file))
                .startsWith("Lorem");

    }
}
