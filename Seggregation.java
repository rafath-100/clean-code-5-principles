// Interface Seggregation Principle 
// Don't force class to define methods which does not have anyting to do with them

interface BearKeeper {
    void washBear();
    void feedBear();
    void petBear();
}

// There may be different person to pet so this voilates Interface Seggregation
class NormalPerson implements BearKeeper{
    public void washBear(){
        System.out.println("Washing the Bear");
    }
    public void feedBear(){
        System.out.println("Feeding the Bear");
    }
    public void petBear() {
        // Normal Person won't pet the bear
    }
}

// so we seggregate the interface
interface BearCare {
    void washBear();
    void feedBear();
}
interface PetBear {
    void petBear();
}
class SpecialPerson implements PetBear {
    public void petBear(){
        System.out.println("Petting the Bear");
    }
}
public class Seggregation {
    public static void main(String ...args){
        NormalPerson np = new NormalPerson();
        np.washBear();
        np.feedBear();
        SpecialPerson sp = new SpecialPerson();
        sp.petBear();
    }
}
