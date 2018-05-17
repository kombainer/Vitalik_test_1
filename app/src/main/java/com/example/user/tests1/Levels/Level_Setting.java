package com.example.user.tests1.Levels;

public class Level_Setting {
    private int id;
    private String trueAnswer;
    private String falseAnswer_1;
    private String falseAnswer_2;
    private int levelStatus;


    public Level_Setting(int id, String trueAnswer, String falseAnswer_1, String falseAnswer_2, int levelStatus) {

        this.id = id;
        this.trueAnswer = trueAnswer;
        this.falseAnswer_1 = falseAnswer_1;
        this.falseAnswer_2 = falseAnswer_2;
        this.levelStatus = levelStatus;
    }

    public int getId() {
        return id;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public String getFalseAnswer_1() {
        return falseAnswer_1;
    }

    public String getFalseAnswer_2() {
        return falseAnswer_2;
    }

    public int getLevelStatus() {
        return levelStatus;
    }

}