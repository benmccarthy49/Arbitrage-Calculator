import javax.swing.*;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class CalculatorFrame extends JFrame
{
    private final JFrame frame = new JFrame("ArbitrageCalculator");
    private final JButton calculate = new JButton("Calculate");
    private final JButton reset = new JButton("Reset");
    private final JPanel panel1 = new JPanel();
    private final JPanel panel2 = new JPanel();

    private final JTextField totalPayout = new JTextField("Total Payout: ", 12);
    private final JTextField totalProfit = new JTextField( 12);
    private final JLabel ProfitLabel = new JLabel("Total Profit");
    private final JTextField ROI = new JTextField("ROI: ", 12);

    private final JLabel bet1 = new JLabel("Bet 1 ");
    private final JTextField bet1Entry = new JTextField( 15);
    private final JLabel bet2 = new JLabel("Bet 2 ");
    private final JTextField bet2Entry = new JTextField( 15);
    private final JLabel stake = new JLabel("Stake ");
    private final JTextField stakeEntry = new JTextField( 15);
    private final JLabel enterOdds = new JLabel("Enter Odds and Stake");
    private final JTextField bet1Stake = new JTextField(10);
    private final JTextField bet2Stake = new JTextField(10);
    private final JTextField bet1Payout = new JTextField(10);
    private final JTextField bet2Payout = new JTextField(10);
    private final JLabel payout = new JLabel("Payout");

    private PerformCalculation listener;

    public CalculatorFrame()
    {
        panel2.add(calculate);
        panel2.add(reset);
        panel2.add(totalPayout);
        panel2.add(totalProfit);
        panel2.add(ROI);
        panel2.setBackground(new Color(128, 128, 128));
        panel1.setBackground(new Color(128, 128, 128));

        // Layout of labels and textfields in panel 1
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 3, 5, 5);
        c.gridx = 1;
        c.gridy = 0;
        panel1.add(enterOdds, c);
        c.gridx = 0;
        c.gridy = 1;
        panel1.add(bet1, c);
        c.gridx = 1;
        c.gridy = 1;
        panel1.add(bet1Entry, c);
        c.gridx = 2;
        c.gridy = 1;
        panel1.add(bet1Stake, c);
        c.gridx = 3;
        c.gridy = 1;
        panel1.add(bet1Payout, c);
        c.gridx = 0;
        c.gridy = 2;
        panel1.add(bet2, c);
        c.gridx = 1;
        c.gridy = 2;
        panel1.add(bet2Entry, c);
        c.gridx = 2;
        c.gridy = 2;
        panel1.add(bet2Stake, c);
        c.gridx = 3;
        c.gridy = 2;
        panel1.add(bet2Payout, c);
        c.gridx = 0;
        c.gridy = 3;
        panel1.add(stake, c);
        c.gridx = 1;
        c.gridy = 3;
        panel1.add(stakeEntry, c);
        c.gridx = 2;
        c.gridy = 0;
        panel1.add(stake, c);
        c.gridx = 3;
        c.gridy = 0;
        panel1.add(payout, c);

        // Button listeners
        listener = new PerformCalculation(this);
        calculate.addActionListener(listener);
        Reset listener2 = new Reset(this, listener);
        reset.addActionListener(listener2);


        // Styling of the labels and text fields in panel 1
        bet1.setForeground(Color.white);
        bet2.setForeground(Color.white);
        stake.setForeground(Color.white);
        enterOdds.setForeground(Color.white);

        // Layout of labels and textfields in panel 2
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 3, 5, 5);
        gbc.gridx = 3;
        gbc.gridy = 0;
        panel2.add(totalPayout, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel2.add(ProfitLabel, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel2.add(totalProfit, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel2.add(ROI, gbc);

        // Styling of the text fields in panel2
        totalPayout.setBackground(new Color(85, 85, 85));
        totalPayout.setForeground(Color.white);
        totalProfit.setBackground(new Color(85, 85, 85));
        totalProfit.setForeground(Color.white);
        ROI.setBackground(new Color(85, 85, 85));
        ROI.setForeground(Color.white);

        // styling of the buttons in panel 2
        calculate.setBackground(Color.MAGENTA);
        calculate.setForeground(Color.white);

        // Features of the text fields in panel 2
        totalPayout.setEditable(false);
        totalProfit.setEditable(false);
        ROI.setEditable(false);
            
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel1);
        frame.add(panel2);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void calcButtonPressed()
    {
        calculate.setText("Calculation complete");
    }

    public Float getInputValues(JTextField f)
    {
        return Float.parseFloat(f.getText());
    }

    public JTextField getBet1Field()
    {
        return bet1Entry;
    }

    public JTextField getBet2Field()
    {
        return bet2Entry;
    }

    public JTextField getStakeField()
    {
        return stakeEntry;
    }

    public PerformCalculation getPerformCalculation()
    {
        return listener;
    }

    public void setEnterOdds()
    {
        enterOdds.setText("Incorrect Odds Entered!");
        enterOdds.setForeground(Color.red);
    }

    public void setStakes()
    {
        bet1Stake.setText(Float.toString(listener.getBet1Stake()));
        bet2Stake.setText(Float.toString(listener.getBet2Stake()));
    }

    public JTextField getBet1StakeField()
    {
        return bet1Stake;
    }

    public JTextField getBet2StakeField()
    {
        return bet2Stake;
    }

    public void setPayout()
    {
        bet1Payout.setText(Float.toString(listener.getPayout()));
        bet2Payout.setText(Float.toString(listener.getPayout()));
    }

    public void setTotalProfit()
    {
        totalProfit.setText(Float.toString(listener.getTotalProfit()));
    }
}