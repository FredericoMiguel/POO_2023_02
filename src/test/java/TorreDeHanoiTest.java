import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TorreDeHanoiTest {

    @Test
    public void testResolverTorreDeHanoiComUmDisco() {
        int movimentos = TorreDeHanoi.resolverTorreDeHanoi(1, 'A', 'C', 'B');
        assertEquals(1, movimentos);
    }

    @Test
    public void testResolverTorreDeHanoiComTresDiscos() {
        int movimentos = TorreDeHanoi.resolverTorreDeHanoi(3, 'A', 'C', 'B');
        assertEquals(7, movimentos);
    }

    @Test
    public void testResolverTorreDeHanoiComCincoDiscos() {
        int movimentos = TorreDeHanoi.resolverTorreDeHanoi(5, 'A', 'C', 'B');
        assertEquals(31, movimentos);
    }

    @Test
    public void testResolverTorreDeHanoiComZeroDiscos() {
        int movimentos = TorreDeHanoi.resolverTorreDeHanoi(0, 'A', 'C', 'B');
        assertEquals(0, movimentos);
    }
}