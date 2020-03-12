package com.epsilon.assignment.twentyeight;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("resource")
public class CsvWrite {
	public static void main(String[] args) {
		String filepath = "C:/Users/FHUSSAIN/OneDrive - Epsilon/Desktop/user.csv";
		System.out.println("Starting to write" + filepath);
		writeCsv(filepath);
		System.out.println("Operation done for CSV File @ " + filepath);
	}

	public static void writeCsv(String path) {
		ArrayList<User> users = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String response = "";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:/Users/FHUSSAIN/OneDrive - Epsilon/Desktop/user.csv");
			fileWriter.append("Id, Name, Email, Phone, Adress, City");

			while (flag) {
				User user = new User();
				System.out.print("\n Enter User Id: ");
				user.setId(sc.nextInt());

				System.out.print("\n Enter User Name: ");
				user.setName(sc.next());

				System.out.print("\n Enter User Email Id: ");
				user.setEmail(sc.next());

				System.out.print("\n Enter User City: ");
				user.setCity(sc.next());

				System.out.print("\n Enter User Address: ");
				user.setAddress(sc.next());

				System.out.print("\n Enter User Phone: ");
				user.setPhone(sc.next());

				users.add(user);
				System.out.print("Do you Wish to Continue?(Yes/No): ");
				response = sc.next();

				String responsel = response.toLowerCase();
				fileWriter.append("\n");

				fileWriter.append(String.valueOf(user.getId()));
				fileWriter.append(",");

				fileWriter.append(user.getName());
				fileWriter.append(",");

				fileWriter.append(user.getEmail());
				fileWriter.append(",");

				fileWriter.append(user.getPhone());
				fileWriter.append(",");

				fileWriter.append(user.getAddress());
				fileWriter.append(",");

				fileWriter.append(user.getCity());
				fileWriter.append(",");

				if (responsel.equals("no")) {
					flag = false;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
