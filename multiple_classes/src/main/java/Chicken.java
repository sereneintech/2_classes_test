public class Chicken {
    private String name;
    private int eggs;

    public Chicken(String name, int eggs){
        this.name = name;
        this.eggs = eggs;
    }

    public String getName() { //() bc not taking argument//
        return this.name;
    }
    public void setName(String name){//setter needs to take name//
        this.name = name;
    }
    public int getEggs(){ //GETTING AND RETURNING! :)
        return this.eggs;
    }
    public void setEggs(int eggs){ //SETTING! :)
        this.eggs = eggs;
    }

}
