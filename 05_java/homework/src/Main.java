//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        double numW = 12.5;
        double numH = 36.4;

        System.out.println(numW * numH);
        System.out.println(2 * (numW + numH));

        char a = 'a';

        System.out.println((int) a);

        double 국어 = 80.5;
        double 수학 = 50.6;
        double 영어 = 70.8;

        System.out.println((int) (국어 + 수학 + 영어));
        System.out.println((int) (국어 + 수학 + 영어) / 3);

        int bigNum = 20;
        int smallNum = 10;

        System.out.println("두 수 중 큰수:" + ((bigNum > smallNum) ? bigNum : smallNum));


        int score1 = 90;

        System.out.println((score1 > 60)? "합격": "불합격");

        int takeOrSip = 2;

        System.out.println((takeOrSip % 2 ==0)? "짝수" : "홀수");

        double score2 = 88.88;

        int score3 = (int)score2;

        if(score3 > 90)System.out.println('A');
        else if(score3 >= 80)System.out.println('B');
        else if (score3 >= 70)System.out.println('C');
        else if (score3 >= 60)System.out.println('D');
        else if (score3 < 60)System.out.println('E');


        int numA = 12;
        int numB = 22;

        if(numA <= 6 && numA  > 0 && numB >0 && numB < 17 ) System.out.println("서재승의 배민쿠폰 당첨");
        else if(numA >= 7 && numA  <= 12 && numB >= 16 && numB <= 31 ) System.out.println("서재승의 스타벅스 커피");
        else {
            System.out.println("서재승의 선물은 사탕!");
        }

    }
}