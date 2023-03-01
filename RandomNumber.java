import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.lang.String;
import java.util.Random;
public class RandomNumber implements ActionListener {
    JFrame jf;
    JButton gen, clr;
    JTextField jd;
    public RandomNumber() {
        jf = new JFrame("Random Number");
        jf.setLayout(null);
        jf.setSize(500, 300);
        jd = new JTextField();

        jd.setBounds(50, 10, 400, 100);
        jf.add(jd);
        gen = new JButton("Generate");
        gen.setBounds(50, 150, 150, 50);
        jf.add(gen);
        clr = new JButton("CLEAR");
        clr.setBounds(300, 150, 150, 50);
        jf.add(clr);
        jf.setVisible(true);
        gen.addActionListener(this);
        clr.addActionListener(this);

    }

    public static void main(String arg[]) {
        new RandomNumber();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gen) {
            Random rd = new Random();
            int n = rd.nextInt(100);
            jd.setText(""+n);
        } else if (e.getSource() == clr) {
            jd.setText("");
        } else {

        }
    }
}
