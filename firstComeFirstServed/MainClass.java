package firstComeFirstServed;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("..................................");
		System.out.println("First-Come First-Served Scheduling");
		System.out.println("..................................");
		System.out.print("Number of process: ");
		int num = sc.nextInt();
		Process[] p = new Process[num];
		for(int i=0; i<num; i++){
			p[i] = new Process();
		}
		System.out.println("enter process details like (Name_ArrivalTime_BurstTime)\n use under-scroll as seperator");
		System.out.println("Name ArrivalTime BurstTime");
		System.out.println("---- --------- -----------");
		for(int i=0; i<num; i++){
			String str=sc.next();
			p[i].setName(str.substring(0,str.indexOf("_")));
			str=str.substring(str.indexOf("_")+1);
			p[i].setArrivalTime((int)(Integer.valueOf (str.substring(0,str.indexOf("_")))));
			str=str.substring(str.indexOf("_")+1);
			p[i].setBurstTime((int)(Integer.valueOf (str)));
		}
		sc.close();
		FCFS f = new FCFS(p);
		f.printAll();
	}
}
