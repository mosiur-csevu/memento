/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mememntopractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mosiur Rahman Sweet
 */
public class History {
    private List<EditorState> states = new ArrayList<>();
    
    public void push(EditorState state) {
        states.add(state);
    }
    
    public EditorState pop() {
        int lastIndex = states.size()-1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState; 
    }
    
}
