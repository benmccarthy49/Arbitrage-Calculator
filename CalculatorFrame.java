import javax.swing.*;
import java.awt.*;

public final class CalculatorFrame extends JFrame
{
    private final JFrame frame = new JFrame("ArbitrageCalculator");
    private final JButton calculate = new JButton("Calculate");
    private final JButton reset = new JButton("Reset");
    private final JPanel panel = new JPanel();
    private final JTextField totalPayout = new JTextField();
    private final JTextField totalProfit = new JTextField();
    private final JTextField ROI = new JTextField();

        public CalculatorFrame()
        {
            panel.setLayout(null);
            panel.add(calculate);
            panel.add(reset);
            panel.add(totalPayout);
            panel.add(totalProfit);
            panel.add(ROI);

            calculate.setLocation(300, 300);
            calculate.setSize(20, 20);

            frame.setContentPane(panel);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            panel.setBackground(Color.green);
        }
}