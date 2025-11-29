package sanduiche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanduicheBuilderTest {

    @Test
    void deveRetornarExcecaoParaSanduicheSemPao() {
        try {
            SanduicheBuilder sanduicheBuilder = new SanduicheBuilder();
            Sanduiche sanduiche = sanduicheBuilder
                    .setPao("")
                    .setCarnes("1 carne bovina")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O sanduíche precisa ter pão", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSanduicheSemCarne() {
        try {
            SanduicheBuilder sanduicheBuilder = new SanduicheBuilder();
            Sanduiche sanduiche = sanduicheBuilder
                    .setPao("Brioche")
                    .setCarnes("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O sanduíche precisa ter ao menos uma carne", e.getMessage());
        }
    }

    @Test
    void deveRetornarSanduicheValido() {
        SanduicheBuilder sanduicheBuilder = new SanduicheBuilder();
        Sanduiche sanduiche = sanduicheBuilder
                .setPao("Brioche")
                .setCarnes("1 carne bovina")
                .setQueijo("Prato")
                .setBacon(true)
                .setOvo(true)
                .setMaionese(true)
                .setCatchup(true)
                .setMostarda(true)
                .setAlface(true)
                .setTomate(true)
                .setPicles(true)
                .setCatupiry(true)
                .build();

        assertNotNull(sanduiche);
    }
}
