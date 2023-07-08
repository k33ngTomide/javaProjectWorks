package ChapterFive;

public class StudentGrade {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int counter = 0;
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterFailure = 0;

        for( ; counter < 5; counter++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student grade: ");
            String grade = scanner.nextLine();

            switch (grade.toUpperCase()) {
                case "A" -> counterA++;
                case "B" -> counterB++;
                case "C" -> counterC++;
                case "D" -> counterD++;
                default -> counterFailure++;

            }
        }
            System.out.println("The total number of students that got A is: " + counterA +
                    "\nThe total number of students that got B is: " + counterB +
                    "\nThe total number of students that got C is: " + counterC +
                    "\nThe total number of students that got D is: " + counterD +
                    "\nThe total number of students that got D is: " + counterFailure);
    }
}
