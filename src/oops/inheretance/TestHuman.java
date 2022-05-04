package oops.inheretance;

public class TestHuman {
  public static void main(String[] args) {
	  
	  Father jack = new Father();
	  jack.athlelic();
	  jack.height();
	  jack.rich();
	  
	  Child kevin = new Child();
	  kevin.athlelic();
	  kevin.height();
	  kevin.rich();
	  kevin.communicate();
	  
	  GrandFather bob = new GrandFather();
	  bob.rich();
	  
	  Bird sparrow = new Bird();
	  sparrow.communicate();
			  
	  
  }
  
}
