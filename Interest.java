
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Interest
{
    double principal,rate,time;
    double simple_interest,compound_interest;
    void readDetails()
    {
        Scanner sc=new Scanner(System.in);
        principal=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();
    }
    void compute()
    {
        simple_interest=(principal*rate*time)/100;
        compound_interest=principal*Math.pow((1+rate),time);
    }
    private static final Logger LOGGER=LogManager.getLogger(Interest.class);
    
    public static void main(String[] args)
    {
     LOGGER.info("principal");
     LOGGER.info("rate");
     LOGGER.info("time");
     LOGGER.info("simple_interest");
     LOGGER.info("compound_interest");
     }
}


