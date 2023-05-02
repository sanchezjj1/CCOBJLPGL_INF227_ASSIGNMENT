public class Venus implements Planet{
    
    @Override
    public void accept(Explorers explorers) {
        explorers.visit(this);
    }
}
