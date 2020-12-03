package methodparam;

public class Measurement {

    private double[] measurements;
    // private double measurement;

    public Measurement(double... measurement) {
        this.measurements = measurement;

    }

    public int findFirstIndexInLimit(int lower, int upper) {

        for (int i=0; i<measurements.length; i++) {
            if (measurements[i] < upper && measurements[i] > lower) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double result = measurements[0];

        for (double mes : measurements) {
            if (mes < result) {
                result = mes;
            }
        }
        return result;
    }

    public double maximum() {
        double result = measurements[0];

        for (double mes : measurements) {
            if (mes > result) {
                result = mes;
            }
        }
        return result;
    }

    public  ExtremValues minmax(){
        return new ExtremValues(this.minimum(), this.maximum());
    }
}