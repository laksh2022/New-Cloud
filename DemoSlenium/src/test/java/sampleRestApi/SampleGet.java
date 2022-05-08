package sampleRestApi;


public class SampleGet {
	
	public void getMethodExample() {
	
	String str = "I love to learn";

	String rev = "";

	String split[] = str.split(" ");

	for(int i = split.length-1; i >=0; i--){
		
		rev = rev + split[i] + " ";
	}
	System.out.println(rev);
}
	
}