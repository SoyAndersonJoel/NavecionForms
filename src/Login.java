import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JFrame frame;
    public JPanel mainPanel;
    private JTextField userTF;
    private JPasswordField passwordTF;
    private JButton loginB;

    public Login() {

        loginB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTF.getText();
                String password = new String(passwordTF.getPassword());


                if (username.equals("Anderson") && password.equals("123456")) {

                    JFrame frame = new JFrame("Mi aplicación ");
                    frame.setContentPane(new Biografia().mainPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setSize(450, 500);
                    frame.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(mainPanel)).dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Credenciales incorrectas", "Error de login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}
