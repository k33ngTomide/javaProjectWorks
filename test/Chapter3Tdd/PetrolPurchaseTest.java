package Chapter3Tdd;

import ChapterThree.PetrolPurchase;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {

    @Test
    public void canPetrolPurchaseBeCreatedTest(){
        PetrolPurchase petrol = new PetrolPurchase();
        assertNotNull(petrol);
    }

    @Test
    public void canPetrolStationLocationBeSetTest(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 5.86 );
        petrol.setStationLocation("Total filling station, Sabo, Yaba");
        String location = petrol.getStationLocation();
        assertEquals("Total filling station, Sabo, Yaba", location);
    }
    @Test
    public void canPetrolTypeBeSetTest(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 5.77 );
        petrol.setTypeOfPetrol("E10-Regular");
        assertEquals("E10-Regular", petrol.getTypeOfPetrol());
    }
    @Test
    public void canPetrolQuantityBeSetTest(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 5.66 );
        petrol.setQuantity(70);
        assertEquals(70, petrol.getQuantity());
    }

    @Test
    public void canPetrolPricePerLiterBeSetTest(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 5.53 );

        petrol.setPricePerLiter(350.50);
        assertEquals(350.50, petrol.getPricePerLiter());
    }

    @Test
    public void canPercentageDiscountBeSet(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 5.3 );

        petrol.setPercentageDiscount(5.9);
        assertEquals(5.9, petrol.getPercentageDiscount());
    }

    @Test
    public void canNetPurchaseAmountBeComputedTest(){
        PetrolPurchase petrol = new PetrolPurchase("Mobil filling station", "98-Ocatave", 75, 550.90, 0.05 );

        petrol.setQuantity(45);
        petrol.setPricePerLiter(510.50);
        assertEquals(22972.5, petrol.getPurchaseAmount());

    }
}

