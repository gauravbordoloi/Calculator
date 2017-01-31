package com.gmonetix.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
class Helpers {
    static String division = "&divide;";
    static String inverseSin = "sin<sup>-1</sup>";
    static String inverseCos = "cos<sup>-1</sup>";
    static String inverseTan = "tan<sup>-1</sup>";
    static String exponential = "e<sup>x</sup>";
    static String tenPowerX = "10<sup>x</sup>";
    static String cubeSquare = "3&radic;";
    static String cubeRoot = "x<sup>3</sup>";
    static String yPowerX = "Y<sup>x</sup>";
    static String squareRoot = "&radic;";
    static String xSquare = "x<sup>2</sup>";
    static String pi = "&pi;";
    public static void displayErrorMessage(Context context){
        Toast.makeText(context, "Input field must not be zero", Toast.LENGTH_LONG).show();
    }
    public static boolean isZero(EditText input){
        if(Double.parseDouble(input.getText().toString()) == 0){
            return true;
        }
        return false;
    }
    public static int getTopicId(Bundle bundle, String inputValue){
        int id = 0;
        if(bundle != null){
            id  = bundle.getInt(inputValue);
        }
        return id;
    }
}