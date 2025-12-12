/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author nanxinyu
 */
public class QuizManagerClass {
    public static QuestionBase[] questions;
    public static int questionCount=0;
    public static int score=0;
    
    public static void loadQuestions() {
        try {
            BufferedReader br=new BufferedReader(new FileReader("question.txt"));
            ArrayList<QuestionBase>list=new ArrayList<>();
            
            String line;
            while ((line=br.readLine())!=null) {
                String[] parts=line.split(",");
                if (parts.length<6) continue;
                
                String q=paarts[0];
                String[] opts={parts[1], parts[2], parts[3], parts[4]};
                int correct=Integer.parseInt(parts[5].trim());
                
                list.add(new QuestionClass(q, opts, correct));
            }
            br.close();
            
            questions=new QuestionBase[list.size()];
            questions=list.toArray(questions);
            questionCount=questions.length;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void saveScore() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt", true));
            bw.write("Score: "+score+"/"+questionCount);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
