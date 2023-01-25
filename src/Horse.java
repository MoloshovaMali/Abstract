public class Horse extends Animal {
    public static Horse[]horses;
    private String colour;
    public Horse(int weight, int age, String gender, String nickName,String colour) {
        super(weight, age, gender, nickName);
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
