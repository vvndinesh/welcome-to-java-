//**vadada venkata naga dinesh**//
//**Github userid vvndinesh**//
public class Fibnocciseries{

	public static void main(String[] args) {
		int k=0,a=1,b=1;
		System.out.print("1 1");
		System.out.print("");
		while(k<=900)
		{
			k=a+b;
			System.out.print(k);
			System.out.print("");
			a=b;
			b=k;
		}
	}
}
