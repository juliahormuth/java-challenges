package HackerRank.OOP.Enum;

public class Animals {

    enum AnimalTypes {
        CAT,
        DOG,
        FISH
    }

    public static void main (String [] args) {
        AnimalTypes animalTypes = AnimalTypes.DOG;
        System.out.println(animalTypes);
    }
}
