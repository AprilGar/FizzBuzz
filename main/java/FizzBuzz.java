public class FizzBuzz {

    public static String game(int number){ //expecting it to return a string so it is a string method
        if (number % 3 ==0 && number % 5 ==0){
            return "fizz buzz";
        } else if (number % 3 ==0){
            return "fizz";
        } else if (number % 5 ==0){
            return "buzz";
        }
        return String.valueOf(number);
    }
}
