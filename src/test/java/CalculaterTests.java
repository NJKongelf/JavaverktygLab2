import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("The dieing breaths of a Javastudent \uD83D\uDC80")
public class CalculaterTests {

    @ParameterizedTest
    @DisplayName("\"Sum of all fears are boring!\" \"\uD83D\uDE31\"")
    @CsvSource(value = {"1:1:2","2.5:2.5:5","4:2:6","257:352:609"}, delimiter = ':')
    void calcAddition_ShouldReturnSumOFTheFirstTwoValueInSource(Double num1,Double num2,double num3){
        Calculater c = new Calculater();
        try {
            assertEquals(num3, c.calcAddition(num1, num2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("\"Psycho\" by Hitchcock is a classic \"\uD83D\uDE2B")
    void calcArraySize_ShouldReturnSizeOfAmoutOfNumbersInSource(){
        Calculater c = new Calculater();
     try{
         int[] numbArray={2,4,6,7006,80,1,0,9};
        assertEquals(8,c.calcArraySize(numbArray));

     }catch (Exception e){
            e.printStackTrace();
        }
    }

}
