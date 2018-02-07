import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "What kind of tree can you carry in your hand?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equalsIgnoreCase("A palm")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1; ////// score ++ only adds 1
}

		// 5. Otherwise, say "wrong" and tell them the answer

else{JOptionPane.showMessageDialog(null, "Wrong, the anser was A Palm");
}
		// 6. Add some more riddles
String input2 = JOptionPane.showInputDialog(null, "Feed me and I live, yet give me a drink and I die.");

if(input2.equalsIgnoreCase("Fire")) {
JOptionPane.showMessageDialog(null, "Correct!");
score = score + 1; ////// score ++ only adds 1
}


else{JOptionPane.showMessageDialog(null, "Wrong, the anser was fire");
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "The score is "+ score);
	}
}

