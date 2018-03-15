package pl.wystrzal.gunopticscalculator.model;

public class MoaToCmConverter {

    public double convertMoaToCm(double moa, double distanceInMeters){
        double perimeter = 2 * Math.PI * distanceInMeters;
        double minuteOfAngle = perimeter / 21600;
        double shitfInMeters = moa * minuteOfAngle;
        double shiftInCentimeters = shitfInMeters * 100;
        return shiftInCentimeters;
    }

}
