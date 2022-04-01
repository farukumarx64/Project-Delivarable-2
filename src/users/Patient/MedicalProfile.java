package users.Patient;

import java.util.Scanner;

public class MedicalProfile {
    public double height, weight;
    public boolean insurance;
    public String allergies, disabilities, condition;

    public MedicalProfile(double height, double weight, String allergies, String disabilities, String condition, boolean insurance) {
        this.height = height;
        this.weight = weight;
        this.allergies = allergies;
        this.disabilities = disabilities;
        this.condition = condition;
        this.insurance = insurance;
    }

    void updateMedicalProfile(double userHeight, double userWeight, String userDisabilities,String userAllergies, boolean userInsurance, String userCondition) {
        height = userHeight;
        weight = userWeight;
        allergies = userAllergies;
        insurance = userInsurance;
        condition = userCondition;
        disabilities = userDisabilities;
    }
}
