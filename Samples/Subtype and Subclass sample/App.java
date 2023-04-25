public class App {
    public static void main(String[] args) throws Exception {

        //iPadMini is a subtype of ipadWithCamera

        iPadWIthCamera myIPad = new iPadMini();
        
        myIPad.playgame(8.9,"dual core");
        myIPad.takephoto();

        //iPadPro is a subtype of iPadWithCamera

        iPadWIthCamera myIPad2 = new iPadPro();

        myIPad2.playgame(12.9, "hexa core");
        myIPad2.takephoto();

        //iPadeClassic is a subtype of iPadWithNoCamera
        
        iPadWithNoCamera myiPad3 = new iPadClassic();
        
        myiPad3.playgame(20.9, "octa core");

    }
}
