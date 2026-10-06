package com.main;
import java.util.List;
import java.util.Scanner;

import com.dao.program1;
import com.module.student;


public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        program1 p = new program1();

        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student By ID");
            System.out.println("4. Update Student Course");
            System.out.println("5. Update Student Mobile Number");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                student s = new student();

                System.out.println("Enter Student ID:");
                s.setStudent_id(sc.nextInt());

                sc.nextLine();

                System.out.println("Enter Student Name:");
                s.setStudent_name(sc.nextLine());

                System.out.println("Enter Student Age:");
                s.setAge(sc.nextInt());

                sc.nextLine();

                System.out.println("Enter Student Course:");
                s.setCourse(sc.nextLine());

                System.out.println("Enter Student City:");
                s.setCity(sc.nextLine());

                System.out.println("Enter Student Mobile:");
                s.setMobile(sc.nextLine());

                if (p.addStudent(s))
                    System.out.println("...Student Inserted Successfully...");
                else
                    System.out.println("...Insertion Failed...");

                break;

            case 2:

                List<student> list = p.getStudent();

                for (student st : list) {

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Student ID     : " + st.getStudent_id());
                    System.out.println("Student Name   : " + st.getStudent_name());
                    System.out.println("Student Age    : " + st.getAge());
                    System.out.println("Student Course : " + st.getCourse());
                    System.out.println("Student City   : " + st.getCity());
                    System.out.println("Student Mobile : " + st.getMobile());
                }

                break;

            case 3:

                System.out.println("Enter Student ID:");
                int id = sc.nextInt();

                student st = p.getStudent(id);

                if (st != null) {

                    System.out.println("Student ID     : " + st.getStudent_id());
                    System.out.println("Student Name   : " + st.getStudent_name());
                    System.out.println("Student Age    : " + st.getAge());
                    System.out.println("Student Course : " + st.getCourse());
                    System.out.println("Student City   : " + st.getCity());
                    System.out.println("Student Mobile : " + st.getMobile());

                } else {

                    System.out.println("...Student Not Found....");

                }

                break;

            case 4:

                System.out.println("Enter Student ID:");
                int Student_id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter New Course:");
                String course = sc.nextLine();

                boolean result = p.updateCourse(Student_id, course);

                if(result) {
                    System.out.println("...Course Updated Successfully...");
                } else {
                    System.out.println("...Student ID Not Found...");
                }

                break;
             
            case 5:

               System.out.println("Enter the Student ID");
               int stu_id=sc.nextInt();
               
               sc.nextLine();
               
               System.out.println("Enter the New Mobile Number");
               String mobile=sc.nextLine();
               
               boolean result1=p.update_mobileNo(stu_id,mobile);
               
               if(result1)
               {
            	   System.out.println("...Mobile Updated Successfully...");
            	   
               }
               else
               {
            	   System.out.println("...Student ID not Found...");
               }

                break;

            case 6:

                System.out.println("Enter the Student ID");
                int stud_id=sc.nextInt();
                
                boolean result2=p.delete_student(stud_id);
                if(result2)
                {
                	System.out.println("...Student Record Deleted...");
                	
                }
                else
                {
                	System.out.println("...Student Record not Found...");
                }

                break;

            case 7:

                System.out.println("...Thank You...");
                sc.close();
                System.exit(0);

                break;

            default:

                System.out.println("...Invalid Choice...");

            }

        }

    }

}