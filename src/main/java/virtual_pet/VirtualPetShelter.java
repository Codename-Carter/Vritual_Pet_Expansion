package virtual_pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> cartersPlayHouse = new HashMap<String, VirtualPet>();

    // Constructor
    public VirtualPetShelter() {
    }

    // Returns a List of Virtual Pets
    public ArrayList<VirtualPet> getMyPets() {
        Collection<VirtualPet> myPets = cartersPlayHouse.values();
        return new ArrayList<>(myPets);
    }

    // Return a specific Pet given its name
    public VirtualPet getDogName(String dogName) {
        return this.cartersPlayHouse.get(dogName);
    }

    // Allow intake (addition) of homeless pets
    // We want to add pets to cartersPlayHouse
    public void addDogs(VirtualPet bigDog) {
        this.cartersPlayHouse.put(bigDog.getPetName(), bigDog);
    }

    // Adoption (removal) of homeless pets
    // We want to give away pets from cartersPlayHouse
    public void adoptDog(String bigDog) {
        this.cartersPlayHouse.remove(bigDog);
    }

    // Feed all of the Dogs
    public void feedAllDogs() {
        for (VirtualPet entry : cartersPlayHouse.values()) {
            entry.feedPet();
        }
    }

    // Give all of the dogs water
    public void giveDogsWater() {
        for (VirtualPet entry : cartersPlayHouse.values()) {
            entry.getWater();
        }
    }

    // Create tick method for all dogs in carter'sPlayHouse
    public void bigDogTick(VirtualPet bigDog) {
        for (VirtualPet entry : cartersPlayHouse.values()) {
            entry.tick();
        }
    }

}