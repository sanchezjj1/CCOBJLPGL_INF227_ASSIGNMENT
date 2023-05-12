public class App {
    public static void main(String[] args) throws Exception {
         // Create object from pet class
         GoldenPoodle myPet = new GoldenPoodle();

         myPet.bark();
         System.out.println("The color of his fur is " + myPet.furColor + " and his height is " + myPet.height);
         System.out.println();
         System.out.println("The color of his eyes is " + myPet.eyeColor + " and he is " + myPet.characteristic);
         System.out.println();
         
    }
}
