package virtual_pet;
    // ##########################
    // instance variable(s)
    // ##########################
public class VirtualPet {
    private String petName;
    private int hungerPct;
    private int thirstPct;
    private int boredomPct;

    // ###########################
    // constructor(s)
    // ###########################

public VirtualPet(String name) {
    this.petName = name;
    this.hungerPct = 50;
    this.thirstPct = 50;
    this.boredomPct = 50;

}

    // ###########################
    // Getter(s) and Setter(s)
    // ###########################

public String getPetName() {
    return this.petName;
}

public void setPetName(String petName) {
    this.petName = petName;
}

public int getHungerPct() {
    return this.hungerPct;
}

public void setHungerPct(int hungerPct) {
    this.hungerPct = hungerPct;
}

public int getThirstPct() {
    return this.thirstPct;
}

public void setThirstPct(int thirstPct) {
    this.thirstPct = thirstPct;
}

public int getBoredomPct() {
    return this.boredomPct;
}

public void setBoredomPct(int boredomPct) {
    this.boredomPct = boredomPct;
}


    // ##########################
    // instance method(s)
    // ##########################

public void feedPet() {

this.hungerPct = this.hungerPct -5;
this.thirstPct = this.thirstPct +3;
}

public void tick() {
    this.thirstPct = this.thirstPct + 3;
    this.hungerPct = this.hungerPct + 3;
    this.boredomPct = this.boredomPct + 3;
}

public void doNothing() {
    this.thirstPct = this.thirstPct + 0;
    this.hungerPct = this.hungerPct + 0;
    this.boredomPct = this.boredomPct + 0;
}

public void getWater() {

    this.thirstPct = this.thirstPct - 5;
    this.hungerPct = this.hungerPct + 2;

}

public void playWithPet() {
    this.boredomPct = this.boredomPct -7;
    this.hungerPct += 3;
}

}

// hunger - lower is better, higher is worse
//