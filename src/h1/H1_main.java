package h1;

public class H1_main {

	public static void main(String[] args) {
		Zahl z = new Zahl();
        z.num = 42;

        z.setEven();
        z.setPositive();
        z.setSmall();

        System.out.println("num = " + z.num);
        System.out.println("even = " + z.even);
        System.out.println("positive = " + z.positive);
        System.out.println("small = " + z.small);

	}
	public class Zahl {

	    public boolean even;
	    public boolean small;
	    public boolean positive;

	    public int num;

	    public void setEven() {
	        if (num % 2 == 0) {
	            even = true;
	        } else {
	            even = false;
	        }
	    }

	    public void setPositive() {
	        if (num > 0) {
	            positive = true;
	        } else {
	            positive = false;
	        }
	    }

	    public void setSmall() {
	        if (num < 100) {
	            small = true;
	        } else {
	            small = false;
	        }
	    }
}
