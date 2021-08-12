public class ProjectTest {
    public static void main(String[] args) {
        Project proj1 = new Project();
        System.out.println(proj1.getName());
        System.out.println(proj1.getDesc());
        System.out.println(proj1.elevatorPitch());

        Project proj2 = new Project("Zero");
        System.out.println(proj2.getName());
        System.out.println(proj2.getDesc());
        System.out.println(proj2.elevatorPitch());

        Project proj3 = new Project("007", "be a cool guy");
        System.out.println(proj3.elevatorPitch());
        proj3.setName("MI");
        proj3.setDesc("Another way to be a cool guy");
        System.out.println(proj3.getName());
        System.out.println(proj3.getDesc());

    }


    
}
