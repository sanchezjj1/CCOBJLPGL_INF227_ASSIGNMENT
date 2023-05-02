public interface Explorers {
   
    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Venus venus);

    void visit(Jupiter earth);

    default void visit(Planet planet) {
        System.out.println();
        System.out.println("Landed on an unknown planet...");
    }
}
