import java.util.List;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PerformCalculation implements ActionListener 
{
    private CalculatorFrame mainFrame;
    private List<Integer> submittedVals = new ArrayList<Integer>(); 

    public PerformCalculation(CalculatorFrame mainframe)
    {
        this.mainFrame = mainframe;
        submittedVals.add(0);
        submittedVals.add(0);
        submittedVals.add(0);
    }

    @Override
    // Function for when the calculate button is pressed
    public void actionPerformed(ActionEvent e) 
    {
        try
        {
        mainFrame.calcButtonPressed();
        JTextField x = mainFrame.getBet1Field();
        int i = mainFrame.getInputValues(x);
        this.submittedVals.set(0, i);
        
        JTextField y = mainFrame.getBet2Field();
        int j = mainFrame.getInputValues(y);
        this.submittedVals.set(1, j);

        JTextField z = mainFrame.getStakeField();
        int k = mainFrame.getInputValues(z);
        this.submittedVals.set(2, k);
        }
        catch(NumberFormatException a)
        {
            mainFrame.setEnterOdds();
            System.out.println("Exception Caught: " + e);
        }

        System.out.println(submittedVals); //debugging line
    }

    public List<Integer> getSubmittedVals()
    {
        return submittedVals;
    }

    public void setSubmittedVals(Integer i, List<Integer> x)
    {
        for(int j=0; j<3; j++)
        {
            x.set(j, i);
        }
        System.out.println(x); //debugging line
    }
}
