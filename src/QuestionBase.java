/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nanxinyu
 */
public class QuestionBase {
    protected String questionText; // The text of the question
    protected String [] options; // Array of possible answer options
    protected int correctIndex; // Index of the correct option in the options array
    
    /**
     * Constructor to create a QuestionBase object.
     * @param questionText
     * @param options
     * @param correctIndex 
     */
    public QuestionBase(String questionText, String [] options, int correctIndex) {
        this.questionText=questionText;
        this.options=options;
        this.correctIndex=correctIndex;
    }
    
    /**
     * Get the question text.
     * @return the text of the question
     */
    public String getQuestionText() {
        return questionText;
    }
    
    /**
     * Get all available options for this question.
     * @return array of options
     */
    public String[] getOptions() {
        return options;
    }
    
    /**
     * Get the type of question.
     * Can be overridden by subclasses to indicate different question types.
     * @return type of the question as a string
     */
    public String getType() {
        return "Base Question";
    }
    
    /**
     * Check if the provided answer is correct.
     * @param choice The index of the selected option
     * @return true if the choice matches the correct index, false otherwise
     */
    public boolean checkAnswer(int choice) {
        return choice==correctIndex;
    }
}
