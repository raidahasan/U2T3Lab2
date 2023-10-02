import java.util.ArrayList;

public class Student {
    ArrayList<Double> list = new ArrayList<Double>();
    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor; see Note 1 below */
    public Student(String firstName, String lastName, int gradYear) {
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }

    /* Getter Methods */
// Returns firstName
    public String getFirstName() {

        return firstName;
    }

    // Returns lastName
    public String getLastName() {

        return lastName;
    }

    /* Setter Methods */
// Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {

        gradYear = newGradYear;
    }

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
        list.add(newTestScore);
    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    //Extra credit
    public double extraCredit(int points) {
        return accumulatedTestScores += points;
    }

    //Drop lowest grade
    public double dropLowest() {
        double min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
      //  list.remove(min);
        accumulatedTestScores -= min;
        testScoreCount--;
        return min;
    }



    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore(){
        double average = accumulatedTestScores/testScoreCount;
        return  average;
    }

        // this method prints the students full name, grad year, test average,
// and whether they are passing (see Note 3 below)
        public void printStudentInfo() {
            System.out.println("Student Full Name: " + firstName + " " + lastName);
            System.out.println("Graduation Year: " + gradYear);
            System.out.println("Number of tests: " + testScoreCount);
            System.out.println("Average Test Score: " + averageTestScore());
            System.out.println("Student is passing: " + isPassing());
        }
}
