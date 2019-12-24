package codeLearner.Vol_1.Lesson;
/*
        * x = x+y           x+=y
        * x = x-y           x-=y
        * x= x*y            x*=y
        * x= x/y            x/=y
        *
        *
         */
public class Lesson26 {
    public static void main(String[] args) {
       double  x=2,y =3;
       // int x=2,y =3;
      //  x +=y;  // output is 5
       // x-=y;     // -1
       // x*=y;       // 6
         x/=y; //output is 0 becuase its not make sense 2 / 3 =0, but if we use double its gonna be 0.66666
        System.out.println("new value of x = " + x);
    }

}
