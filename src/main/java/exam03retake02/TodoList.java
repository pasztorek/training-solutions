package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public int getNumberOfItemsLeft(){
        List<Todo> result = new ArrayList<>();

        for(Todo todo: todos){
            if(todo.getState().equals(State.NON_COMPLETED)){
                result.add(todo);
            }
        }
        return result.size();

    }

    public List<String> getMostImportantTodosText(){
        List<String> result = new ArrayList<>();

        for(Todo todo: todos){
            if(todo.getPriority()==1){
                result.add(todo.getText());
            }
        }

        if(result.size()==0){
            for(Todo todo: todos){
                if(todo.getPriority()==2){
                    result.add(todo.getText());
                }
            }
        }
        return result;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteCompleted() {

        for(int i=0; i<todos.size(); i++){
            if(todos.get(i).getState().equals(State.COMPLETED)){
                todos.remove(i);
            }
        }

    }
}
