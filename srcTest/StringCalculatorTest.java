import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("Pętla")
    @Test
    public void shouldAddTheUknownAmountOfnumbers() {
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when 
        int result = stringCalculator.add("1,2,3,4,5");
        //then 
        assertEquals(15, result);
    }

    @DisplayName("Zadanie z nową linią")
    @Test
    public void shouldAddTheStingWithNewLine() {
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when 
        int result = stringCalculator.add("1\n2,3");
        //then 
        assertEquals(6, result);
    }

    @DisplayName("Test z własnym znakiem rozdzielnym")
    @Test
    public void shouldReturnSomething () {
        // given
    StringCalculator stringCalculator = new StringCalculator()
        //when
    int result = stringCalculator.add("//;\n3;2;4"));
        //then
    assertEquals(9, result);
    }
}