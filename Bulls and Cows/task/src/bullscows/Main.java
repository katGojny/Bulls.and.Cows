package bullscows;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        String input = scanner.next();
        try {
            int lenghtOfCode = Integer.parseInt(input);
            if (lenghtOfCode > 0 && lenghtOfCode <= 36) {
                System.out.println("Input the number of possible symbols in the code:");
                int symbolsInTheCode = scanner.nextInt();
                if (symbolsInTheCode <= 36) {
                    try {
                        String range = "";
                        if (symbolsInTheCode >= lenghtOfCode) {
                            if (symbolsInTheCode <= 10) {
                                symbolsInTheCode -= 1;
                                range = "(0-" + symbolsInTheCode + ").";
                            } else {
                                int rangeNumber = 96 + symbolsInTheCode - 10;
                                char rangeLetter = (char) rangeNumber;
                                range = "(0-9, a - " + rangeLetter + ").";
                            }

                            StringBuilder stars = new StringBuilder();
                            for (int s = 0; s < lenghtOfCode; s++) {
                                stars.append("*");
                            }
                            System.out.println("The secret code is prepared: " + stars + " " + range);
                            if (lenghtOfCode < 37) {
                                String secretCode = randomNumber(lenghtOfCode, symbolsInTheCode);
                                System.out.println("Okay, let's start a game!");
                                int turn = 1;
                                int bull = 0;
                                int cow = 0;
                                while (bull != lenghtOfCode) {
                                    System.out.println("Turn " + turn + ":");
                                    String inputNumber = scanner.next();
                                    bull = bulls(secretCode, inputNumber);
                                    cow = cows(secretCode, inputNumber) - bull;

                                    if (bull == lenghtOfCode) {
                                        System.out.println("Grade: " + bull + " bulls");
                                        System.out.println("Congratulations! You guessed the secret code.");
                                    } else if (bull == 0 && cow == 1) {
                                        System.out.println("Grade: " + cow + " cow");
                                    } else if (bull == 0 && cow > 1) {
                                        System.out.println("Grade: " + cow + " cows");
                                    } else if (bull == 1 && cow == 0) {
                                        System.out.println("Grade: " + bull + " bull");
                                    } else if (bull > 1 && cow == 0 && bull < lenghtOfCode) {
                                        System.out.println("Grade: " + bull + " bulls");
                                    } else if (bull == 1 && cow == 1) {
                                        System.out.println("Grade: " + bull + "bull and " + cow + " cow");
                                    } else if (bull == 1 && cow > 1) {
                                        System.out.println("Grade: " + bull + " bull and " + cow + " cows");
                                    } else if (bull > 1 && cow == 1) {
                                        System.out.println("Grade: " + bull + " bulls and " + cow + " cow");
                                    } else {
                                        System.out.println("Grade: " + bull + " bulls and " + cow + " cows");
                                    }
                                    turn += 1;
                                }
                            } else {
                                System.out.println("Error.");
                            }
                        } else {
                            System.out.println("Error");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }


    public static int bulls(String secretCode, String inputNumber) {
        int bull = 0;
        for (int k = 0; k <= secretCode.length() - 1; k++) {
            if (secretCode.charAt(k) == inputNumber.charAt(k)) {
                bull += 1;
            }
        }
        return bull;
    }
    public static int cows(String secretCode, String inputNumber){
        int cow = 0;
        for (int i = 0; i <= secretCode.length() - 1; i++) {
            for (int j = 0; j <= secretCode.length() - 1; j++) {
                if (secretCode.charAt(j) == inputNumber.charAt(i)) {
                    cow += 1;
                }
            }
        }
        return cow;
    }

        public static String randomNumber(int lenght, int symbols) {
        String secretCode;
        StringBuilder randomStringBuilder = new StringBuilder();
        StringBuilder endSymbols = new StringBuilder("0123456789abcdefghijklmnopqrstuvwxyz");
        endSymbols.setLength(lenght);
        int oldRandomNumber = 0;
        int lower = 48; // '0'
        int upper = 57; // '9'
        if (symbols > 10) {
        lower = 97; //'a'
        upper = symbols - 10 + 96;
        }
        Random random = new Random();
            for (int i = 0; i < lenght; i++) {
                boolean condition = random.nextBoolean();
                if (condition) {
                    int randomNumber2 = random.nextInt(10);
                    if (randomNumber2 != oldRandomNumber) {
                        oldRandomNumber = randomNumber2;
                        randomStringBuilder.append(randomNumber2);
                    }
                }
                else {
                    int randomNumber = random.nextInt(upper - lower + 1) + lower;
                    if (randomNumber != oldRandomNumber) {
                        oldRandomNumber = randomNumber;
                        char randomChar = (char) randomNumber;
                        randomStringBuilder.append(randomChar);
                }
                }
            }

        randomStringBuilder.append(endSymbols);
        for (int i = 0; i < randomStringBuilder.length(); i++) {
            for (int j = (i + 1); j < randomStringBuilder.length(); j++) {
                if (randomStringBuilder.charAt(i) == randomStringBuilder.charAt(j)) {
                    randomStringBuilder.deleteCharAt(j);
                    j -= 1;
                }
            }
        }
        randomStringBuilder.setLength(lenght);

        secretCode = randomStringBuilder.toString();
        return secretCode;
        }
    }
