package behavioral.templateMethod;

public abstract class CaffeineBeverage {
    abstract void brew();
    abstract void addCondiment();
    private void boilWater(){
        System.out.println("Đun sôi nước đến 100 độ C");
    }
    private void pourlnCup(){
        System.out.println("Rót ra cốc");
    }
    public void prepareRecipe(){
        boilWater();;
        pourlnCup();
        brew();
        addCondiment();
    }
}
