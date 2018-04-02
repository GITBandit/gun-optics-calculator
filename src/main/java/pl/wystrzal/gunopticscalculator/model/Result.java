package pl.wystrzal.gunopticscalculator.model;

public class Result {

    private double moa;
    private int moaIn4ClickScale;
    private int moaIn8ClickScale;
    private double deviationInMOA4Clicks;
    private double deviationInMOA8Clicks;
    private double deviationInCentimeters4Clicks;
    private double deviationInCentimeters8Clicks;

    public Result(double moa, int moaIn4ClickScale, int moaIn8ClickScale, double deviationInMOA4Clicks, double deviationInMOA8Clicks, double deviationInCentimeters4Clicks, double deviationInCentimeters8Clicks) {
        this.moa = moa;
        this.moaIn4ClickScale = moaIn4ClickScale;
        this.moaIn8ClickScale = moaIn8ClickScale;
        this.deviationInMOA4Clicks = deviationInMOA4Clicks;
        this.deviationInMOA8Clicks = deviationInMOA8Clicks;
        this.deviationInCentimeters4Clicks = deviationInCentimeters4Clicks;
        this.deviationInCentimeters8Clicks = deviationInCentimeters8Clicks;
    }

    public Result(){

    }

    public double getMoa() {
        return moa;
    }

    public void setMoa(double moa) {
        this.moa = moa;
    }

    public int getMoaIn4ClickScale() {
        return moaIn4ClickScale;
    }

    public void setMoaIn4ClickScale(int moaIn4ClickScale) {
        this.moaIn4ClickScale = moaIn4ClickScale;
    }

    public int getMoaIn8ClickScale() {
        return moaIn8ClickScale;
    }

    public void setMoaIn8ClickScale(int moaIn8ClickScale) {
        this.moaIn8ClickScale = moaIn8ClickScale;
    }

    public double getDeviationInMOA4Clicks() {
        return deviationInMOA4Clicks;
    }

    public void setDeviationInMOA4Clicks(double deviationInMOA4Clicks) {
        this.deviationInMOA4Clicks = deviationInMOA4Clicks;
    }

    public double getDeviationInMOA8Clicks() {
        return deviationInMOA8Clicks;
    }

    public void setDeviationInMOA8Clicks(double deviationInMOA8Clicks) {
        this.deviationInMOA8Clicks = deviationInMOA8Clicks;
    }

    public double getDeviationInCentimeters4Clicks() {
        return deviationInCentimeters4Clicks;
    }

    public void setDeviationInCentimeters4Clicks(double deviationInCentimeters4Clicks) {
        this.deviationInCentimeters4Clicks = deviationInCentimeters4Clicks;
    }

    public double getDeviationInCentimeters8Clicks() {
        return deviationInCentimeters8Clicks;
    }

    public void setDeviationInCentimeters8Clicks(double deviationInCentimeters8Clicks) {
        this.deviationInCentimeters8Clicks = deviationInCentimeters8Clicks;
    }
}
