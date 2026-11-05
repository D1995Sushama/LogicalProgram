package LogicalCoding;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ex10_DateTime_getCurrentDate {
    static void main(String[] args) {
        //System.out.println(LocalDateTime.now());//date&time
        Date date=new Date();// day(monday),date(oct 26),time(23:14:26)
        //System.out.println(date);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy,hh:mm:ss");
        System.out.println(dateFormat.format(date));
    }
}
