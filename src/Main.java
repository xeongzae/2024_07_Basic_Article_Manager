
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		
		List<Article> articles = new ArrayList<>();
		
		while (true) {
			System.out.printf("명령어) ");
			
			String cmd = sc.nextLine().trim();
			
			if (cmd.equals("exit")) {
				break;
			} 
			
			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}
			
			if (cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				//막상 자신있게 했는데 아무것도 모름
				
				System.out.println(++lastArticleId + "번 글이 생성되었습니다");
			} else if (cmd.equals("article list")) {
				System.out.println("--여기는 수정해야하는데 어케하는지 몰라서 고민중--");
			} else {
				System.out.println("존재하지 않는 명령어 입니다");
			}
		}
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
	}
}

class Article{
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body){
		
	}
	
	
}