import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Question {
  
  JLabel lblQuestion;
  JButton btnAnswer1,btnAnswer2, btnAnswer3, btnAnswer4, btnConfirm;

  Question(){
    JFrame q = new JFrame ("");
    q.setLayout(new FlowLayout());
    //q.setLayout(null);
    q.setSize(220, 120);
    q.setVisible(true);
    q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lblQuestion = new JLabel("Question 1");
    btnAnswer1 = new JButton("1");
    btnAnswer2 = new JButton("2");
    btnAnswer3 = new JButton("3");
    btnAnswer4 = new JButton("4");
    btnConfirm = new JButton("CONFIRM");


    q.add(lblQuestion);
    q.add(btnAnswer1);
    q.add(btnAnswer2);
    q.add(btnAnswer3);
    q.add(btnAnswer4);
    q.add(btnConfirm);
  }
public void actionPerformed(ActionEvent ae){
  
  
}
}