package Minutes25;

public class FrequentNumbers {
    public static int getMostFrequent(int[] numbers) {

        int mostFrequent = 0;
        int frequency = 0;
        int count = 0;
        for(int newCounter = 0; newCounter < numbers.length; newCounter++){
            for (int counter = 0; counter < numbers.length ; counter++) {
                if (numbers[newCounter] == numbers[counter]) count++;

            }

            if (count > frequency){
                frequency = count;
                mostFrequent = numbers[newCounter];
            }
            count = 0;
        }

        return mostFrequent;
    }
}
