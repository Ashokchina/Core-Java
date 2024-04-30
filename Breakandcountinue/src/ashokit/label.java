package ashokit;

public class label {

	public static void main(String[] args) {
		outer:
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=10;j++) {
					System.out.println(i+j);
					if(i+j>5) {
						break outer;
					}
				}
				System.out.println("im out side of outside of inner loop");
			}
System.out.println("im out side of outside of outer loop");

	}

}
