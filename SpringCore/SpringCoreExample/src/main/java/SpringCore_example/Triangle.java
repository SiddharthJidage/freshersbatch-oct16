package SpringCore_example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void Draw() {
		
		System.out.println("PointA ("+ getPointA().getX()+" , "+ getPointA().getY()+")");
		System.out.println("PointB ("+ getPointB().getX()+" , "+ getPointB().getY()+")");
		System.out.println("PointC ("+ getPointC().getX()+" , "+ getPointC().getY()+")");
		
		

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is intialized.");
		
		// other way to initialize a method in spring is to specify the init-method="method name " and destroy-method="method name "the method get initialized 
		// when the bean get called.
		/*as we import import org.springframework.beans.factory.DisposableBean;import org.springframework.beans.factory.InitializingBean;
		 * these spring frameworks we get dependent on it . */
		
	}

	public void destroy() throws Exception {
		System.out.println("Bean is disposed.");
		
	}
	


}
