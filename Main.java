import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
/* Task 1:
            int[] array0 = {1, 5, -5, 2, 12, 30};
            int[] array1 = {-10, 50, 15, 2};

            System.out.print("common_elements: [");

            for (int i = 0; i < array0.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array0[i] == array1[j]) {
                        System.out.print(array0[i]);

                    }
                }
            }
            System.out.println("]");

        }
    }


Task 2:
            int[] array0 = {1, 5, -5, 2, 12, 30};
            int[] array1 = {-10, 50, 15, 2};
            boolean check = false;
            boolean check1 = false;

            for (int i = 0; i < array0.length; ++i) {
                if (array0[i] == 65) {
                    for (int j = 0; j < array0.length; ++j) {
                        if (array0[j] == 77) {
                            System.out.println("array0: [1,77,-5,2,65,30] => True");
                            check = true;

                        }
                    }
                }
            }
            if (!check) {
                System.out.println("array0: [1,77,-5,2,65,30] => False");
            }

            for (int i = 0; i < array1.length; ++i) {
                if (array1[i] == 65) {
                    for (int j = 0; j < array1.length; ++j) {
                        if (array1[j] == 77) {
                            System.out.println("array0: [-10,50,15,2,77] => True");
                            check1 = true;
                        }
                    }
                }
            }
            if (!check1) {
                System.out.println("array1: [-10,50,15,2,77] => False");
            }



        }

    }

Task 3:
        char[] array0 = {'s', 'a', 'b', 'a'};
        char temp;

        for (int i = 0; i < array0.length/2; ++i) {
            temp = array0[i];
            array0[i] = array0[array0.length - i - 1];
            array0[array0.length - i - 1] = temp;
        }
        System.out.println("array: ['s','a','b','a']");
        System.out.print("result: [");

        for (int i = 0; i < array0.length; ++i) {
            System.out.print("'");
            System.out.print(array0[i]);
            System.out.print("'");
        }
        System.out.print("]");





    }

}

Task 4:
        String myString = "Saba";
        String myString2 = "John";
        boolean checker = false;

        for (int i = 0; i < myString.length(); ++i) {
            for (int j = 0; j < myString.length(); ++j) {
                if (i != j && myString.charAt(i) == myString.charAt(j)) {
                    checker = true;
                    break;
                }
            }
            if (checker) {
                break;
            }

        }

        if (checker) {
            System.out.println("=> False");
        }
        else {
            System.out.println("=> True");
        }

        checker = false;

        for (int i = 0; i < myString2.length(); ++i) {
            for (int j = 0; j < myString2.length(); ++j) {
                if (i != j && myString2.charAt(i) == myString2.charAt(j)) {
                    checker = true;
                    break;
                }
            }
            if (checker) {
                break;
            }

        }

        if (checker) {
            System.out.println("=> False");
        }
        else {
            System.out.println("=> True");
        }
    }

}

Task 5:
        String myString = "madam";
        String myString2 = "test";

        int checker = 0;
        for (int i = 0; i < myString.length()/2; ++i) {
            if (myString.charAt(i) == myString.charAt(myString.length()-i-1)) {
                checker++;
            }
            else {
                break;
            }
        }

        if (checker == myString.length()/2) {
            System.out.println("True");

        }
        else {
            System.out.println("False");
        }
        checker = 0;
        for (int i = 0; i < myString2.length()/2; ++i) {
            if (myString2.charAt(i) == myString2.charAt(myString2.length()-i-1)) {
                checker++;
            }
            else {
                break;
            }
        }

        if (checker == myString2.length()/2) {
            System.out.println("True");

        }
        else {
            System.out.println("False");
        }
    }
    }


Task 6 (Got stuck):
        String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";

        for (int i = 0; i < text.length(); ++i) {
            if (i != text.length() - 1) {
                if (text.charAt(i) == '.') {
                    text.charAt(i).toUpperCase();
                            System.out.println();
                }
            }
        }


    }
}
*/
