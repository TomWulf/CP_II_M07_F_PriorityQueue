public class Patient implements Comparable
{
    private String fullName;    // Could be a person type class object instead of a String
    private String procedure;   // What med procedure is needed
    private int triageVal;      // Priority valuse 1 is highest as number grows Priotity decreases

    public Patient(String fullName, String procedure, int triageVal)
    {
        this.fullName = fullName;
        this.procedure = procedure;
        this.triageVal = triageVal;
    }

    @Override
    public int compareTo(Object o)
    {
       Patient p = (Patient) o;
 /*      if(this.triageVal == ((Patient) o).triageVal)
           return 0;
       else if(this.triageVal > ((Patient) o).triageVal)
           return 1;
       else
   */    //    return -1;
        return this.triageVal - p.triageVal;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fullName='" + fullName + '\'' +
                ", procedure=" + procedure +
                ", triageVal=" + triageVal +
                '}';
    }
}
