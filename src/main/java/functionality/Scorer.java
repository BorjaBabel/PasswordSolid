package functionality;

import checker.*;

public class Scorer {

    CheckerAbstract lengthChecker;
    CheckerAbstract letterChecker;
    CheckerAbstract numbersChecker;
    CheckerAbstract symbolsChecker;
    CheckerAbstract upperLowerChecker;

    public Scorer(int maxLength, int maxScore) {
        lengthChecker = new LengthChecker(maxLength, maxScore);
        letterChecker = new LetterChecker(maxLength, maxScore);
        numbersChecker = new NumbersChecker(maxLength, maxScore);
        symbolsChecker = new SymbolsChecker(maxLength, maxScore);
        upperLowerChecker = new UpperLowerChecker(maxLength, maxScore);
    }

    public int getPasswordScore(String password){
        int score = 0;
        score = lengthChecker.check(password);
        score += letterChecker.check(password);
        score += numbersChecker.check(password);
        score += symbolsChecker.check(password);
        score += upperLowerChecker.check(password);
        score += upperLowerChecker.checkAllAccomplished(score);

        return score;
    }
}
