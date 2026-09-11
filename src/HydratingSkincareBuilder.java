public class HydratingSkincareBuilder implements SkincareBuilder{
    private String name;
    private String brand = "Not choosen";
    private String skinType = "Not choosen";
    private String mainIngredient = "Unknown";
    private boolean spf = false;

    @Override
    public SkincareBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SkincareBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public SkincareBuilder setSkinType(String skinType) {
        this.skinType = skinType;
        return this;
    }

    @Override
    public SkincareBuilder setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
        return this;
    }

    @Override
    public SkincareBuilder setSpf(boolean spf) {
        this.spf = spf;
        return this;
    }

    @Override
    public SkincareProduct build() {
        if (name == null){
            throw new IllegalStateException("Product name is required!");
        }
        return new SkincareProduct(
            name,
            brand,
            skinType,
            mainIngredient,
            spf
        );
    }
}
