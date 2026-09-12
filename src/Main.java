public class Main {
    public static void main(String[] args) {
        SkincareDirector director = new SkincareDirector();
        SkincareProduct hydratingProduct = director.createHydratingProduct("Hydrating Cream", "Combination");

        SkincareProduct acneProduct = director.createAcneProduct("Acne Serum", true);

        System.out.println(hydratingProduct);
        System.out.println(acneProduct);
    }
}
