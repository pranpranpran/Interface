interface A{
    String s ="mrityunjay Kumar";
    public void run();
    public void play();
}
interface X{
    void game();
}

interface Y extends X{

}
class B implements A, X{
    public void run(){
        System.out.println("called run methd");
    }

    public void play(){
        System.out.println("called play method");
    }

    public void game(){

    }

}


class Main{
    public static void main(String a[]){
        B b = new B();
        b.play();
    }
}