
public class Practice {
   public static void main(String[] args) {
	String s1="suraj";
	char[]ch=s1.toCharArray();
	for(int start=0, end=ch.length-1; start<ch.length/2; start++,end--)
	{
		char temp=ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
	}
	String s2=new String(ch);
	System.out.println(s2);
}
}
