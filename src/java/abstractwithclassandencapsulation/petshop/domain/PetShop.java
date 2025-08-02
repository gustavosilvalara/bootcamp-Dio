package java.abstractwithclassandencapsulation.petshop.domain;

public class PetShop {
    private int water;
    private int shampoo;
    private int petInTheBath;
    private boolean dirtyMachine;

    public PetShop(){
        water = 30;
        shampoo = 10;
        petInTheBath = 0;
        dirtyMachine = true;
    }

    public void takeABath() {
        if ((petInTheBath == 1 && dirtyMachine)){
            if (water >= 10 && shampoo >= 2) {
                setWater(getWater() - 10);
                setShampoo(getShampoo() - 2);
                dirtyMachine = false;
                System.out.println("Giving the bath to the pet...");
            }else{
                System.out.println("Refill the machine");
            }
        }else if ((petInTheBath == 0 && dirtyMachine)){
            System.out.println("Put your pet in the bath");
        }else{
            System.out.println("The machine is not available or is dirty");
        }
    }

    public void supplyWithWater(){
        if (water == 30){
            System.out.println("The machine is already refilled with water.");
        }else if (water <= 30){
            setWater(getWater() + 2);
            System.out.println("Refueling the machine with water...");
        }
    }

    public void supplyWithShampoo(){
        if (shampoo == 10){
            System.out.println("The machine is already refilled with shampoo.");
        }else if (shampoo <= 10){
            setShampoo(getShampoo() + 2);
            System.out.println("Refueling the machine with shampoo...");
        }
    }

    public void verifyLevelWater(){
        System.out.println(getWater() + "L of water");
    }

    public void verifyLevelShampoo(){
        System.out.println(getShampoo() + "L of shampoo");
    }

    public void checkPetBath(){
        if (!(petInTheBath > 0)){
            System.out.println("Don't have a pet in the bath!!!!!!");
        }else{
            System.out.println("There is a pet in the bath!!!");
        }
    }

    public void putPetMachine(Pet pet){
        if (!(petInTheBath < 0)){
            petInTheBath++;
            System.out.println("Placing the pet in the machine");
        }else {
            System.out.println("There is a pet in the bath!!!");
        }
    }

    public void removePetMachine(){
        if (petInTheBath != 0){
            petInTheBath--;
            System.out.println("Removing the pet from the machine");
        }else{
            System.out.println("Don't have a pet in the machine!!!");
        }
    }

    public void cleanTheMachine(){
        if (!dirtyMachine){
            dirtyMachine = true;
            setWater(getWater() - 3);
            setShampoo(getShampoo() - 1);
            System.out.println("cleaning the machine");
        }else {
            System.out.println("The machine is already clean");
        }
    }



    protected int getWater() {
        return water;
    }

    protected void setWater(int water) {
        this.water = water;
    }

    protected int getShampoo() {
        return shampoo;
    }

    protected void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    protected int getPetInTheBath() {
        return petInTheBath;
    }

    protected void setPetInTheBath(int petInTheBath) {
        this.petInTheBath = petInTheBath;
    }
}
