package com.travelagency.controller;

import com.travelagency.model.Trip;
import com.travelagency.service.TripService;

import java.util.Scanner;

public class TravelAgencyApp {
    public static void main(String[] args) {
        TripService tripService = new TripService();

        tripService.initializeSampleTrips();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                displayMenu();
                choice = getUserChoice(scanner);
                handleUserChoice(choice, tripService, scanner);
            } while (choice != 0);
        }
    }

    private static void displayMenu() {
        System.out.println("\nWelcome to Travel Agency! Please choose an option:");
        System.out.println("1. View all trips");
        System.out.println("2. Sort trips by price");
        System.out.println("3. Sort trips by duration");
        System.out.println("4. Filter trips by destination");
        System.out.println("0. Exit");
    }

    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choice, TripService tripService, Scanner scanner) {
        switch (choice) {
            case 1 -> displayTrips(tripService);
            case 2 -> {
                System.out.print("Sort ascending? (true/false): ");
                boolean ascPrice = scanner.nextBoolean();
                sortAndDisplayTrips(tripService, true, ascPrice);
            }
            case 3 -> {
                System.out.print("Sort ascending? (true/false): ");
                boolean ascDuration = scanner.nextBoolean();
                sortAndDisplayTrips(tripService, false, ascDuration);
            }
            case 4 -> {
                System.out.print("Enter destination: ");
                scanner.nextLine(); // Очищення буфера
                String destination = scanner.nextLine();
                filterAndDisplayTrips(tripService, destination);
            }
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    private static void displayTrips(TripService tripService) {
        for (Trip trip : tripService.getTrips()) {
            System.out.println(trip);
        }
    }

    private static void sortAndDisplayTrips(TripService tripService, boolean byPrice, boolean ascending) {
        if (byPrice) {
            tripService.sortByPrice(ascending);
        } else {
            tripService.sortByDuration(ascending);
        }
        displayTrips(tripService);
    }

    private static void filterAndDisplayTrips(TripService tripService, String destination) {
        for (Trip trip : tripService.filterByDestination(destination)) {
            System.out.println(trip);
        }
    }
}