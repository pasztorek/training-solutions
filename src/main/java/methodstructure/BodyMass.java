package methodstructure;

public class BodyMass {

    private double  weight;
    private double  height;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex(){
        return weight/(height*height);
    }

    public BmiCategory body(){
        BmiCategory result;

           if(new BodyMass(weight,height).bodyMassIndex()<=18.5) {
               result = BmiCategory.UNDERWEIGHT;

           }else if(new BodyMass(weight,height).bodyMassIndex()>=25) {
               result = BmiCategory.OVERWEIGHT;
           }
            else {
                result = BmiCategory.NORMAL;
            }
            return result;
    }

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public boolean isThinnerThan(BodyMass body){
        if(this.bodyMassIndex()<body.bodyMassIndex()){
            return true;
        }
        else{
            return false;
        }
    }
}
