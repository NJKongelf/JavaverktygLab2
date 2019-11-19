import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


@DisplayName("The dieing breaths of a Javastudent \uD83D\uDC80")
public class CalculaterTest extends TestOkOrNot{
    private  Calculator c;

    @ParameterizedTest
    @Order(3)
    @DisplayName("\t➕\t\"Did i turn off the stov??\" \uD83D\uDE31")
    @CsvSource(value = {"1:1:2","2.5:2.5:5","4:2:6","257:352:609"}, delimiter = ':')
    void calcAddition_ShouldReturnSumOFTheFirstTwoValueInSource(Double num1,Double num2,double num3){
            assertEquals(num3, c.calcAddition(num1, num2));
            assertDoesNotThrow(()->c.calcAddition(num2,num1));
    }

    @Test
    @Order(1)
    @DisplayName("\t\uD83D\uDD31\t\"Psycho\" by Hitchcock \n is a classic ")
    void calcArraySize_ShouldReturnSizeOfAmoutOfNumbersInSource(TestInfo testInfo){
         int[] numbArray={2,4,6,7006,80,1,0,9};
        assertEquals(8,c.calcArraySize(numbArray));
        assertDoesNotThrow(()->c.calcArraySize(numbArray));
        System.out.println(testInfo.getDisplayName());
    }

    @RepeatedTest(7)
    @Order(2)
    @DisplayName("➗ I can say Chimichanga in seven languages")
    void calcDivide_shouldReturnSmallerDouble(){

        assertThrows(ArithmeticException.class, () -> {
            c.calcDivsion(1,0); });
        assertDoesNotThrow(()->c.calcDivsion(2,1));

    }
    @Test
    @Order(4)
    @DisplayName("\t✖\t \"It's only a flesh wound.\" \n–Monty Python and the Holy Grail")
    void calcMltiplication_ShouldReturnAMultipliedNumber(TestInfo testInfo){
        assertDoesNotThrow(() ->  c.calcMltiplication(0,0));
        assertEquals(100,c.calcMltiplication(10,10));
        System.out.println(testInfo.getDisplayName());
    }
    @Test
    @ExtendWith(TestOkOrNot.class)
    @Order(5)
    @DisplayName("\t➖ \t\"May de force be with you \"")
    void calcSubstract_ShouldReturnALowerResult(){
        assertDoesNotThrow(() ->  c.calcSubstract(0,0));
        assertEquals(666,c.calcSubstract(999,333));

    }

    @RepeatedTest(3)
    @Order(7)
    @DisplayName("If you feel lonly, see a horror movie \uD83D\uDE08")
    void calcServalMethods(){
        assertDoesNotThrow(() -> assertEquals(1,c.calcSubstract(c.calcMltiplication((int)c.calcAddition(2,3),2),9)));

    }

    @Order(6)
    @Test
    @EnabledOnOs(OS.LINUX)
    @DisplayName("‘I need your clothes, your boots, and your motorcycle’\n - Terminator 2")
    void skippedThisTestOrNor(TestInfo info){
        System.out.println("\""+info.getDisplayName()+"\" only run on Linux OS!");
    }


    @BeforeEach
     void washYourHandsBeforeDinner(){
        c = new Calculator();
    }
    @AfterEach
    void cleanTHeDishesAfterDiner(){
        c=null;
    }
}
