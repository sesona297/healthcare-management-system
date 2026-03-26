package za.ac.cput;

import za.ac.cput.domain.Patient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient.Builder()
                .setPatientID("P001")
                .setFirstName("Sesona")
                .setLastName("Silva")
                .setEmail("Sese15@gmail.com")
                .setAge(25)
                .setGender("Female")
                .setAddress("28292 UMongikazi Street,Mfuleni,Bardale,7100")
                .build();

        }
    }
