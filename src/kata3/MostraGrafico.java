/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author LENOVO G500
 */
public class MostraGrafico extends JFrame{
    
    
    public MostraGrafico(String name){
        super(name);
        setSize(800,600);
        add(createPanel());
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        
        return chartPanel;
    }
    
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
       JFreeChart chart = org.jfree.chart.ChartFactory.createBarChart("Grafico", "Dominio email", "numero di mail", createDataset() , PlotOrientation.HORIZONTAL, false, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        return chart;
        
        
    }
    
    
    private DefaultCategoryDataset createDataset(){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(23263, "", "GMAIL.COM");
        dataset.addValue(45532, "", "HOTMAIL.COM");
        dataset.addValue(12415, "", "ALICEMAIL.COM");
        dataset.addValue(44311, "", "LIVE.COM");
        return dataset;
    }
    
    
    
    
    
    
    
    
    
}
