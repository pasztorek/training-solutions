package immutable;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;


    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
        if(registerIdent==""){
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
    }

    public void modifyDestination(CelestialCoordinates diff){
         destinationCoordinates = new CelestialCoordinates(destinationCoordinates.getX()+diff.getX(),destinationCoordinates.getY()+diff.getY(),destinationCoordinates.getZ()+ diff.getZ());
    }

       public String toString() {
        return registerIdent + ": CelestialCoordinates: x=" + destinationCoordinates.getX()+ ", y=" + destinationCoordinates.getY()+ ", z=" + destinationCoordinates.getZ();

    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }
}
