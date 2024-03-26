package checker;

public class Checker {
    private int maxLength;
    private int maxScore;

    public Checker(int maxLength, int maxScore) {
        this.maxLength = maxLength;
        this.maxScore = maxScore;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean checkPasswordEmpty(String password){
        if(password.isEmpty()){
            return true;
        }
        return false;
    }

    public int checkLength(String password){
        int length = password.length();
        int score = 0;
        if (length >= 7 && length <= 8) {
            score = 1;
        } else if(length >= 9 && length <= this.maxLength){
            score = 2;
        }
        else if (length > this.maxLength) {
            score = 3;
        }
        return score;
    }
    public int checkHasLetters(String word){
        int score = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                score = 1;
                break;
            }
        }
        return score;
    }

    public int checkHasNumbers(String word){
        int score = 0;
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                score = 1;
                break;
            }
        }
        return score;
    }

    public int checkHasUpperAndLower(String word){
        boolean containsUpper = false;
        boolean containsLower = false;
        int score;
        for (char c : word.toCharArray()) {

            if (Character.isUpperCase(c)) {
                containsUpper = true;
            } else if (Character.isLowerCase(c)) {
                containsLower = true;
            }

            if (containsLower && containsUpper) {
                break;
            }
        }

        if (containsLower && containsUpper) {
            score = 2;
        } else {
            score = 0;
        }
        return score;
    }

    public int checkHasSymbols(String word){
        int score = 0;
        if(word.matches(".*\\W.*"))
            score = 2;

        return score;
    }

    public int checkAllAccomplished(int score){
        if(score == this.maxScore ){
            return 1;
        }
        return 0;
    }



}
