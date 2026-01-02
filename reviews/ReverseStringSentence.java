package keywords;

public class ReverseStringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shagun is good girl";
		String[] arr=str.trim().split("\\s+");
		for(int i=0;i<arr.length;i++) {
			String curr=arr[i];
		    arr[i]=rev(curr);
		}
		String answer="";
		for(int i=0;i<arr.length;i++) {
			answer+=arr[i]+" ";
		}
		System.out.println(answer);

	}
	public static String  rev(String curr) {
		String ans="";
		for(int i=curr.length()-1;i>=0;i--) {
			ans+=curr.charAt(i);
		}
		return ans;
	}

}
