import java.lang.Math;

class helloworld
 {
	 public static void main(String args[])
	 {
		 System.out.println("Hello world of java!!!");
		 squareroot s = new squareroot() ;
		double sr =  s.findroot(25);
		System.out.println(sr);
	 }
 }
 
class squareroot
{
	double findroot(int num)
	{
		double f = Math.sqrt(num);
		return f;
	}
}