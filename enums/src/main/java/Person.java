public class Person {

    private String name;
    private int age;
    private Pet pet;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setPet(Pet pet){
        this.pet=pet;
    }

    public String getPet(){
        Pet myPet = pet;
        return "My pet is a "+myPet + " and the sound it makes is " + pet.getSound();
    }
}
