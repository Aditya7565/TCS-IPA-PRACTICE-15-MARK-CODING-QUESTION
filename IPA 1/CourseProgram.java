import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }
}

class CourseProgram {

    public static int findAvgOfQuizByAdmin(Course[] courses, String admin) {

        int sum = 0;
        int count = 0;

        for (Course c : courses) {
            if (c.getCourseAdmin().equalsIgnoreCase(admin)) {
                sum += c.getQuiz();
                count++;
            }
        }

        if (count > 0)
            return sum / count;

        return 0;
    }

    public static Course[] sortCourseByHandsOn(Course[] courses, int value) {

        int count = 0;

        for (Course c : courses) {
            if (c.getHandson() < value)
                count++;
        }

        if (count == 0)
            return null;

        Course[] result = new Course[count];

        int index = 0;

        for (Course c : courses) {
            if (c.getHandson() < value)
                result[index++] = c;
        }

        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].getHandson() > result[j].getHandson()) {
                    Course temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course[] course = new Course[4];

        for (int i = 0; i < 4; i++) {

            int id = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            String admin = sc.nextLine();

            int quiz = sc.nextInt();
            int handson = sc.nextInt();
            sc.nextLine();

            course[i] = new Course(id, name, admin, quiz, handson);
        }

        String adminName = sc.nextLine();
        int handsonValue = sc.nextInt();

        int avg = findAvgOfQuizByAdmin(course, adminName);

        if (avg != 0)
            System.out.println(avg);
        else
            System.out.println("No Course found");

        Course[] result = sortCourseByHandsOn(course, handsonValue);

        if (result != null) {
            for (Course c : result)
                System.out.println(c.getCourseName());
        } else {
            System.out.println("No Course found with mentioned attributes.");
        }
    }
}