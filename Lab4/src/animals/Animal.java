package animals;

public abstract class Animal {
    protected String name;
    public int legs;

    String getDescription(){
        return name;
    }
    public static int legs_counter(Animal[] animals) {
        int number_of_legs=0;
        for (int i = 0 ; i <animals.length ; i++) {
            number_of_legs=number_of_legs+animals[i].legs;
            number_of_legs+=animals[i].legs;
            number_of_legs+=animals[i].legs;
        }
        return number_of_legs;

    }
}
