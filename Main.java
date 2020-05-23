package CMPproject;

import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		int options=0;
		while (options!=-1){
			System.out.println("please choise the option you want to do, please press ");
			System.out.println("1 to insert books");
			System.out.println("2 to brrow book");
			System.out.println("3 to add or remove member");
			Scanner input =new Scanner (System.in);
			options=input.nextInt();
			if (options==1) InsertBooks();
			if(options==3) members();
		}

	}

	public static void InsertBooks() {
	int counter;
		System.out.println("please enter the number of books: ");
		Scanner input=new Scanner (System.in);
		int num=input.nextInt();
		book bookslist[]=new book[num];
		for ( int i=0; i<num; i++){
				System.out.println("please enter title, auther name, date of publishing, copies number");
				book book1=new book();
				book1.title =input.next();
				book1.auther=input.next();
				book1.dateofpublishing=input.next();
				book1.copies=input.nextInt();
				bookslist[i]=book1;
				//System.out.println(bookslist[i].title);		
		}
		
		
	

		}
	public static void members(){
		System.out.println("please enter the number of users: ");
		Scanner input=new Scanner (System.in);
		int usernum=input.nextInt(); 
		users users[]=new users[usernum]; 
		for(int i=0; i<usernum; i++){
			System.out.println("please enter user name: ");
			users user1 = new users();
			user1.userName=input.next();
			for(int j= i+1; j<=usernum; j++){
				if(users[i]==users[j]){
					System.out.println("user name alreay exist");
				}
			}

				}
		}
		
		
	}
