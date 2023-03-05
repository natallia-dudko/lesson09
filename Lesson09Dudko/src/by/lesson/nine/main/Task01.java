package by.lesson.nine.main;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Task01 {

	public static void main(String[] args) {
		double x;
		double fx;
		x = inputDoubleFromConsole("Введите значение x: ");

		fx = result(x);
		print(x, fx);

	}

	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextDouble();
		return value;
	}

	public static double result(double x) {
		double fx;
		fx = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
		;
		return fx;
	}

	public static void print(double x, double fx) {
		System.out.println("При x = " + x + " значение функции fx = " + fx);
	}

}
