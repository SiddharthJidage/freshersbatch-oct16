package Assignment6;

import java.util.*;

public class Coll1 {

	    long phoneNumber;
	    String contactName,email;
	    char gender;
	    public Coll1(long phoneNumber,String contactName,String email,char gender)
	    {
	        this.phoneNumber=phoneNumber;
	        this.contactName=contactName;
	        this.email=email;
	        this.gender=gender;
	    }

	}
	class Coll2
	{
	    public static void main(String[] args) {
	        Map<Long,Coll1>map=new TreeMap<>(Collections.reverseOrder());
	        Coll1 c1=new  Coll1(123456789L,"xyz","xyz@email.com",'F');
	        Coll1 c2=new  Coll1(987456321L,"abc","abcd@email.com",'M');
	        Coll1 c3=new  Coll1(123456789L,"hkr","hkr@email.com",'F');
	        Coll1 c4=new Coll1(321654987L,"nmf","nmf@emai.com",'M');
	        map.put(1L,c1);
	        map.put(2L,c2);
	        map.put(3L,c3);
	        map.put(4L,c4);


	        for(Map.Entry<Long,  Coll1> entry:map.entrySet()){
	            long key=entry.getKey();
	            Coll1 c5=entry.getValue();
	          System.out.println(key+" Details:");//prints all keys

	            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.contactName+"email: "+c5.email+" gender: "+c5.gender);
	        }
	        
	        System.out.print(" ");

	    }
	}

