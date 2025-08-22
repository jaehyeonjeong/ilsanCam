import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class BlogQuiz04 {
    public static void main(String[] args) {
//        4. Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을
//        작성하라. 다음은 e를 입력받았을 경우이다.
//
//        소문자 알파벳 하나를 입력하시오 >> e
//
//                abcde
//        abcd
//                abc
//        ab
//                a

        Scanner scanner = new Scanner(System.in);


        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String strInput = scanner.next();
        char chInput = strInput.charAt(0); // e >

        int nCount = (int)chInput;
        for(int i = (int)'a'; i <= (int)chInput ; i++){
            for(int j = (int)'a'; j <= nCount; j++){
                System.out.print((char)j);
            }
            nCount--;

            System.out.println();
        }


    }
}
