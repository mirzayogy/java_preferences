import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

public class LoginFrame extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JButton button2;
    private JPanel mainPanel;

    public LoginFrame(){

        setContentPane(mainPanel);
        button1.addActionListener(e -> {
            if(textField1.getText().equals("admin")){
                if(new String(passwordField1.getPassword()).equals("admin")){
                    Preferences pref = Preferences.userRoot().node(Main.class.getName());
                    pref.put("USER_ID","1");
                    MainFrame mf = new MainFrame();
                    mf.setSize(320,140);
                    mf.setVisible(true);
                    dispose();
                }
            }

        });
    }
}
