package rensyu;

public class SwitchSample {

    public static void main(String[] args) {
        int score = 59;//成績

        //ランキングメソッドを呼び出し、ランクを取得
        int rank = ranking(score);

        switch(rank) {
        //scoreが0-59までの場合
        case 0 :
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("赤点です...補講を行います");
            break;
        //scoreが60-79までの場合
        case 6 :
        case 7 :
            System.out.println("合格です！");
            break;
        //scoreが80-99までの場合
        case 8 :
        case 9 :
            System.out.println("よくできました！");
            break;
        //scoreが100の場合
        case 10 :
            System.out.println("満点です！ご褒美をあげます！");
            break;
        }

    }
public static int ranking(int score) {
    //引数scoreの値が0を下回る場合
    if(score<0) {
        return -1;
    }else if(score>100) {
        return 11;
    }	else {
        return score /10;
    }
}
}

