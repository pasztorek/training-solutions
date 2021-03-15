package exam03retake02;

public class Todo {

    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {

        if(priority>5){
            throw new IllegalArgumentException();
        }

        this.text = text;
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public void complete(){
        this.state=State.COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }
}
