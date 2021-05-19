package ArrayList;

public class ArrayList {
	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibaray, 0, 5);
		// (원본, 원본 시작, 복사본, 복사 시작, 읽어올 데이터 개수), 객체의 주소를 그대로 복사한다. 둘 중 어느하나라도 데이터를 변경하면 둘 다 바뀐다(주소가 같아서)
		System.out.println("======copy library=========");
		for( Book book : copyLibaray ) {
			book.showInfo();
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		copyLibaray[0].setTitle("김밥");
		copyLibaray[0].setAuthor("호호");
		System.out.println("======library=========");
		for( Book book : library) {
			book.showInfo();
		}
		
		System.out.println("======copy library=========");
		
		
		for( Book book : copyLibaray) {
			book.showInfo();
		}
	}
}
