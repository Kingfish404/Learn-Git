package LiveAndDeath;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI {
    Map map = new Map();
    String title = "生命游戏";
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton jButton[][];

    public void init(Map m){
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setLayout(new GridLayout());
        GridLayout gridLayout = new GridLayout(m.getLen(),m.getLen());
        jButton = new JButton[m.getLen()][m.getLen()];

        panel.setLayout(gridLayout);
        frame.add(panel);
        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                jButton[i][j] = new JButton();
                jButton[i][j].setVisible(true);
            }
        }

        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                panel.add(jButton[i][j]);
                jButton[i][j].setVisible(true);
            }
        }

        frame.setResizable(false);
        frame.setTitle(title);
        panel.setVisible(true);;
        frame.setVisible(true);;
    }

    public void show(Map m) throws InterruptedException {
        map=m;
        panel.setVisible(false);;

        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                if(map.get(i, j)==0){
                    jButton[i][j].setBackground(Color.white);
                }else{
                    jButton[i][j].setBackground(Color.black);
                }
            }
        }
        panel.setVisible(true);;
        Thread.sleep(500);
    }

    @SuppressWarnings("unused")
	private void clear() {
        Map map = new Map();
        for (int i = 0; i < map.getLen(); i++) {
            System.out.println();
        }
    }
}