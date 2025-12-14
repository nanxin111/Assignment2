/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * MultipleChoiceQuestion represents a question with multiple answer options.
 * It extends fron the QuestionBase class and specifies the question type
 * as a multiple choice question.
 * @author forever
 */
public class MultipleChoiceQuestion extends QuestionBase {
    /**
     * Constructs a MultipleChoiceQuestion object.
     * @param questionText
     * @param options
     * @param correctIndex 
     */
    public MultipleChoiceQuestion(String questionText, String[] options, int correctIndex) {
        //Call the constructor of the parent class
        super(questionText, options, correctIndex);
    }
    
    /**
     * Returns the type of the question.
     * 
     * @return a String representing the question type
     */
    @Override
    public String getType() {
        return "Multiple Choice Question";
    } 
}
 