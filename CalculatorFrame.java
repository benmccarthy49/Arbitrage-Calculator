import javax.swing.*;

public final class CalculatorFrame extends JFrame
{
    private final JFrame frame = new JFrame();
    private final JButton calculate = new JButton("Calculate");
    private final JButton reset = new JButton("Reset");
    private final JPanel panel = new JPanel();

        public CalculatorFrame()
        {
            panel.add(calculate);
            panel.add(reset);
            frame.setContentPane(panel);
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
}