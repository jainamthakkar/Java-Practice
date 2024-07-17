package FromInheritance;

class Demoo1{
    int height;

    int width;

    int depth;

    int volume(int h, int w, int d){
        return h * w * d;
    }
}


class Demoo2 extends Demoo1{

    int breadth;

    int moreThanVol(int h, int w, int d, int b){
        Demoo2 obj = new Demoo2();

        return obj.volume(h, w, d) * b;
    }

}



public class InheritanceDemo1 {

    public static void main(String[] args) {

        Demoo2 demoo2 = new Demoo2();

        int result = demoo2.moreThanVol(1, 2, 3, 4);

        Demoo1 demoo1 =new Demoo1();

//        demoo1.moreThanVol(1, 2, 3, 4);

        demoo1.volume(1, 2, 3);

        System.out.println(demoo2.volume(1, 2, 3));

        System.out.println(result);
    }
}
