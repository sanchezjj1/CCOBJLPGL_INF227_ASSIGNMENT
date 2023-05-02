public class Mars implements Planet {
    
    @Override
    public void accept(Explorers explorers) {
        explorers.visit(this);
    }

}
