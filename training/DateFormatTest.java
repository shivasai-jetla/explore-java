package training;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {

        public static void main(String[] args){

            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy  hh:mm:ss");

            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

            String formattedDate = dt.format(formatter);
            System.out.println("formatted date&time: "+formattedDate);
        }
}
