package com.oocl;

public class Student extends Person {

    private Klass cls;

    @Override
    public Klass getCls() {
        return cls;
    }

    @Override
    public void setCls(Klass cls) {
        this.cls = cls;
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. " +
                "I am %s years old. " +
                "I am a student of class %s. " +
                "Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getCls().getName());
    };

    public String welcomeOtherStu(Student stu){
        return this.introduce() + String.format(" Welcome %s join Klass %s.", stu.getName(), this.cls.getName());
    }

    public String stuLeaderIntrod(){
        return this.introduce() + String.format(" %s is the leader of Class %s.",
                this.getCls()
                        .getStudentLeader()
                        .getName(),
                this.getCls().getName());
    }

    public void joinClass(Klass cls){
        cls.addStudentToClass(this);
    }

}
