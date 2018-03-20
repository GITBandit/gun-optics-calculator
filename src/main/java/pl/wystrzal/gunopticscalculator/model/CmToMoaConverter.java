package pl.wystrzal.gunopticscalculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CmToMoaConverter {

    public double convertCmToMoa(double cmShift, double mDistance){

        double perimeter = 2 * Math.PI * mDistance;
        double minuteOfAngle = perimeter / 21600;
        double shitfInMeters = cmShift / 100;
        double result = shitfInMeters / minuteOfAngle;
        return result;
    }

    public int convertMoaTo4ClickScale(double moa){
        return (int)Math.round(moa*4);
    }

    public int convertMoaTo8ClickScale(double moa){
        return (int)Math.round(moa*8);
    }

    public double deviationNotTOBeCorrectedInMOA4Clicks(double cmShift, double mDistance){
        double moa = convertCmToMoa(cmShift, mDistance);
        double divergency = Math.abs((convertMoaTo4ClickScale(moa) / (double)4) - moa);
        return divergency;
    }

    public double deviationNotTOBeCorrectedInMOA8Clicks(double cmShift, double mDistance){
        double moa = convertCmToMoa(cmShift, mDistance);
        double divergency = Math.abs((convertMoaTo8ClickScale(moa) / (double)8) - moa);
        return divergency;
    }

    public double deviationNotTOBeCorrectedInCentimeters(double deviationInMOA, double distanceInMeters){
        MoaToCmConverter moaToCmConverter = new MoaToCmConverter();
        double deviationInCm = moaToCmConverter.convertMoaToCm(deviationInMOA, distanceInMeters);
        return deviationInCm;
    }

    public Result getResult(double cmShift, double mDistance){
        Double moa = convertCmToMoa(cmShift, mDistance);

        Result result = new Result();
        result.setMoa(roundToDecimalPlaces(2, moa));
        result.setMoaIn4ClickScale(roundToDecimalPlaces(2,(double)convertMoaTo4ClickScale(moa)));
        result.setMoaIn8ClickScale((double)convertMoaTo8ClickScale(moa));
        result.setDeviationInMOA4Clicks(roundToDecimalPlaces(2, deviationNotTOBeCorrectedInMOA4Clicks(cmShift, mDistance)));
        result.setDeviationInMOA8Clicks(roundToDecimalPlaces(2, deviationNotTOBeCorrectedInMOA8Clicks(cmShift, mDistance)));
        result.setDeviationInCentimeters4Clicks(roundToDecimalPlaces(3, deviationNotTOBeCorrectedInCentimeters(deviationNotTOBeCorrectedInMOA4Clicks(cmShift, mDistance),mDistance)));
        result.setDeviationInCentimeters8Clicks(roundToDecimalPlaces(3, deviationNotTOBeCorrectedInCentimeters(deviationNotTOBeCorrectedInMOA8Clicks(cmShift, mDistance),mDistance)));


        return result;
    }

    public double roundToDecimalPlaces(int places, Double number){
        return new BigDecimal(number.toString()).setScale(places, RoundingMode.HALF_UP).doubleValue();

    }
}
