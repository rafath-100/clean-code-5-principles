//following program violates all 5 solid principles

//SRP is getting violated here
class HilltonApartments
{
    public void watchman(){
        System.out.println("Our entire Apartment has 2 watchmen");
    }


    //2
    public void source(){
        System.out.println("from where people has seen the AD: TV/ Newspaper");
    }

    //3
    
    public void parking(){
        System.out.println("Yes, we have a lot of parking space");
    }
    public void controlroom(){
        System.out.println("control room for Hillton apartments");
    }
}

class BBlock extends HilltonApartments
{
    //violates Liskov principle
    //As each block do not have a separate entry, exit and control rooms here.

    public void floors()
    {
        System.out.println("This Block has 6 floors");
    }
    //this is a new method which doesn't have same functionalities of the parent class.
}

//IS principle is getting violated here
interface ApartmentBlocks
{
    void blockA();
    void blockB();
    void blockC();
}
class Terrace implements ApartmentBlocks
{
    public void blockA(){
        System.out.println("block a has a terrace");
    }
    public void blockB(){
        //block b does not have a terrace
    }
    public void blockC(){
        System.out.println("block c has a terrace");
    }
}
class Lift implements ApartmentBlocks
{
    public void blockA(){
        System.out.println("block a has a lift");
    }
    public void blockB(){
        System.out.println("block a has b lift");
    }
    public void blockC(){
        System.out.println("block a has c lift");
    }
}

//DIP is getting violated here
class Resident
{
    public void info(String name)
    {
        System.out.println("enter your name: "+name);
    }
}
class Owner
{
    public void info()
    {
        System.out.println("I am Rafath, and I am the owner of this apartment!");
    }
}

//higher module
class RulesAndRegulations
{
    Owner owner;
    RulesAndRegulations(Owner owner)
    {
        this.owner=owner;
    }
    public void announcement() {
        System.out.println("Hey, everyone living in the apartment should maintain discipline");
        owner.info();

    }
}
public class WithoutSolid
{
    public static void main(String args[]){
        BBlock bblock=new BBlock();
        bblock.controlroom();

        Terrace terrace=new Terrace();
        terrace.blockA();

        RulesAndRegulations rules=new RulesAndRegulations(new Owner());
        rules.announcement();
    }
}
