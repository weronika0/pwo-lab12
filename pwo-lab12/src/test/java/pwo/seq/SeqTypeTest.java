    package pwo.seq;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeqTypeTest {
    
    @Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testFromString() {
        System.out.println("fromString");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }
        
    @Test
    public void testGetGenerator() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());        
    }
}