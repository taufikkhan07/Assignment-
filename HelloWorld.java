package Feb27;
class HelloWorld {
    public static void main(String[] args) {
        //Looping from 1 to 150
        for(int i=1;i<=150;i++){
            //Calling primeNumber Function to check if the number is prime or not
           if(primeNumber(i)) System.out.print(i+",");
        }
    }
    public static boolean primeNumber(int n){
        //Creating a count variable to keep count
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        //If count is 2, thent he number is prime.
        if(count==2) return true;
        else return false;
    }
}