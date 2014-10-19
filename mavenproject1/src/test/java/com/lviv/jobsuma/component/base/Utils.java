/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lviv.jobsuma.component.base;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Utils {
    
    /**
     * Formatting the value as currency format
     * @param value the value to format
     * @param fractionDigitsCount the number of fraction digits to be shown
     * @return formatted string
     */
    public static String formatCurrency(double value, String format) {
        DecimalFormat df = new DecimalFormat(format);//"#,##0.00"
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        df.setDecimalFormatSymbols(symbols);
        return df.format(value);
    }
}
