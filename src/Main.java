import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(250, 2, "female", "Cow2");
        Cow cow2 = new Cow(250, 2, "female", "Cow3");
        Cow cow3 = new Cow(250, 2, "female", "Cow4");
        Cow cow4 = new Cow(250, 2, "female", "Cow5");
        Cow cow5 = new Cow(250, 2, "female", "Cow");
        Sheep sheep1 = new Sheep(4, 3, "female", "Sheep1");
        Sheep sheep2 = new Sheep(4, 3, "female", "Sheep2");
        Sheep sheep3 = new Sheep(4, 3, "female", "Sheep3");
        Horse horse1 = new Horse(400, 5, "male", "Horse Tagi", "white");
        Horse horse2 = new Horse(400, 5, "male", "Horse Kamelot", "black");
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Sheep[] sheepp = {sheep1, sheep2, sheep3,};
        Horse[] horses = {horse1, horse2};
        Farm farm=new Farm("Gornaya" , cows.length, sheepp.length, horses.length, "Amir");
        System.out.println(farm);
        System.out.println(Arrays.toString(cows));
        System.out.println(Arrays.toString(sheepp));
        System.out.println(Arrays.toString(horses));
        System.out.println("------------------------------------------------------------");
        Cow[] cow = {cow1};
        Sheep[] sheep = {sheep1};
        Horse[] horse = {horse1};
        Farm farm2=new Farm("Molodejnaya", cow.length,sheep.length, horse.length, "Mirbek");
        System.out.println(farm2);
        System.out.println(Arrays.toString(cow));
        System.out.println(Arrays.toString(sheep));
        System.out.println(Arrays.toString(horse));


    }
}