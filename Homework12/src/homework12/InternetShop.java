package homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InternetShop {
	
	
	public static List<CatalogProducts> ascendingSort(List<CatalogProducts> list) {
		Scanner in = new Scanner(System.in);
		List<CatalogProducts> sorted_catalog = new ArrayList<>();
		String[] names = new String[list.size()];
		Double[] arr  = new Double[list.size()];
		System.out.println("---Welcome in a ascending sort!---");
		System.out.println("What do you want to sort list by?(name/cost/rating)");
		String sorting_factor = in.nextLine();
		
		if (sorting_factor.equals("name")) {
			for (int i = 0; i < list.size(); i++) {
				names[i] = list.get(i).getName();
			}
			Arrays.sort(names);
			
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getName() == names[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else if(sorting_factor.equals("cost")) {
			for (int i = 0; i < list.size(); i++) {
				arr[i] = list.get(i).getCost();
			}
			Arrays.sort(arr);
			
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getCost() == arr[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else if (sorting_factor.equals("rating")) {
			for (int i = 0; i < list.size(); i++) {
				arr[i] = list.get(i).getRating();
			}
			Arrays.sort(arr);
			
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getRating() == arr[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else {
			System.out.println("There is no such sorting option. Please, choose between possible options.");
			ascendingSort(list);
		}
				
		return sorted_catalog;
		
	}
	
	
	public static List<CatalogProducts> descendingSort(List<CatalogProducts> list) {
		
		Scanner in = new Scanner(System.in);
		List<CatalogProducts> sorted_catalog = new ArrayList<>();
		String[] names = new String[list.size()];
		Double[] arr  = new Double[list.size()];
		
		System.out.println("---Welcome in a descending sorting!---");
		System.out.println("What do you want to sort list by?(name/cost/rating)");
		String sorting_factor = in.nextLine();
		
		if (sorting_factor.equals("name")) {
			for (int i = 0; i < list.size(); i++) {
				names[i] = list.get(i).getName();
			}
			Arrays.sort(names);
		
			for (int i = list.size()-1; i >= 0; i--) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getName() == names[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else if(sorting_factor.equals("cost")) {
			for (int i = 0; i < list.size(); i++) {
				arr[i] = list.get(i).getCost();
			}
			Arrays.sort(arr);
		
			for (int i = list.size()-1; i >= 0; i--) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getCost() == arr[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else if (sorting_factor.equals("rating")) {
			for (int i = 0; i < list.size(); i++) {
				arr[i] = list.get(i).getRating();
			}
			Arrays.sort(arr);
			
			for (int i = list.size()-1; i >= 0; i--) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getRating() == arr[i]) {
						sorted_catalog.add(list.get(j));
					}
				}
			}
		} else {
			System.out.println("There is no such sorting option. Please, choose between possible options.");
			descendingSort(list);
		}
		return sorted_catalog;
		
	}
	public static void display(List<CatalogProducts> list) {
		for (CatalogProducts cp : list) {
			System.out.println(cp.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<CatalogProducts> catalog = new ArrayList<>();
		catalog.add(new CatalogProducts("Perfume3", 345.9, 5));
		catalog.add(new CatalogProducts("Perfume0", 150.0, 3));
		catalog.add(new CatalogProducts("Perfume1", 456.89, 6));
		catalog.add(new CatalogProducts("Perfume5", 56.78, 1));
		catalog.add(new CatalogProducts("Perfume2", 100.9, 2));
		catalog.add(new CatalogProducts("Perfume4", 789.8, 7));
		

		
		boolean exit = false;
		while (!exit) {
			System.out.println("In what order do you want to sort a list: descending or ascending - or type e for exit?(type (d, a or e))");
			String answer = in.nextLine();
			if (answer.equals("d")) {
				List<CatalogProducts> sorted_list =  descendingSort(catalog);
				display(sorted_list);
			} else if (answer.equals("a")) {
				List<CatalogProducts> sorted_list =  ascendingSort(catalog);
				display(sorted_list);
			} else if (answer.equals("e")) {
				exit = true;
			} else {
				System.out.println("There is no such option. Please, choose between possible options.");
			}
		}
		
	}

}
