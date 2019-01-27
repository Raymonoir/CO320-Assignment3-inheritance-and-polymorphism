import java.util.*;

/**
 * The PatientList class represents a set of patients waiting
 * to been seen.
 * 
 * @author David J. Barnes
 * @version 2018.12.04
 */
public class PatientList
{
    // The patients' doctor.
    private Doctor doctor;
    // Where the consultations take place.
    private String room;
    // Patients to be seen.
    private List<Patient> patients;
    // A limit on the number of patients in the list.
    private int capacity;
    
    /**
     * Create a PatientList with a maximum size.
     * All other details are set to default values.
     */
    public PatientList(int maxNumberOfPatients)
    {
        doctor = null;
        room = "unknown";
        patients = new ArrayList<Patient>();
        capacity = maxNumberOfPatients;
    }

    /**
     * Enrol a patient in this PatientList.
     * A patient can only be enrolled if the list is not already full.
     * An error message is printed if an attempt is made to enrolled a
     * patient to a full list.
     * @param patient The patient to be enrolled.
     */
    public void enroll(Patient patient)
    {
        if(patients.size() == capacity) {
            System.out.print("The list is full. ");
            System.out.println("No further patients can be enrolled.");
        }
        else {
            patients.add(patient);
        }
    }
    
    /**
     * Return the number of patients who have been enrolled.
     * @return The number of patients who have been enrolled.
     */
    public int numberOfPatients()
    {
        return patients.size();
    }
    
    /**
     * Return the capacity of this list.
     * @return The capacity of this PatientList.
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * Return this list's doctor.
     * @return The doctor for this list.
     */
    public Doctor getDoctor()
    {
        return doctor;
    }
    
    /**
     * Set the room details.
     * @param roomNumber The room.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the doctor for this PatientList.
     * @param doctor The list's doctor.
     */
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
    
    /**
     * Print out details of this list to the standard
     * output.
     */
    public void printList()
    {
        System.out.println("Patients for: " + doctor.toString() + 
                           " room: " + room);
        System.out.println("Number of patients: " + numberOfPatients());
        System.out.println("Patient list:");
        for(Patient patient : patients) {
            System.out.print("    ");
            patient.print();
        }
    }
}
