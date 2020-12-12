package com.zybooks.exam3;

import android.widget.RadioGroup;
import android.widget.TextView;

public class Bitcoin {
    //Bitcoins to Dollars
    //Dollars to Bitcoins
    //1 Bitcoin = 18,165.90 dollars
    double bitcoinToDollars (double x) {return x* 0.000055;}
    double dollarsToBitcoin (double x) {return x * 18165.90;}
    double kiloToMiles (double x){ return x * .621372; }
    double milesToKilo (double x){
        return x * 1.60934;
    }
    double eurosToDollars(double x){ return x * 1.18; }
    double dollarsToEuros (double x){ return x * .84; }

    void calculate(double input, TextView calc, RadioGroup convert) {

    }
}
