/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO G500
 */
public class Kata3 {

    
    public static void main(String[] args) {
         Histogram<String> histogram = new Histogram<>();
        
        histogram.insert("GMAIL.COM");
        histogram.insert("HOTMAIL.COM");
        histogram.insert("ALICEMAIL.COM");
        histogram.insert("VIRGILIOMAIL.COM");
        histogram.insert("ULPGC.ES");
         histogram.insert("ALICEMAIL.COM");
        histogram.insert("VIRGILIOMAIL.COM");
        histogram.insert("ULPGC.ES");
         histogram.insert("ALICEMAIL.COM");
        histogram.insert("VIRGILIOMAIL.COM");
        histogram.insert("ULPGC.ES");
         histogram.insert("ALICEMAIL.COM");
        histogram.insert("VIRGILIOMAIL.COM");
        MostraGrafico mainGraf = new MostraGrafico("Grafico", histogram);
        
        
    }
    
}
