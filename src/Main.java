import javax.swing.*;
import java.io.File;

public class Main {
    public static JFrame window;
    public static File apps;
    public static void main(String[] args) {

            // create an abstract pathname (File object)
            File f = new File("/home/" + System.getProperty("user.name") + "/gnome-apps-info");

            // check if the directory can be created
            // using the abstract path name
            if (f.mkdir()) {

                // display that the directory is created
                // as the function returned true
                System.out.println("Directory is created");
            }
            else {
                // display that the directory cannot be created
                // as the function returned false
                System.out.println("Directory cannot be created");
            }
          apps = new File("/home/" + System.getProperty("user.name") + "/gnome-apps-info/apps.txt");
          System.out.println(apps.getAbsoluteFile());
          window = new JFrame();
          window.setSize(700,800);
          window.setLayout(null);
          window.setTitle("Gnome shortcuts");
          window.setVisible(true);

    }
    }
