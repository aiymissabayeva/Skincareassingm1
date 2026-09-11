public class SkincareProduct {
    private String name;
    private String brand;
    private String skinType;
    private String mainIngredient;
    private boolean spf;

    public SkincareProduct(String name, String brand, String skinType, String mainIngredient, boolean spf){
        this.name = name;
        this.brand = brand;
        this.skinType = skinType;
        this.mainIngredient = mainIngredient;
        this.spf = spf;
    }

    @Override
    public String toString() {
        return "SkincareProduct{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", skinType='" + skinType + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                ", spf=" + spf +
                '}';
    }
}
