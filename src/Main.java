import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args)
    {
       PriorityQueue<Patient> q = new PriorityQueue<>();
	   // Create a few patients with different priority and add them the Queue

        q.offer(new Patient("Bilbo Baggins", "Emergency Ringectormy", 1));
        q.add(new Patient("Frodo Baggins", "Attitude Ajustment", 5));
        q.add(new Patient("Sam Gamgee", "Heart Treatment", 2));
        q.add(new Patient("Aragorn ", "Hangnail treatment", 3));
        q.offer(new Patient("Pippin", "Height Adjustment", 4));

        // Process all of the patients

        while(!q.isEmpty())
        {
            Patient p = q.poll();

            System.out.println(p);
        }

    }
}
