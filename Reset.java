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
        mainFrame.getBet1StakeField().setText("");
        mainFrame.getBet2StakeField().setText("");
        mainFrame.getROIField().setText("");
        mainFrame.getPayoutField().setText("");
        mainFrame.getBet1PayoutField().setText("");
        mainFrame.getBet2PayoutField().setText("");
        List<Float> x = c.getSubmittedVals();
        c.setSubmittedVals(null, x);
    }
}
