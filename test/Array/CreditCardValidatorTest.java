package Array;

import Assignments.CreditCardValidator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CreditCardValidatorTest {

    public void testForCardNumberMustBeBetween13_and_16_digits(){
        CreditCardValidator newCard = new CreditCardValidator();
        String cardType = newCard.cardTypeDetector("35468263283");
        assertEquals("Invalid Card", cardType);
    }


    @Test
    public void testForCardType(){
        CreditCardValidator newCard = new CreditCardValidator();
        String cardType = newCard.cardTypeDetector("4388576018402626");
        assertEquals("Visa", cardType);
    }

    @Test
    public void testForValidityStatus(){
        CreditCardValidator newCard = new CreditCardValidator();
        String cardType = newCard.cardValidityDetector("4388576018402626");
        assertEquals("Invalid", cardType);
    }


}
