package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entitites.Departament;
import entitites.HourContract;
import entitites.Worker;
import entitites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY):");
			LocalDate contractDate = LocalDate.parse(sc.next(), formatter);
			System.out.print("Value per Hour");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Enther month and year to calculate income (MM/YYYY)");
		String monthAndYear = sc.next();
		Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
	}

}
