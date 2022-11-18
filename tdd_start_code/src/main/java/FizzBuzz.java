public class FizzBuzz {

    ///It returns Fizz, Buzz and Fizz Buzz
    //**Order wise then you want the most restrictive condition at the top.
    //3 possible returns - if the number is divisible by 3 but not 5,
    // return “Fizz”. If the number is divisible by 5 but not 3,
    // return “Buzz”. If the number is divisible by BOTH 3 and 5,
    // return “FizzBuzz”
    //Putting the 15 one at the top is intending to bring fizz buzz
    public String getFizzBuzz(Integer number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return "" + number;


    }
}