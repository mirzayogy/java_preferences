import javax.swing.*;
import java.util.prefs.Preferences;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton logOutButton;

    public MainFrame(){
        setContentPane(mainPanel);
        logOutButton.addActionListener(e -> {
            Preferences pref = Preferences.userRoot().node(Main.class.getName());
            pref.put("USER_ID","");
            dispose();
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
            lf.setSize(320,140);
        });
    }
}
