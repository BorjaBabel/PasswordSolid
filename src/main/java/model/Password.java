package model;

public class Password {
    private String passwordValue;
    private int score;

    public Password(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPasswordInfo(){
        return "La contraseña '" + getPasswordValue()+
                "' tiene un score de: " + getScore();
    }
}
