import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TtdSumTest {

    @Test
    public void testSum (){

        assertEquals(10, (5+5));

    }

    @Test
    public void testFail () {

        assertEquals(9, (5-3));
    }


    @Test
    @BeforeAll
    public static void setUpClass() {
    }

    @Test
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    @BeforeEach
    public void setUp() {
    }

    @Test
    @AfterEach
    public void tearDown() {
    }



}