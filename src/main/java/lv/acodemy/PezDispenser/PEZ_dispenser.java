package lv.acodemy.PezDispenser;

public class PEZ_dispenser {
    private String name;
    private String colour;
    private String serialName;
    public int candyAmount = 5;
    private final int MAX_CANDIES = 5;

    public int getCandy() {
        System.out.println("Now candies in the dispenser: " + candyAmount);
        return candyAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public void minusOneCandy() {
        if (candyAmount <= 0) {
            System.out.println("I don't have candies.");
            getCandy();
        } else {
            System.out.println("You received one candy!");
            candyAmount--;
            getCandy();
        }
    }

    public void plusOneCandy() {
        if (candyAmount >= MAX_CANDIES) {
            System.out.println("I'm full.");
            getCandy();
        } else {
            System.out.println("Thank you for the candy.");
            candyAmount++;
            getCandy();
        }
    }

    public void minusAllCandy() {
        if (candyAmount <= 0) {
            System.out.println("I don't have candies.");
            getCandy();
        } else {
            candyAmount = 0;
            System.out.println("You took all my candies!");
            getCandy();
        }
    }

    public void plusAllCandy() {
        if (candyAmount >= MAX_CANDIES) {
            System.out.println("I'm full.");
            getCandy();
        } else {
            candyAmount = MAX_CANDIES;
            System.out.println("Thank you. I received all my candies. I'm full now! ;)");
            getCandy();
        }
    }


    @Override
    public String toString() {
        return "PEZ_dispenser{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", serialName='" + serialName + '\'' +
                '}';
    }
}
