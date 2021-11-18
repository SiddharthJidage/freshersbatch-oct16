package Assignment3;

public class AppendOpration {

	public static void main(String[] args) {
		
		StringBuffer StrBuff = new StringBuffer();
		
		StrBuff.append("Stringbuffer ");
		StrBuff.append("is a peer class of String ");
		StrBuff.append("that provides much of ");
		StrBuff.append("the functionality of String.");
		System.out.println("updated stringbuffer -> "+ StrBuff);
		
		
		System.out.println("=========================================================");
		
		StringBuilder StrBuild = new StringBuilder();
		
		StrBuild.append("Stringbuffer ");
		StrBuild.append("is a peer class of String ");
		StrBuild.append("that provides much of ");
		StrBuild.append("the functionality of String.");
		
		System.out.println("updated stringbuilder -> "+ StrBuild);

	}

}
