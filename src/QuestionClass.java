/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
/**
 *
 * @author nanxinyu
 */
public class QuestionClass extends MultipleChoiceQuestion {
    public static final int DEFAULT_CORRECT_INDEX=0;
    
    public QuestionClass(String questionText, String[] options, int correctIndex) {
        super(questionText, options, correctIndex);
    }
    
    public QuestionClass(String questionText) {
        super(questionText, new String[]{"A","B","C","D"}, DEFAULT_CORRECT_INDEX);
    }
    
    @Override
    public String toString() {
        return questionText+" "+Arrays.toString(options);
    }
}
