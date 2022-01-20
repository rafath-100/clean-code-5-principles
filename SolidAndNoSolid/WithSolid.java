//resolving all 5 solid principles

//first resolving SRP below
class Watchman
{
    public void watchman(){
        System.out.println("there are 2 watchmen for our apartment");
    }
}
class ControlRoom
{
    public void controlRoom(){
        System.out.println("this is the control room");
    }
}

interface Parking
{
    void parking();
}

//Resolving open-closed(2)
interface HilltonApartments
{
    void source();
}
class  TV implements HilltonApartments
{
    public void source(){
        System.out.println("These are the people who have come here after watching an AD on TV!");
    }
}
class NewsPaper implements HilltonApartments
{
    public void source(){
        System.out.println("These are the people who have come here after watching an AD on News paper!");
    }
}

//3 - LSV
class BBlock implements Parking
{
    public void parking(){
        System.out.println("B-block has less parking space");
    }
    public void floors(){
        System.out.println("This Block has 6 floors");
    }
}

//Resolving ISP(4th principle)
interface ApartmentBlocks
{
    void blockA(); //_a => A
    void blockC();
}
interface BlockB
{
    void blockB();
}

class Terrace  implements ApartmentBlocks
{
    public void blockA(){
        System.out.println("Yes, this block a has a terrace.");
    }
    public void blockC(){
        System.out.println("Yes, this block c has a terrace");
    }
}

class NoTerrace implements BlockB
{
    public void blockB(){
        System.out.println("Sorry, block b does not have any terrace!!!");
    }

}

//Resolving the 5th principle(DIP)
interface Resident{
    void info();
}
class Tenant implements Resident
{
    public void info(){
        System.out.println("I am Rafath, I am living here as a tenant");
    }
}
class Owner implements Resident
{
    public void info(){
        System.out.println("I am Rafath, and I am the owner of this apartment!");
    }
}

//higher module
class RulesAndRegulations
{
    Resident resident;
    RulesAndRegulations(Resident resident)
    {
        this.resident=resident;
    }
    public void announcement() {
        System.out.println("Hey, everyone living in the apartment should maintain discipline");
        resident.info();

    }
}
public class WithSolid
{
    public static void main(String args[]){
        Watchman man=new Watchman();
        man.watchman();

        BBlock parking=new BBlock();
        parking.parking();

        HilltonApartments room=new NewsPaper();
        room.source();

        NoTerrace noterrace=new NoTerrace();
        noterrace.blockB();

        Resident resident=new Owner();
        RulesAndRegulations rules = new RulesAndRegulations(resident);
        rules.announcement();
    }
}
