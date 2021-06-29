package Another;

public class ExtractionFileName {

	public static void main(String[] args){
		
	
	String[] fileName = {"C:/mydocument/resume/나의 이력서.hwp", "D:/dddd.mp3","F:/dddd/ffff/hoho.jpg"};

// 	lastIndex 없이 사용법.
//	for(int i=0; i<fileName.length; i++){
//			
//		String[] aa = fileName[i].split("/");
//		int index = aa[aa.length-1].indexOf(".");
//		System.out.println(aa[aa.length-1].substring(0,index));
//	}
	
	for(int i=0; i<fileName.length; i++){
		
		int index = fileName[i].lastIndexOf("/");
		int comIndex = fileName[i].indexOf(".");
		
		System.out.println(fileName[i].substring(index+1,comIndex));
	}
	
}
}


