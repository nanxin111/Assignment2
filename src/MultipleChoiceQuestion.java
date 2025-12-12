/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author forever
 */
public class MultipleChoiceQuestion extends QuestionBase {
    public MultipleChoiceQuestion(String questionText, String[] options, int correctIndex) {
        super(questionText, options, correctIndex);
    }
    
    @Override
    public String getType() {
        return "Multiple Choice Question";
    } 
}
