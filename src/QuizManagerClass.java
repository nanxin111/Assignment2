/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author nanxinyu
 */
public class QuizManagerClass {
    public static QuestionBase[] questions;
    public static boolean[] isCorrect;
    public static int questionCount=0;
    public static int score=0;
    
    public static void loadQuestions() {
        try {
            // Count the number of non-empty lines in the file
            int totalLines = 0;
            Scanner sc = new Scanner(new File("questions.txt"));
            while (sc.hasNextLine()) {
                if (!sc.nextLine().trim().isEmpty()) {
                    totalLines++;
                }
            }
            sc.close();
            // Each question consists of 6 lines
            questionCount = totalLines/6;
            questions = new QuestionBase[questionCount];
            isCorrect = new boolean[questionCount];
            
            // Read and store questions, options, and answers
            sc = new Scanner(new File("questions.txt"));
            for (int i=0; i<questionCount; i++) {
                String text= sc.nextLine().trim();  // Question text
                
                String [] opts=new String[4];
                for (int j=0; j<4; j++) {
                    opts[j] = sc.nextLine().trim();  // Option A-D
                }
                
                String ans= sc.nextLine().trim().toUpperCase();  // Correct answer
                int correctIndex=ans.charAt(0)-'A';
                
                questions[i]=new QuestionClass(text, opts, correctIndex);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void saveScore() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt", true));
            bw.write("Score: "+score+"/"+questionCount);
            bw.newLine();
            for (int i = 0; i < questionCount; i++) {
                if (!isCorrect[i]) {
                    bw.write("Question " + (i + 1) + " incorrect: " + questions[i].getQuestionText());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}