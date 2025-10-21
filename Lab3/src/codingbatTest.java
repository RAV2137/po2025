import static org.junit.Assert.*;

public class codingbatTest {

    @org.junit.Test     //ważne bo nie wykona się test
    public void monkeyTrouble() {
        codingbat test = new codingbat();
        assertTrue(test.monkeyTrouble(true,true));
        assertTrue(test.monkeyTrouble(false,false));
        assertFalse(test.monkeyTrouble(false,true));

    }
    @org.junit.Test     //ważne bo nie wykona się test
    public void front22() {
        codingbat test = new codingbat();

        String result= test.front22("Ha");
        assertEquals("HaHaHa",result);

        result= test.front22("");
        assertEquals("",result);

        result= test.front22("a");
        assertEquals("aaa",result);
    }
    @org.junit.Test     //ważne bo nie wykona się test
    public void maxEnd3() {
        codingbat test = new codingbat();
        int[] tab1 = {1,2,3};
        int[] result1= test.maxEnd3(tab1);
        assertArrayEquals(new int[] {3,3,3},result1);

        int[] tab2 = {2, 11, 3};
        int[] result2= test.maxEnd3(tab2);
        assertArrayEquals(new int[] {3,3,3},result2);

        int[] tab3 = {3, 11, 11};
        int[] result3= test.maxEnd3(tab3);
        assertArrayEquals(new int[] {11,11,11},result3);


    }
    @org.junit.Test     //ważne bo nie wykona się test
    public void test_hasBad(){
        codingbat test = new codingbat();
        assertTrue(test.hasBad("bad"));
        assertFalse(test.hasBad("bedsa"));
        assertTrue(test.hasBad("xbad"));


    }

    }

