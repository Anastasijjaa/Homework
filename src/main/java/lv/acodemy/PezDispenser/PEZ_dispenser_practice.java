package lv.acodemy.PezDispenser;

public class PEZ_dispenser_practice {
    public static void main(String[] args) {
        PEZ_dispenser candyHolder = new PEZ_dispenser();

        candyHolder.setName("Melody");
        System.out.println("PEZ dispenser name is " + candyHolder.getName());

        candyHolder.setColour("red");
        System.out.println("PEZ dispenser colour is " + candyHolder.getColour());

        candyHolder.setSerialName("Hello Kitty");
        System.out.println("PEZ dispenser made by " + candyHolder.getSerialName());

        System.out.println(candyHolder);

        candyHolder.getCandy();

        candyHolder.minusOneCandy();
        candyHolder.minusAllCandy();
        candyHolder.plusOneCandy();
        candyHolder.plusAllCandy();
        candyHolder.minusOneCandy();

    }
}
