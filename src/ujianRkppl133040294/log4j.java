package ujianRkppl133040294;

import org.apache.log4j.Logger;;

public class log4j {

	public static void main(String[] args){
		   
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama("hendar");
			
		Logger log = Logger.getLogger(mahasiswa.getNama());
	    log.debug("Hello this is a debug message");
	    log.info("Hello this is an info message");
	    
   }

}
