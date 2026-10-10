package RCS;
public class factoriall {

    public static void mian(String args[]){

        System.out.println();
        message(5);
    }
    
}

static void message(int n) {

    if(n == 0)return;

    System.out.println("h");
    message( n - 1 );
}