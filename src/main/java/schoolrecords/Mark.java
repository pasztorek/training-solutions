package schoolrecords;

public class Mark {

    private MarkType marktype;
    private Subject subject;
    private Tutor tutor;

    public MarkType getMarkType() {
        return marktype;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }



    public Mark(Subject subject, Tutor tutor) {
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(MarkType marktype, Subject subject, Tutor tutor) {
        this.marktype = marktype;
        this.subject = subject;
        this.tutor = tutor;
    }
}
