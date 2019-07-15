package extract_variable;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void should_get_when_give_4_and_5(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();
        //when
        double privecalculator = priceCalculator.getPrice(4,5);
        //then
        assertEquals(22.0,privecalculator,0);
    }
}
