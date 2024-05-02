package org.example.lap7;

public class SinhVienIT extends SinhVien{

    private double scoreJava;

    private double scoreHtml;

    public SinhVienIT() {

    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHtml() {
        return scoreHtml;
    }

    public void setScoreHtml(double scoreHtml) {
        this.scoreHtml = scoreHtml;
    }

    public SinhVienIT(double scoreJava, double scoreHtml) {
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
    }

    @Override
    double getDiem() {
        return (this.scoreJava *2 + this.scoreHtml)/3;
    }
}
