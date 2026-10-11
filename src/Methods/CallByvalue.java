package Methods;

public class CallByvalue {
    static void solve(int num)
    {
        System.out.println("Inside solve :" + num);
        num = num * 5;
        System.out.println("Inside solve :" + num);

    }

    static void main() {
        int num = 5;
        System.out.println("Inside main :" + num);
        solve(num);
        System.out.println("Inside main :" + num);
    }
}
