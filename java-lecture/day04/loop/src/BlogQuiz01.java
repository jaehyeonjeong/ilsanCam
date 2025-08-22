public class BlogQuiz01 {
    public static void main(String[] args) {
//
//        1. 100보다 작은 짝수의 합을 구하는 코드를 작성하시오.
//                for문과 while문으로 각각 작성하시오.
        int nSum = 0;
        for(int i = 0; i <= 100; i+=2){
            nSum += i;
        }

        System.out.println("for 문으로 구한 짝수의 합 : " + nSum);

        nSum = 0;

        int i = 0;
        while(true){
            nSum += i;
            i += 2;
            if(i > 100) break;
        }

        System.out.println("while 문으로 구한 짝수의 합 : " + nSum);

    }
}
