package cinema;

import java.util.Scanner;

public class Cinema {
    final static Scanner scanner = new Scanner(System.in);
    public static int tickets = 0;
    public static int income = 0;
    public static int totalIncome = 0;
    static String[][] cinemaSeats;
    static int rows, seats;
    public static void main(String[] args) {
        cinemaProfit ();
    }
    static void cinemaProfit () {
        System.out.println("Enter the number of rows:");
        rows = scan();
        System.out.println("Enter the number of seats in each row:");
        seats = scan();
        cinemaSeats(rows, seats);
        options();
    }
    static void cinemaSeats (int rows, int seats) {
        if (rows <= 9 && seats <= 9) {
            cinemaSeats = new String[rows + 1][seats + 1];
            totalIncome = (rows * seats) > 60 ?
                    ((rows - (rows / 2)) * 8 * seats) + (rows / 2 * seats * 10) : (10 * rows * seats);
            for (int i = 0; i < rows + 1; i++) {
                for (int j = 0; j < seats + 1; j++) {
                    if (i == 0 && j == 0)
                        cinemaSeats[0][0] = "  ";
                    else if (j == 0)
                        cinemaSeats[i][0] = i + " ";
                    else if (i == 0)
                        cinemaSeats[0][j] = j + " ";
                    else
                        cinemaSeats[i][j] = "S ";
                }
            }
        }
        else {
                System.out.println("Wrong input!\nTry Again");
                cinemaProfit();
        }
    }
    static void options(){
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int in = scan();
            if (in == 1) {
                printCinemaSeats(cinemaSeats);
                options();
            }
            else if(in == 2) {
                reserveSeats();
                options();
            }
            else if(in == 3) {
                double percent = 100 * (double)tickets / (seats * rows)  ;
                String one = "Number of purchased tickets: %d\n";
                String two = "Percentage: %.2f%%\n";
                String three = "Current income: $%d\n";
                String four = "Total income: $%d\n\n";
                System.out.printf(one + two + three + four,tickets,percent,income,totalIncome);
                options();
            }
            else if (in > 3 || in < 0) {
            System.out.println("Wrong input!\n");
            options();
        }
    }
     static void printCinemaSeats (String[][] cinemaSeats) {
        System.out.println("\nCinema:");
        for (String[] ci: cinemaSeats) {
            for (String c : ci) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void reserveSeats () {
        System.out.println("Enter a row number:");
        int row = scan();
        System.out.println("Enter a seat number in that row:");
        int seat = scan();
        if (row >= cinemaSeats.length || seat >= cinemaSeats[0].length){
            System.out.println("Wrong input!\n");
            reserveSeats();
        }
        if(row < cinemaSeats.length && seat < cinemaSeats[0].length) {
            if (cinemaSeats[row][seat].equals("B ")) {
                System.out.println("That ticket has already been purchased!");
                reserveSeats();
            } else {
                cinemaSeats[row][seat] = "B ";
                tickets++;
                int inc = (cinemaSeats.length - 1) * (cinemaSeats[0].length - 1) > 60 ?
                        row >= (cinemaSeats.length) / 2 ? 8 : 10 : 10;
                income += inc;
                System.out.println("Ticket price: $" + inc + "\n");
            }
        }
    }
    static int scan(){
        return scanner.nextInt();
    }

    }
