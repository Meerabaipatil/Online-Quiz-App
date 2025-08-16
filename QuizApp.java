package quizApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score =0;
		Question[] questions= {
		new Question("Among the following Which is the non-primitive datatype?", new String[]{"int","float","char","String"} , 4),
		new Question("Among the following Which is the primitive datatype?", new String[]{"Integer","Float","char","String"}, 3),
		new Question("How many types of primitive data types are there in java?", new String[]{"4","9","8","2"}, 3),
		new Question("Which of these is not an OOP principle?", new String[]{"Encapsulation", "Polymorphism", "Compilation", "Inheritance"}, 3),
		};
		System.out.println("Welcome to Java Quiz");
		
		for (int i = 0; i < questions.length; i++) {
			System.out.println("Q" + (i + 1) + ":");
           questions[i].displayQuestion();
           System.out.println("Enter tour Answer:");
           int ans=sc.nextInt();
           
           if(questions[i].checkAnswer(ans)) {
        	   System.out.println("✅ Correct!\n");
        	   score++;
           }
           else {
        	   System.out.println("❌ Wrong!\n");
           }
           }
		System.out.println("Quiz Finished...");
		System.out.println("Your Total Score is : " + score + " out of " + questions.length+ " ");
		if(score==questions.length) {
			System.out.println("🎉 Excellent! Full Score!");
		}
			else if(score >= questions.length/2) {
				System.out.println("Good job");
			}
			else {
				System.out.println("Better Next Time");
			}
		
		
		
	}

}
