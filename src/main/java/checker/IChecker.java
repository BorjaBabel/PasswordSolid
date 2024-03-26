package checker;

public interface IChecker {
    boolean checkPasswordEmpty(String password);
    int check(String password);
    int checkAllAccomplished(int score);
}
