import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    Calculadora cal = new Calculadora();
    public static void main(String[] args) {

    }
    @Test
    public void TestMaior(){
        assertEquals(16, cal.maior(16.0,9.0),0);
        assertEquals(17, cal.maior(16.0,9.0),1);
        assertEquals(15, cal.maior(16.0,9.0),1);
    }
    @Test
    public void TestMenor(){
        assertFalse(16 == cal.menor(16.0,9.0));
        assertTrue(9 == cal.menor(16.0,9.0));
    }

    @Test
    public void deveriaTestarRaizQuadrada() {
        assertEquals(9.380, cal.raiz(88.0), 1.0);
    }

    @Test
    public void deveriaTestarDivisao(){
        assertEquals(25, cal.dividir(50,2), 0);
        //assertEquals(0, cal.dividir(50,0), 0);
        //assertEquals(0, cal.dividir(0,0), 0);

        //assertThrows(ArithmeticException.class, () -> cal.dividir(50, 0));
        //assertThrows(ArithmeticException.class, () -> cal.dividir(0, 0));
    }

    @Test
    public void deveriaTestarProduto(){
        assertEquals(1000000, cal.multiplicar(1000, 1000));
    }

    @Test
    public void deveriaTestarSoma(){
        assertEquals(20, cal.somar(10,10));
        assertFalse(21 == cal.somar(10,10));
        assertTrue(20 == cal.somar(10,10));
    }
}