package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> salesList = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				salesList.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				line = br.readLine();
			}

			System.out.println();
			System.out.println("****** Cinco primeiras vendas de 2016 ********");

			List<Sale> filteredSales = salesList.stream().filter(x -> x.getYear() == 2016)
					.sorted((s1, s2) -> s2.averagePrice().compareTo(s1.averagePrice())).limit(5)
					.collect(Collectors.toList());
			filteredSales.forEach(System.out::println);

			System.out.println();

			Double loganSales = salesList.stream().filter(x -> x.getSeller().contains("Logan"))
					.filter(x -> x.getMonth() == 1 || x.getMonth() == 7).map(x -> x.getTotal())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + loganSales);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}

}