import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Reset implements ActionListener 
{
    private CalculatorFrame mainFrame;

    public PerformCalculation c;

    public Reset(CalculatorFrame mainFrame, PerformCalculation c)
    {
        this.mainFrame = mainFrame;
        this.c = c;
    }

    public void actionPerformed(ActionEvent e)
    {
        mainFrame.getBet1Field().setText("");
        mainFrame.getBet2Field().setText("");
        mainFrame.getStakeField().setText("");
        List<Float> x = c.getSubmittedVals();
        c.setSubmittedVals(null, x);
    }
}
