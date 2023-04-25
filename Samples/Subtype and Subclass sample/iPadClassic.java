public class iPadClassic extends iPadWithNoCamera{ 

    void playgame(double s_size, String cpu) {

        int framerate = 0; 

        if(cpu.equals("octa core")){

            framerate = 90;
        } 

        System.out.println("I have played call duty at " + framerate + " Framerate per second in a " + s_size + "inch screen");
        System.out.println("                ");
    } 
    
}
