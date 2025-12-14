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
    public static final int DEFAULT_CORRECT_INDEX=0; // Default index for the correct answer if not provided
    /**
     * Constructor to create a fully customized question.
     * @param questionText
     * @param options
     * @param correctIndex 
     */
    public QuestionClass(String questionText, String[] options, int correctIndex) {
        super(questionText, options, correctIndex); // call superclass constructor
    }
    
    /**
     * Constructor to create a question with default options ["A","B","C","D"].
     * The correct answer defaults to DEFAULT_CORRECT_INDEX.
     * @param questionText 
     */
    public QuestionClass(String questionText) {
        super(questionText, new String[]{"A","B","C","D"}, DEFAULT_CORRECT_INDEX);
    }
    /**
     * Returns a string representation of the question.
     * Includes the question text and the list of options.
     * Overrides the default toString() method.
     * @return a string showing the question text and options
     */
    @Override
    public String toString() {
        return questionText+" "+Arrays.toString(options);
    }
}
