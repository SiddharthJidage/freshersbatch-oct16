package SpringCore4_1;

import org.springframework.stereotype.Service;

@Service("M")
public class math {
	
		public int add(int x, int y) {
			return x + y;
		}
		
		public int subtract(int x, int y) {
			return x - y;
		}
	}