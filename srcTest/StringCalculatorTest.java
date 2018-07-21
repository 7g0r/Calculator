import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    
    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenStringIsEmpty(){
        // given 
        StringCalculator stringCalculator = new StringCalculator();
        //when
        int result = stringCalculator.add("");
        //then 
        assertEquals(0, result);
    }

}