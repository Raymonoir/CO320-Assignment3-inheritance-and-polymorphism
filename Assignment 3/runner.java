
public class runner {

	public static void main(String[] args) 
	{
		PatientList pList1 = new PatientList(6);
		Doctor d1 = new Doctor("Chanel");
		Patient p1 = new Patient("Ray Ward");
		Patient p2 = new Patient("Maisie Ward");
		Patient p3 = new Patient("Aaron Strowger");
		Patient p4 = new Patient("Nat Riseborough");
		
		PatientList pList2 = new PatientList(6);
		Doctor d2 = new Doctor("Coco");
		Patient p5 = new Patient("Jack Roman");
		Patient p6 = new Patient("Tom Dyer");
		Patient p7 = new Patient("Calum Pacey");
		Patient p8 = new Patient("Amy O'Pacey");
		
		pList1.setMedic(d1);
		pList2.setMedic(d2);
		
		pList1.enroll(p1);
		pList1.enroll(p2);
		pList1.enroll(p3);
		pList1.enroll(p4);
		
		pList2.enroll(p5);
		pList2.enroll(p6);
		pList2.enroll(p7);
		pList2.enroll(p8);
		
		
		
		
		/////////////////////////////////////////////////////////////
		// TASK 1 //
		/////////////////////////////////////////////////////////////
		
		
		pList1.setMedic(null);
		
		System.out.println(" \nShould show unknown for doctor instead of null");
		pList1.printList();
		
		pList1.setMedic(d1);
		
		System.out.println("\nShould show 'Dr Chanel ' for doctor ");
		
		pList1.printList();
		
		
		/////////////////////////////////////////////////////////////
		// TASK 3 //
		/////////////////////////////////////////////////////////////
		
		d2.changeTitle("Mrs");
		
		
		System.out.println("Doctor should have title of Mrs");
		pList2.printList();
		
		p5.changeTitle("Mr");
		p6.changeTitle("Miss");
		System.out.println();
		
		System.out.println("First and second patients have titles");
		pList2.printList();
		
		p6.changeTitle("Mrs");
		System.out.println();
		System.out.println("Second patient's title should have changed");
		pList2.printList();
		
		
		p6.changeTitle("Srgt");
		System.out.println();
		System.out.println("Second patient's title should have changed again");
		pList2.printList();
		
		p5.changeTitle("");
		System.out.println();
		System.out.println("First title should be removed");
		pList2.printList();
		
		
		
		
		/////////////////////////////////////////////////////////////
		// TASK 4 //
		/////////////////////////////////////////////////////////////
		
		//pList1.setMedic(p1);  -----  creates error message,  showing medic cannot be set to patient
		System.out.println();
		System.out.println("Patient has no title");
		System.out.println(p1.toString());
		p1.changeTitle("Mrs");
		System.out.println("Title should have changed and both should be formatted correctly");
		System.out.println(p1.toString());
		
		
	
		
		
	}

}
