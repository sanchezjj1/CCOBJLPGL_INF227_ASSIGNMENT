public class Study { 
    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main (String[]args) throws Exception {
	
        Study myReview = new Study();
     
        // precondition
    assert iwillReview == true: "Panis Pasado!";  
   
    myReview.iwillReview();
    System.out.println(iwillReview);
   
        // postcondition
    assert iwillNotFail == true: "Patay Bagsak Naman!";

    }

    void iwillReview() {
        iwillReview = false;
    }

    
}
