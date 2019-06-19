package quartz.org.study;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Author: chenyao
 * Date: 2019/4/3 18:06
 * Description:
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String name = context.getTrigger().getJobKey().getName();
        System.out.println(name+new Date());
    }
}
