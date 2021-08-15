public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public void attack(Human attacker){
        attacker.health -=this.strength;
        System.out.println(this.strength + "new health is " + attacker.health);
    }

    public Human(){
        this.strength=3;
        this.stealth=3;
        this.intelligence=3;
        this.health=100;
    }
}
