package week08d04;

public class Trainer {

    CanMark canmark;

    public Trainer(CanMark canmark) {
        this.canmark = canmark;
    }

    public int giveMark(){

        return canmark.giveMark();
    }

    public static void main(String[] args) {

        Trainer trainerGood = new Trainer(new GoodMood(){});
        Trainer trainerBad = new Trainer(new BadMood(){});

        System.out.println(trainerGood.giveMark());
        System.out.println(trainerBad.giveMark());
    }

}
