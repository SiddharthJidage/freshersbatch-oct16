package SpringCore7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("paymentprocess")
public class PaymentClass {

		
		
		@Value("#{OrderDetails}")
		private OrderClass order;

		public OrderClass getOrder() {
			return order;
		}

		public void setOrder(OrderClass order) {
			this.order = order;
		}
		
		public void Display() {
			
			System.out.println(order.getPrice()+""+order.getItemName()+""+order.getAdreess());
		}
		
		

	}


