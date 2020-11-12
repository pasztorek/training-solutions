package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Pet> pets = new ArrayList<>();

    public void add (Pet pet){
       for (Pet peldany: pets) {
           if (areEquals(pet, peldany)) {
               return;
           }

       }
        pets.add(pet);
        }
    public List<Pet> getPets(){
        return pets;
    }
        public boolean areEquals(Pet pet1, Pet pet2){
        return pet1.getSerial().equals(pet2.getSerial());
        }
}
