/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mememntopractice;

/**
 *
 * @author Mosiur Rahman Sweet
 */
public class MememntoPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Editor editor = new Editor();
        History history = new History();
        
        editor.setContent("Sweet");
        history.push(editor.createState());
        editor.setContent("Atik");
        history.push(editor.createState());
        editor.setContent("Raja");
        history.push(editor.createState());
        
        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
    
}
