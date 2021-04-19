//First Swing Program
import javax.swing.*;

public class FirstSwingProgram extends JFrame {
    //Constructor
    FirstSwingProgram(){
        JFrame frm=new JFrame("First Swing Example");
        JButton btn=new JButton("Click Me");
        btn.setBounds(130,100,100,40);
        frm.add(btn);
        frm.setSize(400,500);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
   //Main Method
    public static void main(String[] args) {
        new FirstSwingProgram();
    }
}
