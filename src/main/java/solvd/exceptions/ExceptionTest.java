package solvd.exceptions;

public class ExceptionTest {
    public void testInput(int input) throws CustomException {
        if(input > 100 || input < 1){
            throw new CustomException("Invalid number range");
        }
        else{
            System.out.println("the number " + input + " is in valid range");
        }
    }
}
