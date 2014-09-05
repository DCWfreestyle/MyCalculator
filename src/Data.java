
public class Data {
	
	public String str=new String();
	public float result=0;
	int n=0;
	public Data(){
		
	}
	public float getresult(){
		char[] c = str.toCharArray();
		n=str.length();
		for(int i=0;i<n;i++){
			if( c[i]=='\0') break;
			System.out.println(c[i]);
		}
		return result;
	}
}
