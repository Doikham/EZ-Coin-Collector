import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SettingApplication extends JFrame {
    
    private JPanel                  contentpane;
    private JLabel                  levelLabel, backgroundLabel, soundLabel;
    private String levelString[] =  {"Baby","Teen","Adult","Master","God"};
    private int level = 0;
    private JComboBox               backgroundBox;
    private String bgString[] =     {"BG2","MUIC","Earth","Rick","RM"};
    private String bg =             "Resources/bg2.jpg";
    private JList                   soundList;
    private String soundString[] =  {"rm theme","","","",
    
    public SettingApplication(){
        setTitle("Choose your own way, Noobs");
        setBounds(100, 100, 1500, 800);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        contentpane = (JPanel) getContentPane();
        contentpane.setLayout(null);
        AddComponents();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //themeSoundChoose.stop();
            }
        });
    }
    
    public void AddComponents(){
        
        //Level Label
        levelLabel = new JLabel("Choose your skill: ");
        levelLabel.setVisible(true);
        contentpane.add(levelLabel);
        
        //Level Radio
        JRadioButton Button[] = new JRadioButton[5];
        ButtonGroup Radio = new ButtonGroup();
        for(int i=0; i<5; i++){
            Button[i] = new JRadioButton(levelString[i]);
            Radio.add(Button[i]);
            contentpane.add(Button[i]);                        
        }
        Button[0].setSelected(true);
        Button[0].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                level = 0;
            }
        });
        Button[1].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                level = 1;
            }
        });
        Button[2].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                level = 2;
            }
        });
        Button[3].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                level = 3;
            }
        });
        Button[4].addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                level = 4;
            }
        });
        
        //Background Label
        backgroundLabel = new JLabel("Choose your battlefield:");
        backgroundLabel.setVisible(true);
        contentpane.add(backgroundLabel);
        
        //Background Combobox
        backgroundBox = new JComboBox(bgString);
        backgroundBox.setVisible(true);
        contentpane.add(backgroundBox);
        backgroundBox.setSelectedIndex(0);
        backgroundBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                switch (backgroundBox.getSelectedIndex()) {
                    case 0:
                        bg = "/Resources/bg2.jpg";
//                        bgIcon = new MyImageIcon("bg1.png").resize(bgimgsizeW, bgimgsizeH);
//                        DisplayBgIcon.setIcon(bgIcon);
                        break;
                    case 1:
                        bg = "/Resources/bg_muic.jpg";                       
                        break;
                    case 2:
                        bg = "/Resources/bg_earth.jpg";
                        break;
                    case 3:
                        bg = "/Resources/bg_rick.jpg";
                        break;
                    case 4:
                        bg = "/Resources/bg_rm.jpg";
                        break;                  
                    default: {
                    }
                    break;
                }
            }
        });
        
        //Sound Label
        soundLabel = new JLabel("Select Character Here :");
        soundLabel.setVisible(true);
        contentpane.add(soundLabel);
        
        //Sound List
        JList soundList
    }
}
