public interface SkincareBuilder {
    SkincareBuilder setName(String name);
    SkincareBuilder setBrand(String brand);
    SkincareBuilder setSkinType(String skinType);
    SkincareBuilder setMainIngredient(String mainIngredient);
    SkincareBuilder setSpf(boolean spf);
    SkincareProduct build();
}
