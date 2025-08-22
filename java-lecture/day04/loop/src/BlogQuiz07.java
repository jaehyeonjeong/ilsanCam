public class BlogQuiz07 {
    public static void main(String[] args) {
//        7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
//        배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
//
//        int i = (int)(Math.random()*10+1);
       int nArray[] = new int [10];
       int nSum = 0;

        for(int i = 0;  i < 10; i++) {
            // 1 ~ 10 까지의 배열 변수에 랜덤 숫자들을 저장
            nArray[i] = (int)(Math.random()*10+1);
            nSum += nArray[i];
        }
        for(int i = 0; i < 10; i++){
            System.out.print(nArray[i] + ", ");
        }
        System.out.println("\n배열 된 숫자들의 평균 : " + (double)nSum / 10);
    }
}
