package three.demo;

public class Source {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        System.out.println("Grade = " + gradeLevel((double)testscore));
    }

    public static char gradeLevel(double g) {
        int n = (int) Math.floor(g / 10);
        switch (n) {
            case 10:
            case 9:
                return ('A');
            case 8:
                return ('B');
            case 7:
                return ('C');
            case 6:
                return ('D');
            default:
                return ('E');
        }


    }
}
