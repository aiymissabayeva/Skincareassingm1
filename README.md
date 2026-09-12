# Skincare Product Builder
This project demonstrates how I used Builder Pattern in Java.

## Product
The product is SkincareProduct.
It contains: name, brand, skinType, mainIngredient, spf

## Builder
SkincareBuilder defines steps for creating a skincare product.
Project has 2 Concrete Builders:
- HydratingSkincareBuilder that creates hydrating skincare products with Hyaluronic Acid.
- AcneSkincareBuilder that creates acne skincare products with Salicylic Acid.

## Director
SkincareDirector has predefined methods for creating skincare products using the appropriate builder.

## Example
SkincareProduct hydratingProduct = director.createHydratingProduct("Hydrating Cream", "Combination");

        SkincareProduct acneProduct = director.createAcneProduct("Acne Serum", true);

## How to Run
Open Main.java and run the main method.
The created skincare products will be displayed in the console.
