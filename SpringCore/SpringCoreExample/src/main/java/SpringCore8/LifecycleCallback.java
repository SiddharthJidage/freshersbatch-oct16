package SpringCore8;

public class LifecycleCallback {
		   private String Str;

		   public void setMessage(String Str){
		      this.Str = Str;
		   }
		   public void getMessage(){
		      System.out.println("Here is the String : " + Str);
		   }
		   public void init(){
		      System.out.println("Bean is going through init.");
		   }
		   public void destroy() {
		      System.out.println("Bean will destroy now.");
		   }
		}

