public  class Farm {
    private String address;
    private int cows;
    private int sheep;
    private int horses;
    private String ownerName;

    public Farm(String address, int cows, int sheep, int horses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "" +
                "address='" + address +
                ", cows='" + cows +
                ", sheep='" + sheep +
                ", horses='" + horses +
                ", ownerName='" + ownerName ;

    }
}
