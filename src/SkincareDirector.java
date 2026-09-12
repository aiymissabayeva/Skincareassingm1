public class SkincareDirector {
    public SkincareProduct createHydratingProduct(String name, String skinType){
        return new HydratingSkincareBuilder()
                .setName(name)
                .setSkinType(skinType)
                .build();
    }
    public SkincareProduct createAcneProduct(String name, boolean spf){
        return new AcneSkincareBuilder()
                .setName(name)
                .setSpf(spf)
                .build();
    }
}
