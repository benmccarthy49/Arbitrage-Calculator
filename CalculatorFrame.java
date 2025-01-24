import javax.swing.*;
import java.awt.*;

public final class CalculatorFrame extends JFrame
{
    private final JFrame frame = new JFrame("ArbitrageCalculator");
    private final JButton calculate = new JButton("Calculate");
    private final JButton reset = new JButton("Reset");
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();
    private final JTextField totalPayout = new JTextField("Total Payout: ");
    private final JTextField totalProfit = new JTextField("Total Profit: ");
    private final JTextField ROI = new JTextField("ROI: ");
    private final JLabel bet1 = new JLabel("Bet 1");
    private final JTextField bet1Entry = new JTextField("Please enter bet 1 odds",15);
    private final JLabel bet2 = new JLabel("Bet 2");
    private final JTextField bet2Entry = new JTextField("Please enter bet 2 odds", 15);
    private final JLabel stake = new JLabel("Stake");

        public CalculatorFrame()
        {
            panel2.add(calculate);
            panel2.add(reset);
            panel2.add(totalPayout);
            panel2.add(totalProfit);
            panel2.add(ROI);
            panel2.setBackground(new Color(0, 170, 0));
            panel1.setBackground(new Color(0, 170, 0));

            // Layout of labels and textfields in panel 1
            panel1.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            panel1.add(bet1, c);
            c.gridx = 1;
            c.gridy = 0;
            panel1.add(bet1Entry, c);
            c.gridx = 0;
            c.gridy = 1;
            panel1.add(bet2, c);
            c.gridx = 1;
            c. gridy = 1;
            panel1.add(bet2Entry, c);

            // Styling of the labels and text fields in panel 1
            bet1.setForeground(Color.white);
            bet2.setForeground(Color.white);

            // Styling of the text fields in panel2
            totalPayout.setBackground(new Color(0, 120, 0));
            totalPayout.setForeground(Color.white);
            totalProfit.setBackground(new Color(0, 120, 0));
            totalProfit.setForeground(Color.white);
            ROI.setBackground(new Color(0, 120, 0));
            ROI.setForeground(Color.white);
            
            frame.setLayout(new GridLayout(2,1));
            frame.add(panel1);
            frame.add(panel2);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
        }
}