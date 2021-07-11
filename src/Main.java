import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
            if(apps.exists()){

            }
            else{
                try {
                    apps.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            ArrayList<String> app_list = new ArrayList<String>();
        try {
            Scanner fi = new Scanner(apps);
            while(fi.hasNextLine()){
                app_list.add(fi.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(apps.getAbsoluteFile());
          window = new JFrame();
          window.setSize(700,800);
          window.setLayout(null);
          window.setTitle("Gnome shortcuts");
          JList yourprogramms = new JList(app_list.toArray());
          yourprogramms.setVisibleRowCount(app_list.size());
          yourprogramms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          JScrollPane jScrollPane= new JScrollPane(yourprogramms);
        jScrollPane.setBounds(20,50, Toolkit.getDefaultToolkit().getScreenSize().width / 4 - window.getSize().width,Toolkit.getDefaultToolkit().getScreenSize().height / 4);
        JPanel settings = new JPanel();
        settings.setBounds(jScrollPane.getWidth() + 20,50,Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        yourprogramms.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
            }
        });
        window.add(settings);
          window.add(jScrollPane);
          System.out.println(app_list);
        window.setVisible(true);

    }
    }
