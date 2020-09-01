package session12;

/**
 *
 * @author dkruger
 */
public class TaskPool { // Apache Threadpool    Readers/Writers
    private ArrayList<Job> jobs;
    
    public synchronized void addJob(Job j) { jobs.add(j); }
    public synchronized void doJob() {
       // take a job off the list   
    }
}
