package test;

import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =StaticApiDocumentTest.class )
public class StaticApiDocumentTest {


    @Test
    public void generateApiDocument() throws Exception{
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.ASCIIDOC).build();
        String url="http://localhost:8080/api-docs";
        Swagger2MarkupConverter.from(new URL(url)).withConfig(config).build().toFolder(Paths.get("src/docs"));
    }
}
