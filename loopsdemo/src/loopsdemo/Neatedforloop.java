package loopsdemo;

public class Neatedforloop {

	public static void main(String[] args) {
int x=1,y=1,z=1;
for(;x<=10;x++) {
	for(;y<=10;y++) {
		z=x*y*z;
}
	}
System.out.println(z);
	}}
