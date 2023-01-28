package Tester;

import static TaskUtils.TaskUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.app.task.StatusType;
import com.app.task.StatusType.*;
import com.app.task.Task;

public class TestTask {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Task> TaskManager = populatetask();
			boolean exit = false;
			System.out.println("1.Add task \n" + "2.Delete a task\n" + "3.Update task status\n"
					+ "4.Display all pending tasks\n" + "5.Display all pending tasks for today\n"
					+ "6.Display all tasks sorted by taskDate\n" + "7.Display all\n" + "10.exit");

			while (!exit) {
				try {
					System.out.println("enter choice");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the taskname,description,date");
						String s = sc.next();
						sc.nextLine();
						String des = sc.nextLine();
						//sc.nextLine();
						String date = sc.next();
						Task t = new Task(s, des, LocalDate.parse(date));
						TaskManager.put(t.getTaskId(), t);
						System.out.println("Task Added!!");
						break;
					case 2:
						System.out.println("enter the TaskId");
						int id = sc.nextInt();
						validateTaskId(id, TaskManager);
						for (Task task : TaskManager.values()) {
							
							if(task.getTaskId()==id)
									task.setActive(false);
						}
						System.out.println("Task deleted");
						break;

					case 3:
						System.out.println("enter the TaskId");
						id = sc.nextInt();
						validateTaskId(id, TaskManager);
						System.out.println("Enter the status to be updated");
						StatusType st = validateAcctType(sc.next());
						for (Task t1 : TaskManager.values()) {
							
							if(t1.getTaskId()==id)
									t1.setStatus(st);
						}
						System.out.println("Status updated successfully");
						break;

					case 4:
						for (Task t1 : TaskManager.values()) {
							if (t1.getStatus() == StatusType.PENDING)
								
							System.out.println(t1);
						}
						break;
					case 5:
						for (Task t1 : TaskManager.values()) {
							if ((t1.isActive() == true) && (LocalDate.now().equals(t1.getTaskDate())))
								System.out.println(t1);
						}
						break;

					case 6:
						System.out.println("Sort by date");
						ArrayList<Task> sortbydate = new ArrayList<>(TaskManager.values());
						Collections.sort(sortbydate, new Comparator<Task>() {

							@Override
							public int compare(Task o1, Task o2) {

								return o1.getTaskDate().compareTo(o2.getTaskDate());
							}

						});
						for(Task t2:sortbydate)
						{
							System.out.println(t2);
						}
						break;

					case 7:
						for (Task task : TaskManager.values()) {
							System.out.println(task);
						}
						break;

					case 10:
						exit = true;
						break;
					}// switch
				} catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

}// class
