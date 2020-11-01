package statements;

public class Time {

    private int ora;
    private int perc;
    private int masodp;

    public Time(int ora, int perc, int masodp) {
        this.ora = ora;
        this.perc = perc;
        this.masodp = masodp;
    }

    public int getInMinutes(){

        return (ora * 60) + perc;

    }
    public int getInSeconds(){

        return ((ora * 60)*60) + (perc*60) + masodp;

    }
    public boolean earlierThan(Time masik){

        boolean kesobbi = this.getInSeconds()<masik.getInSeconds();

        return kesobbi;

    }
    public String toString(){

        String szoveges = ora + ":" + perc + ":" + masodp + ":";
        return szoveges;

    }
}
