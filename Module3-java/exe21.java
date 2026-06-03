public class exe21 {
    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}



class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

