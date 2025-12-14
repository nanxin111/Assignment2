/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nanxinyu
 */
public class QuestionBase {
    protected String questionText;
    protected String [] options;
    protected int correctIndex;
    
    public QuestionBase(String questionText, String [] options, int correctIndex) {
        this.questionText=questionText;
        this.options=options;
        this.correctIndex=correctIndex;
    }
    
    public String getQuestionText() {
        return questionText;
    }
    
    public String[] getOptions() {
        return options;
    }
    
    public String getType() {
        return "Base Question";
    }
    
    public boolean checkAnswer(int choice) {
        return choice==correctIndex;
    }
}
