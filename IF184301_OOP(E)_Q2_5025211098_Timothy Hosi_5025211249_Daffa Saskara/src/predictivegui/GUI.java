/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictivegui;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JPanel implements ActionListener {
    JLabel display;
	JButton numButton;
	JButton clearButton;
	private int count;
	Set<String> numtotext = new HashSet<String>();
	String savetext = "";
	String fulltext = "";
	String space = " ";
	String displayContent = "";
	 String[] numPadContent = {"1","2","3","4","5","6","7","8","9","*"," ","#"};
	 String numPadContent1 = "<html><center>" + "1" + "<br>" + "<br>"
	    + "</center></html>";
	 String numPadContent2 = "<html><center>" + "2" + "<br>" + "ABC"
	    + "</center></html>";
	 String numPadContent3 = "<html><center>" + "3" + "<br>" + "DEF"
	    + "</center></html>";
	 String numPadContent4 = "<html><center>" + "4" + "<br>" + "GHI"
	    + "</center></html>";
	 String numPadContent5 = "<html><center>" + "5" + "<br>" + "JKL"
	    + "</center></html>";
	 String numPadContent6 = "<html><center>" + "6" + "<br>" + "MNO"
	    + "</center></html>";
	 String numPadContent7 = "<html><center>" + "7" + "<br>" + "PQRS"
	    + "</center></html>";
	 String numPadContent8 = "<html><center>" + "8" + "<br>" + "TUV"
	    + "</center></html>";
	 String numPadContent9 = "<html><center>" + "9" + "<br>" + "WXYZ"
	    + "</center></html>";
	 String numPadContent10 = "*";
	 String numPadContent11 = "<html><center>" + "0" + "<br>" + "_"
	    + "</center></html>";
	 String numPadContent12 = "#";
	 ArrayList<JButton> buttonList;
	
	 public static String removeWord(String string, String word)
    {
  
        // Check if the word is present in string
        // If found, remove it using removeAll()
        if (string.contains(word)) {
  
            // To cover the case
            // if the word is at the
            // beginning of the string
            // or anywhere in the middle
            String tempWord = word + " ";
            string = string.replaceAll(tempWord, "");
  
            // To cover the edge case
            // if the word is at the
            // end of the string
            tempWord = " " + word;
            string = string.replaceAll(tempWord, "");
        }
  
        // Return the resultant string
        return string;
    }
	// Keypad constructor class
	 public GUI(Container pane) {
		count = 0;
	  // sets the size of the Keypad display
	  pane.setPreferredSize(new Dimension(320, 335));
	  
	  // initialize display to hold displayContent
	  display = new JLabel(displayContent);
	  display.setPreferredSize(new Dimension(320, 25));
	  // create lowered bevel border around the display
	  display.setBorder(BorderFactory.createLoweredBevelBorder());
	  // add the display to the panel
	  pane.add(display, BorderLayout.PAGE_START);
	  
	  // initialize the buttonList
	  buttonList = new ArrayList<JButton>(12);
	  JPanel numberPanel = new JPanel();
	  // set the numberPanel to have a 4row by 3col grid layout
	  numberPanel.setLayout(new GridLayout(4,3,0,0));
	  // set the size of the numberPanel
	  numberPanel.setPreferredSize(new Dimension(320,260));
	  // create the buttons and add them to the buttonList, properly displaying the numbers 
	   numButton = new JButton(numPadContent1);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent2);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent3);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent4);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent5);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent6);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent7);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent8);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent9);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent10);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent11);
	   buttonList.add(numButton);
	   numButton = new JButton(numPadContent12);
	   buttonList.add(numButton);
	   
	  // add the buttonList to the number panel
	  for (int n = 0; n < buttonList.size(); n++) {
	   buttonList.get(n).addActionListener(this);
	   numberPanel.add(buttonList.get(n));
	  }
	  
	  // create black border around the number panel
	  numberPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.black));
	  // add number panel to center part of display
	  pane.add(numberPanel, BorderLayout.LINE_END);

	  // create Clear button that is actionable
	 }
	 
	 // update the display depending on clicked button(s)
	 public void actionPerformed(ActionEvent e) {
	  String textThere = display.getText();
	  String additionalText = "";
	  // add clicked number button text to display
	  for (int a = 0; a < buttonList.size(); a++) {
	   if (e.getSource().equals(buttonList.get(a))) {
		if(a == 9){
			if(count == 0){
				savetext = removeWord(textThere, savetext);
				String converttext = savetext;
				numtotext = predictive.PredictivePrototype.signaturetoWords(converttext);
				String[] result = numtotext.toArray(new String[numtotext.size()]);	
				textThere = "";
				additionalText = fulltext + result[count];
				fulltext = textThere;
			}else{
				String[] hasil = numtotext.toArray(new String[numtotext.size()]);
				int endingIndex = textThere.length() - hasil[0].length();
				String tmp = textThere.substring(0, endingIndex);
				textThere = "";
				// String temptext = removeWord(tmp, hasil[(count)%(numtotext.size()-1)]); 
				additionalText = tmp + hasil[count%(numtotext.size())];
				// fulltext = display.getText();
			}
			count++;
		}
		else if(a == 10){
			savetext = textThere;
			additionalText = numPadContent[a];
			fulltext = textThere + space;
			count = 0;
			numtotext.clear();
		}
		else if(a == 11){
			String tmp = textThere.substring(0, textThere.length()-1);
			textThere = "";
			additionalText = tmp;
		}
		else{
			additionalText = numPadContent[a];
			count = 0;
			
		}
	   }
	  }
	  
	  // clear display if "Clear" button is clicked
	  if (e.getSource().equals(clearButton)) {
	   textThere = "";
	  }
	  display.setText(textThere.concat(additionalText));
	 }
	 
	
	public static void main(String[] args) {
		
		//create and set up the window.
		JFrame frame = new JFrame("Numeric Keyboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set up the content pane.
		frame.getContentPane().add(new GUI(frame));
        
		frame.pack();
		frame.setVisible(true);
	}
}
