package ErrorCode.ExceptionHandling.Exam;

public class Student {
    private String name;
    private int score;

    

    public void setScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 10) {
            throw new InvalidScoreException("Score must be between 0 and 10");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    

    


    
    
}
