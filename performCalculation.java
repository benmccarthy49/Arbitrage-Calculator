import java.util.List;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class performCalculation implements ActionListener 
{
    private CalculatorFrame mainFrame;
    private List<Integer> submittedVals = new ArrayList<Integer>(); 

    public performCalculation(CalculatorFrame mainframe)
    {
        this.mainFrame = mainframe;
    }

    @Override
    // Function for when the calculate button is pressed
    public void actionPerformed(ActionEvent e) 
    {
        mainFrame.calcButtonPressed();
        JTextField x = mainFrame.getBet1Field();
        int i = mainFrame.getInputValues(x);
        this.submittedVals.add(i);
        
        JTextField y = mainFrame.getBet2Field();
        int j = mainFrame.getInputValues(y);
        this.submittedVals.add(j);

        JTextField z = mainFrame.getStakeField();
        int k = mainFrame.getInputValues(z);
        this.submittedVals.add(k);

        System.out.println(submittedVals); //debugging line
    }
}
