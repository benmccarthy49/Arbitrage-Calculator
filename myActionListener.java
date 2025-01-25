import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class myActionListener implements ActionListener 
{
    private CalculatorFrame mainFrame; 

    public myActionListener(CalculatorFrame mainframe)
    {
        this.mainFrame = mainframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.changePanel1Colour();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
