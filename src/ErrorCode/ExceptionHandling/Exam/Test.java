package ErrorCode.ExceptionHandling.Exam;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setScore(11);
        } catch (InvalidScoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
