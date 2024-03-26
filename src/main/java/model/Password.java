package model;

public class Password {
    private String password;
    private int score;

    public Password(String passwordValue) {
        this.password = passwordValue;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPasswordInfo(){
        return "La contraseña '" + getPassword()+
                "' tiene un score de: " + getScore();
    }
}
