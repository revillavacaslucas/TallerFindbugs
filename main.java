package programaPruebaFindbugs;

public class main {
	public static void main(String[] args){
		
		boolean continues = true;
		
		while(continues){
			System.out.println("avanza");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
