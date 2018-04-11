import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * Shows a window. You set focus on it and type any key.
 * In System.out, the KeyCode value in decimal format is displayed.
 */
public class KeyCodeViewer {
    public static void main(String[] args) {
        KeyCodeViewer viewer = new KeyCodeViewer();
    }

    public KeyCodeViewer() {
        JFrame frame = new JFrame();
        frame.setSize(250,250);
        frame.setTitle("Key_test2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addKeyListener(new MyKeyListener());
    }

    class MyKeyListener implements KeyListener {
        int KeyCode;
        public void keyPressed(KeyEvent event) {
            KeyCode = event.getKeyCode();
            System.out.println("KeyCode=" + KeyCode + " is pushed");
        }
        public void keyReleased(KeyEvent event) {
            //KeyCode = event.getKeyCode();
            //System.out.println("KeyCode=" + KeyCode + " is released");
        }
        public void keyTyped(KeyEvent event) {
            //何もしない}
        }
    }
}
