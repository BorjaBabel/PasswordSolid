package checker;

public abstract class CheckerAbstract implements IChecker {
    private int maxLength;
    private int maxScore;

    protected CheckerAbstract(int maxLength, int maxScore) {
        this.maxLength = maxLength;
        this.maxScore = maxScore;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    @Override
    public boolean checkPasswordEmpty(String password){
        if(password.isEmpty()){
            return true;
        }
        return false;
    }
    @Override
    public int checkAllAccomplished(int score){
        if(score == this.maxScore ){
            return 1;
        }
        return 0;
    }
    public abstract int check(String password);
}
