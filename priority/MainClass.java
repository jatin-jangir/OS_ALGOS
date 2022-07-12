package priority;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("...................");
		System.out.println("Priority Scheduling");
		System.out.println("...................");
		System.out.print("Enter 1 for preemptive version, Enter 0 for nonpreemptive version: ");
		int flag = sc.nextInt();
		System.out.print("Numer of process: ");
		int num = sc.nextInt();
		Process[] p = new Process[num];
		for(int i=0; i<num; i++){
			p[i] = new Process();
		}
		System.out.println("enter process details like (Name_ArrivalTime_BurstTime_Priority)\n use under-scroll as seperator");
		System.out.println("Name ArrivalTime BurstTime Priority");
		System.out.println("---- --------- -----------");
		for(int i=0; i<num; i++){
			String str=sc.next();
			p[i].setName(str.substring(0,str.indexOf("_")));
			str=str.substring(str.indexOf("_")+1);
			p[i].setArrivalTime((int)(Integer.valueOf (str.substring(0,str.indexOf("_")))));
			str=str.substring(str.indexOf("_")+1);
			p[i].setBurstTime((int)(Integer.valueOf (str.substring(0,str.indexOf("_")))));
			str=str.substring(str.indexOf("_")+1);
			p[i].setPriority((int)(Integer.valueOf (str)));
		}
		sc.close();
		Priority f = new Priority(p,flag);
		f.printAll();
	}
}
