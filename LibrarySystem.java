public class LibrarySystem {
	
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;

	public LibrarySystem() {
		this.booklist = new Book[NUM_BOOK];
	}

	public void addBook(Book book) {
		booklist[bookCount++] = new LibraryBook(book);
	}
	
	public void removeBook(String title) {
    	// `for` LibrarySystem의 모든 Book
		for ( int i = 0; i < bookCount; i++ ) {

      		// `if` 책 제목이 발견되면
			if ( booklist[i].getTitle().equals(title)) {
				
                // 찾은 책부터 시작하여 모든 요소를 왼쪽으로 이동합니다.
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
        
				// 마지막 요소를 null로 설정하고 bookCount를 줄입니다.
				booklist[--bookCount] = null;
				System.out.println("라이브러리에서 '" + title + "' 삭제했습니다.");
        
				return; // 책 제거 후 종료 방법
			}
		}
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void borrowBook(String title) {
        for ( int i = 0; i < bookCount; i++) {
        	if ( booklist[i].getTitle().equals(title)) {
                if ( booklist[i].getTitle().equals(title)) {
                    boolean setAvailable = false;
                    System.out.println("'" + title + "' 책을 이미 빌렸습니다.");
				} 
                else {
					System.out.println("'" + title + "' 책을 빌렸습니다.");
				}
				return; // 책 제거 후 종료 방법
			}
		}
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void returnBook(String title) {
		for ( int i = 0; i < bookCount; i++) {
			if ( booklist[i].getTitle().equals(title)) {
                if ( !booklist[i].getTitle().equals(title)) {
                    boolean setAvailable = true;
                    System.out.println("'" + title + "' 책을 반납하였거나 가지고 있지 않습니다.");
				} 
                else {
                	System.out.println("'" + title + "' 책을 반납하였습니다.");
				}
				return; // 책 제거 후 종료 방법
			}
		}
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void displayAllBooks() {
		for (int i = 0; i < bookCount; i++) {
			System.out.println(booklist[i].getIsbn() + " | ");
			System.out.println(booklist[i].getTitle() + " | ");
			System.out.println(booklist[i].getAuthor() + " | ");
			System.out.println(booklist[i].getYear() + " | ");
			System.out.println(booklist[i].isAvailable());
			System.out.println("");
		}
    }

}
