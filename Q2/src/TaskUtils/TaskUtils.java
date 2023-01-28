package TaskUtils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


import com.app.task.StatusType;
import com.app.task.Task;

import exception.TaskException;

public class TaskUtils {
	public static Map<Integer, Task> populatetask()
	{
		Task t1=new Task("Yoga","Doing Yoga",LocalDate.parse("2022-11-22"));
		Task t2=new Task("Dinner","Taking lunch",LocalDate.parse("2021-12-14"));
		Task t3=new Task("Washing","washing clothes",LocalDate.parse("2024-06-04"));
		Task t4=new Task("Cleaning","clean room",LocalDate.parse("2022-07-03"));
		Task t5=new Task("Meditation","Doing Meditation",LocalDate.parse("2022-11-29"));
		
		Map<Integer,Task> t=new HashMap<>();
		System.out.println(t.put(t1.getTaskId(), t1));
		System.out.println(t.put(t2.getTaskId(), t2));
		System.out.println(t.put(t3.getTaskId(), t3));
		System.out.println(t.put(t4.getTaskId(), t4));
		System.out.println(t.put(t5.getTaskId(), t5));
		
		return t;
	
	}
	
	public static int validateTaskId(int Id,Map<Integer, Task> t) throws TaskException
	{
		if(t.containsKey(Id))
			return Id;
		else
			throw new TaskException("Invalid Id!!!");
	}
	
	public static StatusType validateAcctType(String type) {
		return StatusType.valueOf(type.toUpperCase());
	}
	
}
