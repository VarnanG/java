package com.wipro.java.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
	static final String USER = "root";
	static final String PASS = "12345";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int targetNumber = random.nextInt(100) + 1;
		int attempts = 0;
		int guess = -1;

		System.out.println("Guess a number between 1 and 100:");

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				PreparedStatement stmt = conn.prepareStatement(
						"INSERT INTO game_results (player_name, attempts) VALUES (?, ?)");) {
			System.out.print("Enter your name: ");
			String playerName = scanner.nextLine();

			while (guess != targetNumber) {
				System.out.print("Your guess: ");
				guess = scanner.nextInt();
				attempts++;

				if (guess < targetNumber) {
					System.out.println("Too low! Try again.");
				} else if (guess > targetNumber) {
					System.out.println("Too high! Try again.");
				} else {
					System.out.println(
							"Congratulations! You guessed the number in "
									+ attempts + " attempts.");
					stmt.setString(1, playerName);
					stmt.setInt(2, attempts);
					stmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
