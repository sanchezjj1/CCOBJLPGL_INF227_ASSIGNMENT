public class iPadMini extends iPadWIthCamera {
    
    void playgame(double s_size, String cpu) {

        int framerate = 0; 

        if(cpu.equals("dual core")){

            framerate = 30;
        } 
        
        System.out.println("              ");
        System.out.println("I have played call duty at " + framerate + " Framerate per second in a " + s_size + "inch screen");

    } 

    void takephoto() {

        System.out.println("Photo taken using 12 megapixel camera with one lens ");
        System.out.println("             ");
    }

}
