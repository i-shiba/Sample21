/* ENUM ÇégópÇµÇƒÇ¢Ç»Ç¢èÍçá*/

public class CoffeeSize {
	
	public static final CoffeeSize TOOL   = new CoffeeSize(5);
	public static final CoffeeSize SHORT  = new CoffeeSize(3);
	public static final CoffeeSize GRANDE = new CoffeeSize(10);
	public static final CoffeeSize VENTI  = new CoffeeSize(20);

	private int ownce = 0;
	
	private CoffeeSize(int ownce){
		this.ownce = ownce;
	}

}
