import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("The dieing breaths of a Javastudent \uD83D\uDC80")
public class CalculaterTests {
    private final Calculator c= new Calculator();


    @ParameterizedTest
    @DisplayName("\"Did i turn of the stov??\" \"\uD83D\uDE31\"")
    @CsvSource(value = {"1:1:2","2.5:2.5:5","4:2:6","257:352:609"}, delimiter = ':')
    void calcAddition_ShouldReturnSumOFTheFirstTwoValueInSource(Double num1,Double num2,double num3){

            assertEquals(num3, c.calcAddition(num1, num2));

    }

    @Test
    @DisplayName("\"Psycho\" by Hitchcock is a classic \"\uD83D\uDE2B")
    void calcArraySize_ShouldReturnSizeOfAmoutOfNumbersInSource(){


         int[] numbArray={2,4,6,7006,80,1,0,9};
        assertEquals(8,c.calcArraySize(numbArray));


    }

    @Test
    @DisplayName("I can say Chimichanga in seven languages.")
    void calcDivide_shouldReturnSmallerDouble(){
        assertThrows(ArithmeticException.class, () -> {
            c.calcDivsion(1,0); });
        assertDoesNotThrow(()->c.calcDivsion(2,1));
    }


}
