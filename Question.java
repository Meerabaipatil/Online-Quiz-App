package quizApp;

import java.util.Iterator;
import java.util.List;

public class Question {
	String question;
	String[] options;
	int correctAnswer;
	
	
	
	
public Question(String question, String[] options, int correctAnswer) {
		super();
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}




	public void displayQuestion() {
		System.out.println(question);
	for (int i = 0; i < options.length; i++) {
		 System.out.println((i + 1) + ". " + options[i]);
	}
	}
	
	public boolean checkAnswer(int UserAnswer) {
		return UserAnswer == correctAnswer;
	}

}
