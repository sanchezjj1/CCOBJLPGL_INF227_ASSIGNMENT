public class App {
    public static void main(String[] args) throws Exception {
       
        {
            
            Planet mercury = new Mercury();
            Planet venus = new Venus();
            Planet jupiter = new Jupiter();
            Planet mars = new Mars();
            Planet saturn = new Saturn();
            
    
            Explorers astronaut = new HumanExplorers();
            Explorers rover = new RobotExplorers();
    
            {   System.out.println();
                System.out.print("Astronauts: ");}
            mercury.accept(astronaut);
            venus.accept(astronaut);
            jupiter.accept(astronaut);
            mars.accept(astronaut);
            saturn.accept(astronaut);
            
            {   System.out.println();
                System.out.print("Rovers: ");}
            mercury.accept(rover);
            venus.accept(rover);
            jupiter.accept(rover);
            mars.accept(rover);
            saturn.accept(rover);
           
        
    }
     

    }
}
