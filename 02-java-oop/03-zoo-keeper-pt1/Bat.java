public class Bat extends Mammal{
    public Bat(){
        super(300);
    }

    public void fly() {
        System.out.println("The bad takes of");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        this.energyLevel +=25;
    }

    public void attackTown() {
        System.out.println("The twon is under attack");
        this.energyLevel -= 100;
    }
}
