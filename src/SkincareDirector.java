public class SkincareDirector {
    public SkincareProduct createHydratingProduct(String name){
        return new HydratingSkincareBuilder()
                .setName(name)
                .build();
    }
    public SkincareProduct createAcneProduct(String name){
        return new AcneSkincareBuilder()
                .setName(name)
                .build();
    }
}
