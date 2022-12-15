package com.example.unitconcerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Conversion extends AppCompatActivity {

    String selectedUnit;
    Spinner fromUnit , toUnit;
    EditText input;
    TextView output,unit;
    public final String[] temperatureUnits = {"Celsius","Fahrenheit","Kelvin"};
    public final String[] speedUnits = {"Mile per hour","Foot per second","Meter per second","Kilometer per hour"};
    public final String[] distanceUnits = {"Kilometer","Meter","Centimeter","Millimeter","Foot","Inch"};
    public final String[] timeUnits = {"Second","Minute","Hour"};
    public final String[] weightUnits = {"Kilogram","Gram","Milligram","Tonne","Pound"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        selectedUnit = getIntent().getStringExtra("Unit");
        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        input = findViewById(R.id.editTextNumber);
        output = findViewById(R.id.result);
        unit = findViewById(R.id.textView6);

        unit.setText(selectedUnit);

        if(selectedUnit.equals("Temperature")){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,temperatureUnits);
            fromUnit.setAdapter(adapter);
            toUnit.setAdapter(adapter);
        }
        else if(selectedUnit.equals("Speed")){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,speedUnits);
            fromUnit.setAdapter(adapter);
            toUnit.setAdapter(adapter);
        }
        else if(selectedUnit.equals("Distance")){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,distanceUnits);
            fromUnit.setAdapter(adapter);
            toUnit.setAdapter(adapter);
        }
        else if(selectedUnit.equals("Time")){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,timeUnits);
            fromUnit.setAdapter(adapter);
            toUnit.setAdapter(adapter);
        }
        else if(selectedUnit.equals("Weight")){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,weightUnits);
            fromUnit.setAdapter(adapter);
            toUnit.setAdapter(adapter);
        }
    }
    public void onConvertButtonClicked(View view){
        String selectedFromUnit = fromUnit.getSelectedItem().toString();
        String selectedToUnit = toUnit.getSelectedItem().toString();

        if (selectedFromUnit.equals(selectedToUnit)){
            output.setText(input.getText().toString());
        }

        switch (selectedUnit) {
            case "Temperature":
                if (selectedFromUnit.equals("Celsius") && selectedToUnit.equals("Fahrenheit")) {
                    String result = celciusToFarenheit(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Celsius") && selectedToUnit.equals("Kelvin")) {
                    String result = celciusToKelvin(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Fahrenheit") && selectedToUnit.equals("Celsius")) {
                    String result = fahrenheitToCelcius(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Fahrenheit") && selectedToUnit.equals("Kelvin")) {
                    String result = fahrenheitToKelvin(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Kelvin") && selectedToUnit.equals("Celsius")) {
                    String result = kelvinToCelcius(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Kelvin") && selectedToUnit.equals("Fahrenheit")) {
                    String result = kelvinToFahrenheit(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                break;

            case "Speed":
                if (selectedFromUnit.equals("Mile per second") && selectedToUnit.equals("Foot per second")) {
                    String result = speedMileToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Mile per second") && selectedToUnit.equals("Meter per second")) {
                    String result = speedMileToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Mile per second") && selectedToUnit.equals("Kilometer per hour")) {
                    String result = speedMileToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot per second") && selectedToUnit.equals("Mile per second")) {
                    String result = speedFootToMile(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot per second") && selectedToUnit.equals("Meter per second")) {
                    String result = speedFootToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot per second") && selectedToUnit.equals("Kilometer per hour")) {
                    String result = speedFootToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter per second") && selectedToUnit.equals("Foot per second")) {
                    String result = speedMeterToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter per second") && selectedToUnit.equals("Mile per second")) {
                    String result = speedMeterToMile(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter per second") && selectedToUnit.equals("Kilometer per hour")) {
                    String result = speedMileToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer per hour") && selectedToUnit.equals("Foot per second")) {
                    String result = speedKilometerToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer per hour") && selectedToUnit.equals("Mile per second")) {
                    String result = speedKilometerToMile(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer per hour") && selectedToUnit.equals("Meter per second")) {
                    String result = speedKilometerToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                break;

            case "Distance":
                if (selectedFromUnit.equals("Kilometer") && selectedToUnit.equals("Meter")) {
                    String result = kilometerToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer") && selectedToUnit.equals("Centimeter")) {
                    String result = kilometerToCentimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer") && selectedToUnit.equals("Millimeter")) {
                    String result = kilometerToMillimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer") && selectedToUnit.equals("Foot")) {
                    String result = kilometerToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilometer") && selectedToUnit.equals("Inch")) {
                    String result = kilometerToInch(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter") && selectedToUnit.equals("Kilometer")) {
                    String result = meterToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter") && selectedToUnit.equals("Centimeter")) {
                    String result = meterToCentimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter") && selectedToUnit.equals("Millimeter")) {
                    String result = meterToMillimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter") && selectedToUnit.equals("Foot")) {
                    String result = meterToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Meter") && selectedToUnit.equals("Inch")) {
                    String result = meterToInch(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Centimeter") && selectedToUnit.equals("Kilometer")) {
                    String result = centimeterToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Centimeter") && selectedToUnit.equals("Meter")) {
                    String result = centimeterToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Centimeter") && selectedToUnit.equals("Millimeter")) {
                    String result = centimeterToMillimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Centimeter") && selectedToUnit.equals("Foot")) {
                    String result = centimeterToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Centimeter") && selectedToUnit.equals("Inch")) {
                    String result = centimeterToInch(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Millimeter") && selectedToUnit.equals("Kilometer")) {
                    String result = millimeterToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Millimeter") && selectedToUnit.equals("Meter")) {
                    String result = millimeterToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Millimeter") && selectedToUnit.equals("Centimeter")) {
                    String result = millimeterToCentimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Millimeter") && selectedToUnit.equals("Foot")) {
                    String result = millimeterToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Millimeter") && selectedToUnit.equals("Inch")) {
                    String result = milliimeterToInch(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot") && selectedToUnit.equals("Kilometer")) {
                    String result = footToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot") && selectedToUnit.equals("Meter")) {
                    String result = footToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot") && selectedToUnit.equals("Centimeter")) {
                    String result = footToCentimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot") && selectedToUnit.equals("Millimeter")) {
                    String result = footToMillimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Foot") && selectedToUnit.equals("Inch")) {
                    String result = footToInch(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Inch") && selectedToUnit.equals("Kilometer")) {
                    String result = inchToKilometer(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Inch") && selectedToUnit.equals("Meter")) {
                    String result = inchToMeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Inch") && selectedToUnit.equals("Centimeter")) {
                    String result = inchToCentimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Inch") && selectedToUnit.equals("Millimeter")) {
                    String result = inchToMillimeter(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Inch") && selectedToUnit.equals("Foot")) {
                    String result = inchToFoot(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                break;

            case "Time":
                if (selectedFromUnit.equals("Second") && selectedToUnit.equals("Minute")) {
                String result = secondToMinute(Double.parseDouble(input.getText().toString()));
                output.setText(result);
                }
                else  if (selectedFromUnit.equals("Second") && selectedToUnit.equals("Hour")) {
                    String result = secondToHour(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Minute") && selectedToUnit.equals("Hour")) {
                    String result = minuteToHour(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Minute") && selectedToUnit.equals("Second")) {
                    String result = minuteToSecond(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Hour") && selectedToUnit.equals("Second")) {
                    String result = hourToSecond(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Hour") && selectedToUnit.equals("Minute")) {
                    String result = hourToMinute(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                break;

            case "Weight":
                if (selectedFromUnit.equals("Kilogram") && selectedToUnit.equals("Gram")) {
                    String result = kilogramToGram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilogram") && selectedToUnit.equals("Milligram")) {
                    String result = kilogramToMilligram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilogram") && selectedToUnit.equals("Tonne")) {
                    String result = kilogramToTonne(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Kilogram") && selectedToUnit.equals("Pound")) {
                    String result = kilogramToPound(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Gram") && selectedToUnit.equals("Kilogram")) {
                    String result = gramToKilogram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Gram") && selectedToUnit.equals("Milligram")) {
                    String result = gramToMilligram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Gram") && selectedToUnit.equals("Tonne")) {
                    String result = gramToTonne(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Gram") && selectedToUnit.equals("Pound")) {
                    String result = gramToPound(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Milligram") && selectedToUnit.equals("Kilogram")) {
                    String result = milligramToKilogram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Milligram") && selectedToUnit.equals("Gram")) {
                    String result = milligramToGram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Milligram") && selectedToUnit.equals("Tonne")) {
                    String result = milligramToTonne(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Milligram") && selectedToUnit.equals("Pound")) {
                    String result = milligramToPound(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Tonne") && selectedToUnit.equals("Kilogram")) {
                    String result = tonneToKilogram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Tonne") && selectedToUnit.equals("Gram")) {
                    String result = tonneToGram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Tonne") && selectedToUnit.equals("Milligram")) {
                    String result = tonneToMilligram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Tonne") && selectedToUnit.equals("Pound")) {
                    String result = tonneToPound(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else if (selectedFromUnit.equals("Pound") && selectedToUnit.equals("Kilogram")) {
                    String result = poundToKilogram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Pound") && selectedToUnit.equals("Gram")) {
                    String result = poundToGram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Pound") && selectedToUnit.equals("Milligram")) {
                    String result = poundToMilligram(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }
                else  if (selectedFromUnit.equals("Pound") && selectedToUnit.equals("Tonne")) {
                    String result = poundToTonne(Double.parseDouble(input.getText().toString()));
                    output.setText(result);
                }

        }

    }
    //Temperature Conversions
    //celcius
    private String celciusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return String.valueOf(kelvin);
    }
    private String celciusToFarenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return String.valueOf(fahrenheit);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = 273.5 + ((fahrenheit - 32.0) * (5.0 / 9.0));
        return String.valueOf(kelvin);
    }
    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5 / 9;
        return String.valueOf(celcius);
    }

    //Kelvin

    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin - 273.15;
        return String.valueOf(celcius);
    }
    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = (kelvin - 273.15) * 1.8 + 32;
        return String.valueOf(fahrenheit);
    }

    //Speed Conversions
    //Mile per hour
    private String speedMileToFoot(double mile) {
        double foot = mile * 1.46667;
        return String.valueOf(foot);
    }
    private String speedMileToMeter(double mile) {
        double meter = mile / 2.237;
        return String.valueOf(meter);
    }
    private String speedMileToKilometer(double mile) {
        double kilometer = mile * 1.609;
        return String.valueOf(kilometer);
    }

    //foot per second
    private String speedFootToMile(double foot) {
        double mile = foot / 1.467;
        return String.valueOf(mile);
    }
    private String speedFootToMeter(double foot) {
        double meter = foot / 3.281;
        return String.valueOf(meter);
    }
    private String speedFootToKilometer(double foot) {
        double kilometer = foot * 1.097;
        return String.valueOf(kilometer);
    }

    //meter per second
    private String speedMeterToMile(double meter) {
        double mile = meter * 2.237;
        return String.valueOf(mile);
    }
    private String speedMeterToFoot(double meter) {
        double foot = meter * 3.281;
        return String.valueOf(foot);
    }
    private String speedMeterToKilometer(double meter) {
        double kilometer = meter * 3.6;
        return String.valueOf(kilometer);
    }

    //kilometer per hour
    private String speedKilometerToMile(double kilometer) {
        double mile = kilometer / 1.609;
        return String.valueOf(mile);
    }
    private String speedKilometerToMeter(double kilometer) {
        double meter = kilometer / 3.6;
        return String.valueOf(meter);
    }
    private String speedKilometerToFoot(double kilometer) {
        double foot = kilometer / 1.097;
        return String.valueOf(foot);
    }

    //Distance Conversions
    //kilometer
    private String kilometerToMeter(double kilometer) {
        double meter = kilometer * 1000;
        return String.valueOf(meter);
    }
    private String kilometerToCentimeter(double kilometer) {
        double centimeter = kilometer * 100000;
        return String.valueOf(centimeter);
    }
    private String kilometerToMillimeter(double kilometer) {
        double millimeter = kilometer * 1000000;
        return String.valueOf(millimeter);
    }
    private String kilometerToFoot(double kilometer) {
        double foot = kilometer * 3281;
        return String.valueOf(foot);
    }
    private String kilometerToInch(double kilometer) {
        double inch = kilometer * 39370;
        return String.valueOf(inch);
    }

    //meter
    private String meterToKilometer(double meter) {
        double Kilometer = meter * 3.6;
        return String.valueOf(Kilometer);
    }
    private String meterToCentimeter(double meter) {
        double centimeter = meter * 3.6;
        return String.valueOf(centimeter);
    }
    private String meterToMillimeter(double meter) {
        double millimeter = meter * 3.6;
        return String.valueOf(millimeter);
    }
    private String meterToFoot(double meter) {
        double foot = meter * 3.6;
        return String.valueOf(foot);
    }
    private String meterToInch(double meter) {
        double inch = meter * 3.6;
        return String.valueOf(inch);
    }

    //Centimeter
    private String centimeterToKilometer(double centimeter) {
        double Kilometer = centimeter / 100000;
        return String.valueOf(Kilometer);
    }
    private String centimeterToMeter(double centimeter) {
        double meter = centimeter / 100;
        return String.valueOf(meter);
    }
    private String centimeterToMillimeter(double centimeter) {
        double millimeter = centimeter / 10;
        return String.valueOf(millimeter);
    }
    private String centimeterToFoot(double centimeter) {
        double foot = centimeter / 30.48;
        return String.valueOf(foot);
    }
    private String centimeterToInch(double centimeter) {
        double inch = centimeter / 2.25;
        return String.valueOf(inch);
    }

    //Millimeter
    private String millimeterToKilometer(double millimeter) {
        double Kilometer = millimeter / 1000000;
        return String.valueOf(Kilometer);
    }
    private String millimeterToMeter(double millimeter) {
        double meter = millimeter / 1000;
        return String.valueOf(meter);
    }
    private String millimeterToCentimeter(double millimeter) {
        double centimeter = millimeter / 10;
        return String.valueOf(centimeter);
    }
    private String millimeterToFoot(double millimeter) {
        double foot = millimeter / 304.8;
        return String.valueOf(foot);
    }
    private String milliimeterToInch(double millimeter) {
        double inch = millimeter / 25.4;
        return String.valueOf(inch);
    }

    //Foot
    private String footToKilometer(double foot) {
        double Kilometer = foot / 3281;
        return String.valueOf(Kilometer);
    }
    private String footToMeter(double foot) {
        double meter = foot / 3.281;
        return String.valueOf(meter);
    }
    private String footToCentimeter(double foot) {
        double centimeter = foot * 30.48;
        return String.valueOf(centimeter);
    }
    private String footToMillimeter(double foot) {
        double millimeter = foot * 304.8;
        return String.valueOf(foot);
    }
    private String footToInch(double foot) {
        double inch = foot * 12;
        return String.valueOf(inch);
    }

    //Inch
    private String inchToKilometer(double inch) {
        double Kilometer = inch / 39370;
        return String.valueOf(Kilometer);
    }
    private String inchToMeter(double inch) {
        double meter = inch / 39.37;
        return String.valueOf(meter);
    }
    private String inchToCentimeter(double inch) {
        double centimeter = inch * 2.54;
        return String.valueOf(centimeter);
    }
    private String inchToFoot(double inch) {
        double foot = inch / 12;
        return String.valueOf(foot);
    }
    private String inchToMillimeter(double inch) {
        double millimeter = inch * 25.4;
        return String.valueOf(millimeter);
    }

    //Time Conversion
    //Second
    private String secondToMinute(double second) {
        double minute = second / 60;
        return String.valueOf(minute);
    }
    private String secondToHour(double second) {
        double hour = second / 3600;
        return String.valueOf(hour);
    }

    //Minute
    private String minuteToSecond(double minute) {
        double second = minute * 60;
        return String.valueOf(second);
    }
    private String minuteToHour(double minute) {
        double hour = minute / 60;
        return String.valueOf(hour);
    }

    //Hour
    private String hourToSecond(double hour) {
        double second = hour * 3600;
        return String.valueOf(second);
    }
    private String hourToMinute(double hour) {
        double minute = hour * 60;
        return String.valueOf(minute);
    }

    //Weight Conversion
    //Kilogram
    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }
    private String kilogramToMilligram(double kilogram) {
        double milligram = kilogram * 1000000;
        return String.valueOf(milligram);
    }
    private String kilogramToTonne(double kilogram) {
        double tonne = kilogram / 1000;
        return String.valueOf(tonne);
    }
    private String kilogramToPound(double kilogram) {
        double pound = kilogram * 2.205;
        return String.valueOf(pound);
    }

    //Gram
    private String gramToKilogram(double gram) {
        double kilogram = gram / 1000;
        return String.valueOf(gram);
    }
    private String gramToMilligram(double gram) {
        double milligram = gram * 1000;
        return String.valueOf(milligram);
    }
    private String gramToTonne(double gram) {
        double tonne = gram / 1000000;
        return String.valueOf(tonne);
    }
    private String gramToPound(double gram) {
        double pound = gram / 453.6;
        return String.valueOf(pound);
    }

    //Milligram
    private String milligramToKilogram(double wt) {
        double kilogram = wt / 1000000;
        return String.valueOf(kilogram);
    }
    private String milligramToGram(double wt) {
        double gram = wt / 1000;
        return String.valueOf(gram);
    }
    private String milligramToTonne(double wt) {
        double tonne = wt / 907184740;
        return String.valueOf(tonne);
    }
    private String milligramToPound(double wt) {
        double pound = wt / 453600;
        return String.valueOf(pound);
    }

    //Tonne
    private String tonneToKilogram(double wt) {
        double kilogram = wt * 1000;
        return String.valueOf(kilogram);
    }
    private String tonneToGram(double wt) {
        double gram = wt * 1000000;
        return String.valueOf(gram);
    }
    private String tonneToMilligram(double wt) {
        double milligram = wt * 907184740;
        return String.valueOf(milligram);
    }
    private String tonneToPound(double wt) {
        double pound = wt * 2205;
        return String.valueOf(pound);
    }

    //Pound
    private String poundToKilogram(double wt) {
        double kilogram = wt / 2.205;
        return String.valueOf(kilogram);
    }
    private String poundToGram(double wt) {
        double gram = wt * 453.6;
        return String.valueOf(gram);
    }
    private String poundToMilligram(double wt) {
        double milligram = wt * 453600;
        return String.valueOf(milligram);
    }
    private String poundToTonne(double wt) {
        double tonne = wt * 2205;
        return String.valueOf(tonne);
    }
}