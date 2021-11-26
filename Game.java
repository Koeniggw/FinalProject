import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game implements ActionListener {
  JFrame f = new JFrame("Welcome to Jeopardy!");
  JButton btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4, btnConfirm;
  JLabel lblQuestion;
  JButton btnQuest1, btnQuest2, btnQuest3, btnQuest4, btnQuest5, btnQuest6;
  JLabel lblCat1, lblCat2, lblCat3;
  JLabel lblScore;
  int intScore;

  Game() {
    //JFrame f = new JFrame("Welcome to Jeopardy!");
    f.setLayout(new FlowLayout());
   // f.setLayout(null);
    f.setSize(240, 120);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btnQuest1 = new JButton("55");
    btnQuest2 = new JButton("10");
    btnQuest3 = new JButton("5");
    btnQuest4 = new JButton("10");
    btnQuest5 = new JButton("5");
    btnQuest6 = new JButton("10");
    btnQuest1.addActionListener(this);
    btnQuest2.addActionListener(this);
    btnQuest3.addActionListener(this);
    btnQuest4.addActionListener(this);
    btnQuest5.addActionListener(this);
    btnQuest6.addActionListener(this);

    lblCat1 = new JLabel("Category 1");
    lblCat2 = new JLabel("Category 2");
    lblCat3 = new JLabel("Category 3");
    lblScore = new JLabel("0");


    f.add(btnQuest1);
    f.add(btnQuest2);
    f.add(btnQuest3);
    f.add(btnQuest4);
    f.add(btnQuest5);
    f.add(btnQuest6);
    f.add(lblCat1);
    f.add(lblCat2);
    f.add(lblCat3);
    f.add(lblScore);

    f.setVisible(true);

    //addWindowListener(new WindowAdaptor());

  }
/*
  void Question(){
    private JFrame q = new JFrame ("");
    q.setLayout(new FlowLayout());
    q.setSize(180, 100);
    q.setVisible(false);

    lblQuestion = new JLabel("");
    btnAnswer1 = new JButton("");
    btnAnswer2 = new JButton("");
    btnAnswer3 = new JButton("");
    btnAnswer4 = new JButton("");

    q.add(lblQuestion);
    q.add(btnAnswer1);
    q.add(btnAnswer1);
    q.add(btnAnswer1);
  }
  */

  public void actionPerformed(ActionEvent ae){
    //might need to add score from question to cumulative score???
    //int intScore = new Integer.parseInt();

    if (ae.getSource()==btnQuest1){
      //need to import the questions from a file. Need to look back how to do!!!
      //q.setVisible(true);
      //f.setVisible(false);
      f.dispose();
      Question QuestionWindow = new Question();

      lblQuestion.setText("Question 1");
      btnAnswer1.setText("Answer 1");
      btnAnswer2.setText("Answer 2");
      btnAnswer3.setText("Answer 3");
      btnAnswer4.setText("Answer 4");


    }
  }
}