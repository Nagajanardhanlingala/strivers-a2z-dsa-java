Pattern5:

* * * * *
* * * *
* * *
* *
*

Code:

public static void pattern5(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = i; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void main(String [] args){
        Main result = new Main();
        int n = 5;
        result.pattern5(n);
    }
}
