public class Main {
    public static void main(String[] args) {
        SkincareProduct hydratingProduct = new HydratingSkincareBuilder()
                .setName("Hydrating Cream")
                .setBrand("RoundLab")
                .build();
        SkincareProduct acneProduct = new AcneSkincareBuilder()
                .setName("Acne Control Serum")
                .setBrand("Axis-y")
                .build();

        System.out.println(hydratingProduct);
        System.out.println(acneProduct);
    }
}
