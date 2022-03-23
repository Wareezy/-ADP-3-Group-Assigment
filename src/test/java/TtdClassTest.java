
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

class TtdClassTest {

    @Test
    public void testEquals (){
        assertEquals(10, (5+5));
    }

    @Test
    public void testFail () {
        assertEquals(9, (5-3));
    }

    @Test
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    @Before
    public void setUp() {
    }

    @Test
    @After
    public void tearDown() {
    }




}