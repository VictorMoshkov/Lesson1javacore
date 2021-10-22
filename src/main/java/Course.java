//Добавил препятствие бег
public class Course {
    int[] obstacles;

    public Course(int obstacle1, int obstacle2, int obstacle3,int obstacle4,int obstacle5,int obstacle6) {
        obstacles = new int[]{obstacle1, obstacle2, obstacle3,obstacle4,obstacle5,obstacle6};
    }

    public void finishCourse(Team team) {
        for (Member member : team.members) {
            for (int obstacle : obstacles) {
                if (member.jumpHeight >= obstacle) {
                    System.out.println(member.name + " finished");
                    member.isFinished = true;
                } else {
                    member.isFinished = false;
                }
            }
        }
    }
            public void finishCourse2(Team team) {
            for (Member member : team.members) {
                for (int obstacle : obstacles) {
                    if (member.runForward >= obstacle) {
                        System.out.println(member.name + " finished");
                        member.isFinished = true;
                    } else {
                        member.isFinished = false;
                    }
                }
            }
        }
    }

