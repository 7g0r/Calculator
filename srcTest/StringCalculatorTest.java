import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenStringIsEmpty() {
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when
        int result = stringCalculator.add("");
        //then 
        assertEquals(0, result);
    }

    @Test
    public void shouldReturn1() {
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when 
        int result = stringCalculator.add("1");
        //then 
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnSumOfTwoStrings() {
        // given
        StringCalculator stringCalculator = new StringCalculator();
        //when

        int result = stringCalculator.add("1,2");
        //then
        assertEquals(3, result);
    }
    @Test
    public void shouldAddTheUknownAmountOfnumbers(){
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when 
        int result = stringCalculator.add("1,2,3,4,5")
        //then 
        assertEquals(15, result);
    }
}