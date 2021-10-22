public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Kolya",100,300);
        Member member2 = new Member("Oly",150,500);
        Member member3 = new Member("Sasha",160,550);
        Member member4 = new Member("Timyr",165,450);
        Team team = new Team("Торпедо", member1, member2, member3, member4);
        Course course = new Course(110,120,130,500,600,300);

        course.finishCourse(team);
        course.finishCourse2(team);
        team.printInfoAboutMembers();
        System.out.println();
        team.printInfoAboutMembersWichFinishedCourse();
    }
}
