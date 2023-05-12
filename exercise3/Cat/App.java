public class App {
    public static void main(String[] args) throws Exception {
           // Create object from pet class
           Pet myPet = new Pet();

           
           myPet.meow();
           System.out.println("His weighing " + myPet.weight + " and his height is " + myPet.height);
           System.out.println();
           System.out.println("The color of his eyes is " + myPet.eyecolor + " and he is " + myPet.characteristic);
           System.out.println();
    }
}
