import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

public class SplashFrame extends JFrame {
    private JPanel mainPanel;

    public SplashFrame() {
        setContentPane(mainPanel);
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Preferences pref = Preferences.userRoot().node(Main.class.getName());
        String userID = pref.get("USER_ID", "");
        System.out.println(userID);

        try {
            TimeUnit.SECONDS.sleep(2);
            if(userID.equals("")){
                setVisible(false);
                LoginFrame lf = new LoginFrame();
                lf.setVisible(true);
                lf.setSize(320,140);
            } else {
                setVisible(false);
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
                mf.setSize(320,120);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
