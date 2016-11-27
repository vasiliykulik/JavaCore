package src.m10_exception;

/**
 * Created by Стрела on 23.10.2016.
 */
public class Homework {
    int Assesment;
    String Lastname;

    public static void main(String[] args) {
        Homework hw = new Homework();
        try {
            int b = hw.getAssesment() / 0;
        } catch (Throwable t) {
            System.err.println("Throwable t" + t);
        } finally {
            System.out.println(hw.toString());

        }
    }

    public int getAssesment() {
        return Assesment;
    }

    public void setAssesment(int assesment) {
        Assesment = assesment;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Homework{");
        sb.append("Assesment=").append(Assesment);
        sb.append(", Lastname='").append(Lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
