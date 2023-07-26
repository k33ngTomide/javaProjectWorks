package Array;

import Assignments.CreditCardValidator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CreditCardValidatorTest {

    @Test
    public void testForCardNumberMustBeBetween13_and_16_digits(){
        CreditCardValidator newCard = new CreditCardValidator();
        newCard.cardTypeDetector("35468263283");
        String cardType = newCard.getCardType();
        assertEquals("Invalid Card", cardType);
    }


    @Test
    public void testForCardType(){
        CreditCardValidator newCard = new CreditCardValidator();
         newCard.cardTypeDetector("4388576018402626");
        String cardType = newCard.getCardType();
        assertEquals("Visa", cardType);
    }

    @Test
    public void testForValidityStatus(){
        CreditCardValidator newCard = new CreditCardValidator();
        newCard.cardValidityDetector("5399831619690403");
        String cardValidity = newCard.getValidityStatus();
        assertEquals("Valid", cardValidity);
    }


}
