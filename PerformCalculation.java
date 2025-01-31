import java.util.List;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PerformCalculation implements ActionListener 
{
    private CalculatorFrame mainFrame;
    private List<Float> submittedVals = new ArrayList<Float>(); 
    private Float bet1Stake;
    private Float bet2Stake;

    public PerformCalculation(CalculatorFrame mainframe)
    {
        this.mainFrame = mainframe;
        submittedVals.add(null);
        submittedVals.add(null);
        submittedVals.add(null);
    }

    @Override
    // Function for when the calculate button is pressed
    public void actionPerformed(ActionEvent e) 
    {
        try
        {
        mainFrame.calcButtonPressed();
        JTextField x = mainFrame.getBet1Field();
        Float i = mainFrame.getInputValues(x);
        this.submittedVals.set(0, i);
        
        JTextField y = mainFrame.getBet2Field();
        Float j = mainFrame.getInputValues(y);
        this.submittedVals.set(1, j);

        JTextField z = mainFrame.getStakeField();
        Float k = mainFrame.getInputValues(z);
        this.submittedVals.set(2, k);
        }
        catch(NumberFormatException a)
        {
            mainFrame.setEnterOdds();
            System.out.println("Exception Caught: " + e);
        }

        this.calculateBet1Stake();
        this.calculateBet2Stake();
        mainFrame.setStakes();
        System.out.println(submittedVals); //debugging line
    }

    public List<Float> getSubmittedVals()
    {
        return submittedVals;
    }

    public void setSubmittedVals(Float i, List<Float> x)
    {
        for(int j=0; j<3; j++)
        {
            x.set(j, i);
        }
        System.out.println(x); //debugging line
    }

    public void calculateBet1Stake()
    {
        bet1Stake = (float) (this.submittedVals.get(2) * this.submittedVals.get(1)) / (this.submittedVals.get(0) + this.submittedVals.get(1)); 
        System.out.println(bet1Stake);
    }

    public void calculateBet2Stake()
    {
        // This gets the value of the entire stake
        float x = this.submittedVals.get(2);

        bet2Stake = x - this.getBet1Stake(); // The difference between the entire stake and bet1 stake
    }

    public Float getBet1Stake()
    {
        return bet1Stake;
    }

    public Float getBet2Stake()
    {
        return bet2Stake;
    }
}
