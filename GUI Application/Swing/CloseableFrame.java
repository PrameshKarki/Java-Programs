//Closeable Frame
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CloseableFrame extends JFrame implements WindowListener {
    JFrame frame;
    CloseableFrame(){
        frame=new JFrame("Swing Program");
        frame.setSize(600,500);
        frame.setVisible(true);

    }
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new CloseableFrame();
    }
}
