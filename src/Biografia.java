import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia {
    public JPanel mainPanel;
    private JButton salirB;
    private JButton hobbieB;

    public Biografia() {
        salirB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Mi aplicación ");
                frame.setContentPane(new Login().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setSize(450, 500);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(mainPanel)).dispose();
            }
        });

        hobbieB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Mi aplicación ");
                frame.setContentPane(new Hobbie().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setSize(450, 500);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(mainPanel)).dispose();

            }
        });
    }


}
