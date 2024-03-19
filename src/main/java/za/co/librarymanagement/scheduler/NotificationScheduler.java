package za.co.librarymanagement.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import za.co.librarymanagement.service.LibraryManagementServiceImpl;

@Component
public class NotificationScheduler {
		
	@Autowired
	private LibraryManagementServiceImpl librarryManagementService;
	
	
	/****
	 *  Generating Overdue Notices 
	 *  */
	@Scheduled(cron = "0 0 19 * * *")
	public void generateOverdueNotice() {
		librarryManagementService.generateOverdueNotice();
		
	}

}
