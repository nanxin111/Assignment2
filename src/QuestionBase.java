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
    
    public QuestionBase(String questionText) {
        this(questionText, new String[]{"A","B","C","D"}, 0);
    }
    
    public String getQuestionText() {
        return questionText;
    }
    
    public String[] getOptions() {
        return choice==correctIndex;
    }
    
    public String getType() {
        return "Base Question";
    }
}
