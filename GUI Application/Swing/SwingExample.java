//Java program to demonstrate simple log in UI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample implements ActionListener {

    static JTextField userText,passwordText;
    static JLabel status;

    //Main Method
    public static void main(String[] args) {
        //Instantiate Object
        SwingExample obj=new SwingExample();
        JFrame frame=new JFrame("Swing Example");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        frame.add(panel);
        obj.placeComponents(panel);
    }
    //Place components in panel
    private void placeComponents(JPanel panel){
        panel.setLayout(null);
        JLabel userLabel=new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText=new JTextField(20);
        userText.setBounds(100,20,165,25);

        panel.add(userText);

        JLabel passwordLabel=new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText=new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton=new JButton("Log In");
        loginButton.setBounds(10,80,80,25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        status=new JLabel("Status");
        status.setBounds(10,120,150,25);
        panel.add(status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Log In")){
            String userID=userText.getText();
            String userPassword=passwordText.getText();
            if(userID.equals("User") && userPassword.equals("password")){
                status.setText("Success");
            }else{
                status.setText("Invalid credentials");
            }
        }
    }
}
