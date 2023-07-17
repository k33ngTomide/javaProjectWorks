package OurPracticeTasks;

public class BinaryDecimal {

    public static int toDecimal(int binary) {

        String binaryValue = binary + "";

        int total = 0;
        for (int counter = 0; counter < binaryValue.length() ; counter++) {
            int digit = (binary / (int)Math.pow(10, counter)) % 10;

            int binaryIndividual = digit * (int)Math.pow(2, counter);
            total += binaryIndividual;
        }
        return total;
    }

}
