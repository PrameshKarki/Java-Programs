//Java program to sum of two number using Java Abstract window toolkit(awt)
import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends WindowAdapter implements ActionListener {
    Frame f;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2;
    String str1,str2;
    Integer n1,n2,n3;
    ActionEventDemo(){
        f=new Frame();
      f.setTitle("Addition");
      f.setSize(500,500);
      f.setVisible(true);
      f.setLayout(new FlowLayout());

      l1=new Label("First Number:");
      t1=new TextField();
      t1.setSize(200,50);

      l2=new Label("Second Number");
      t2=new TextField();
      t2.setSize(200,50);

      l3=new Label("Result:");
      t3=new TextField();
      t3.setSize(200,50);

      b1=new Button("Add");
      b2=new Button("Reset");

      //Add components in form
        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);

        f.add(l3);
        f.add(t3);

        f.add(b1);
        f.add(b2);


        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     str1=t1.getText();
     str2=t2.getText();

     n1=Integer.parseInt(str1);
     n2=Integer.parseInt(str2);

     String action=e.getActionCommand();
     if(action.equals("Add")){
         n3=n1+n2;
         t3.setText(n3.toString());

     }else if(action.equals("Reset")){
         t1.setText("");
         t2.setText("");
         t3.setText("");
     }
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
