package users;

public class Form {
    public String Symptoms;
    public int Symptoms_duration;
    public String medications_taken;
    public void Form (String Symptoms, int Symptoms_duration, String medications_taken)
    {
        this.Symptoms = Symptoms;
        this.Symptoms_duration = Symptoms_duration;
        this.medications_taken = medications_taken;
    }
    void editForm(String userSymptoms, int userSymptoms_duration, String userMedications_taken)
    {
        this.Symptoms = userSymptoms;
        this.Symptoms_duration = userSymptoms_duration;
        this.medications_taken = userMedications_taken;
    }
}
