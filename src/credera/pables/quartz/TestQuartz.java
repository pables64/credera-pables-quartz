package credera.pables.quartz;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestQuartz implements Job{
    private Logger logger = LoggerFactory.getLogger(TestQuartz.class);
    public void printMe() {
        logger.info("TestQuartz.execute()");
        System.out.println("Sysout: TestQuartz.execute()");
    }   

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        printMe();
    }
}
