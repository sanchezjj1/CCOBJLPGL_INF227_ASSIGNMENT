public class iPadPro extends iPadWIthCamera {
    
    void playgame(double s_size, String cpu) {

        int framerate = 0; 

        if(cpu.equals("hexa core")){

            framerate = 60;
        } 

        System.out.println("I have played call duty at " + framerate + " Framerate per second in a " + s_size + "inch screen");

    } 

    void takephoto() {

        System.out.println("Photo taken using 12 megapixel camera with three lens ");
        System.out.println("                   ");
    }


}
