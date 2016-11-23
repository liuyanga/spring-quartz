package com.sj.quartz;
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
import org.springframework.scheduling.quartz.QuartzJobBean;  
  
/** 
 * @author Administrator 
 * @date 2016��11��23�� 
 */  
public class ExampleJob extends QuartzJobBean {  
      
    private int timeout;  
  
    @Override  
    protected void executeInternal(JobExecutionContext context)  
            throws JobExecutionException {  
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "ִ��ExampleJob�Ķ�ʱ����");  
    }  
      
    public int getTimeout() {  
        return timeout;  
    }  
  
    public void setTimeout(int timeout) {  
        this.timeout = timeout;  
    }  
  
}  