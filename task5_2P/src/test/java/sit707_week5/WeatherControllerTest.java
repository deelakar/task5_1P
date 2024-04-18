package sit707_week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;


public class WeatherControllerTest {
	
	
	private WeatherController wController;

    @Before
    public void setUp() {
        // Arrange: Initialize WeatherController
        wController = WeatherController.getInstance();
    }

    @After
    public void tearDown() {
        // Act: Shutdown WeatherController
        wController.close();
    }

	@Test
	public void testStudentIdentity() {
		String studentId = "S223693522";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Deelaka Rathnayake";
		Assert.assertNotNull("Student name is null", studentName);
	}

	
    @Test
    public void testTemperatureMin() {
        // Act: Retrieve minimum temperature
        double minTemperature = wController.getTemperatureMinFromCache();

        // Assert: Verify minimum temperature
        assertEquals(minTemperature, wController.getTemperatureMinFromCache(), 0);
    }
    
    @Test
    public void testTemperatureMax() {
        // Act: Retrieve maximum temperature
        double maxTemperature = wController.getTemperatureMaxFromCache();

        // Assert: Verify maximum temperature
        assertEquals(maxTemperature, wController.getTemperatureMaxFromCache(), 0);
    }

    @Test
    public void testTemperatureAverage() {
        // Act: Retrieve average temperature
        double avgTemperature = wController.getTemperatureAverageFromCache();

        // Assert: Verify average temperature
        assertEquals(avgTemperature, wController.getTemperatureAverageFromCache(), 0);
    }
    
//	@Test
//	public void testTemperatureMin() {
//		System.out.println("+++ testTemperatureMin +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		// Retrieve all the hours temperatures recorded as for today
//		int nHours = wController.getTotalHours();
//		double minTemperature = 1000;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			if (minTemperature > temperatureVal) {
//				minTemperature = temperatureVal;
//			}
//		}
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);
//		
//		// Shutdown controller
//		wController.close();		
//	}
    
    
//	@Test
//	public void testTemperatureMax() {
//		System.out.println("+++ testTemperatureMax +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		// Retrieve all the hours temperatures recorded as for today
//		int nHours = wController.getTotalHours();
//		double maxTemperature = -1;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			if (maxTemperature < temperatureVal) {
//				maxTemperature = temperatureVal;
//			}
//		}
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);
//		
//		// Shutdown controller
//		wController.close();
//	}
    
   
//	@Test
//	public void testTemperatureAverage() {
//		System.out.println("+++ testTemperatureAverage +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		// Retrieve all the hours temperatures recorded as for today
//		int nHours = wController.getTotalHours();
//		double sumTemp = 0;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			sumTemp += temperatureVal;
//		}
//		double averageTemp = sumTemp / nHours;
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);
//		
//		// Shutdown controller
//		wController.close();
//	}
    
 

	
	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
