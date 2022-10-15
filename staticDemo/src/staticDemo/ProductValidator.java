package staticDemo;
//ürün kayderken kurallara uygunluğu araştırılır
public class ProductValidator {
	static {
		 System.out.println("Static Yapıcı çalıştı");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) 
		{
			return true;
		}
			else
			{
				return false;
			}
		}
	
	}
	


