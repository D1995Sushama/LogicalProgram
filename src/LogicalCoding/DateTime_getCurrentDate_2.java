package LogicalCoding;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTime_getCurrentDate_2
{
    static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat date=new SimpleDateFormat("yyyy-mm-dd hh:hh");
        System.out.println(date.format(d));
    }
}
