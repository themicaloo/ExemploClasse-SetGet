
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Michelle de Jesus Rogerio
 */
public class PersonagemJUnitTest {

    @Test

    public void testeDefinirNome() {
        Personagem sakura = new Personagem();
        sakura.setNome("Sakura");
        assertEquals("Sakura", sakura.getNome());
        sakura.setNome("Sakura Haruno");
        assertEquals("Sakura Haruno", sakura.getNome());
    }

    @Test
    public void testeDefinirEObterIdade() {
        Personagem choji = new Personagem();
        choji.setNome("Choji");
        choji.setIdade((byte) 17);
        assertEquals(17, choji.getIdade());
    }

    @Test
    public void testeDefinirEObterSexo() {
        Personagem zabuza = new Personagem();
        zabuza.setSexo('m');
        assertEquals('m', zabuza.getSexo());
    }

    @Test
    public void testeDefinirEObterNivelChakra() {
        Personagem deidara = new Personagem();
        deidara.setNivelChakra(500);
        assertEquals(500, deidara.getNivelChakra());
    }

    @Test
    public void testeDefinirEObterAldeia() {
        Personagem rockLee = new Personagem();
        rockLee.setAldeia("Folha");
        assertEquals("Folha", rockLee.getAldeia());
    }

    @Test
    public void testeDefinirEObterCla() {
        Personagem hinata = new Personagem();
        hinata.setCla("Hyüga");
        assertEquals("Hyüga", hinata.getCla());
    }

    @Test
    public void testeDefinirEObterIdadeMental() {
        Personagem jiraiya = new Personagem();
        jiraiya.setIdadeMental((byte) -10);
        assertEquals(-10, jiraiya.getIdadeMental());
    }
}
