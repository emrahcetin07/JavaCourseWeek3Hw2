package abstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager cus=new CustomerManager();
		//cus.databaseManager=new SqlServerDatabaseManager();
		
		//cus.databaseManager=new SqlServerDatabaseManager();
		cus.databaseManager=new OracleDatabaseManager();//burayı değiştirirek yeni şeyler elde edebiliriz
		
		cus.getCustomers();

	}

}
