package JavaPrograms;

public class FindDuplicateCharInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Damini ddd";
	
		char[] ch=s.toLowerCase().toCharArray();
		
		int count=0;
		//GetOccurence(s, 'n');
	
	
		
		  for(int i=0;i<s.length();i++) {
		  
		  count=1; for(int j=i+1;j<s.length();j++) { if(ch[i]==ch[j] && ch[j]!=' ') {
		  
		  count++; 
		  ch[j]='0'; } }
		  
		  if(count>1 && ch[i]!='0') { System.out.println(ch[i]+"--" +count); } }
		 
		
		/*
		 * public static void GetOccurence(String str,char var) {
		 * 
		 * int count=0; for(char ch:str.toCharArray()) { if(ch==var) { count++; }
		 * 
		 * } System.out.println(var+" "+count); }
		 */
	}
}
