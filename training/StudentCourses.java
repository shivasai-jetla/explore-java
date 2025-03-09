package training;

import java.util.ArrayList;

public class StudentCourses {


        private String name;
        private String grade;
        private ArrayList<String> courses;

        public StudentCourses(String name, String grade) {
            this.name = name;
            this.grade = grade;
            this.courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }



        public String getGrade() {
            return grade;
        }

       

        public void addCourse(String course) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println(course + " added to " + name + " course list.");
            } else {
                System.out.println(course + " is already in the course list.");
            }
        }

        public void removeCourse(String course) {
            if (courses.contains(course)) {
                courses.remove(course);
                System.out.println(course + " removed from " + name + " course list.");
            } else {
                System.out.println(course + " is not in the course list.");
            }
        }

        public void displayCourses() {
            if (courses.isEmpty()) {
                System.out.println(name + " is not enrolled in any courses.");
            } else {
                System.out.println(name + "'s courses:");
                for (String course : courses) {
                    System.out.println(course);
                }
            }
        }

        public static void main(String[] args) {
            StudentCourses student1 = new StudentCourses("Umamaheswarrao", "B");
            StudentCourses student2 = new StudentCourses("rao", "A");

            student1.addCourse("java");
            student1.addCourse("phython");
            student1.addCourse("javascript");
            student1.addCourse("Data scince");

            student1.removeCourse("javascript");

            student1.displayCourses();

            student2.addCourse("css");
            student2.addCourse("Plumbing");
        }
}

