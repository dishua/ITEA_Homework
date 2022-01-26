package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;
import java.util.Date;

public class RecordBook {

    private static int number = 1;
    private Session currentSession;

    ArrayList<Session> recordBook = new ArrayList<>();

    private class Session {
        private final int sessionNumber;

        private abstract class Test {
            private final String testName;
            private final Date date;
            private final int mark;

            protected Test(String testName, int mark) {
                this.testName = testName;
                this.date = new Date();
                this.mark = mark;
            }

            public abstract String toString();
        }

        private class Exam extends Test {

            protected Exam(String testName, int mark) {
                super(testName, mark);
            }

            @Override
            public String toString() {
                return "Exam{" +
                        "testName='" + super.testName + '\'' +
                        ", date=" + super.date +
                        ", mark=" + super.mark +
                        '}';
            }
        }

        private class Credit extends Test {

            protected Credit(String testName, int mark) {
                super(testName, mark);
            }

            @Override
            public String toString() {
                return "Credit{" +
                        "testName='" + super.testName + '\'' +
                        ", date=" + super.date +
                        ", mark=" + super.mark +
                        '}';
            }
        }

        ArrayList<Test> tests = new ArrayList<>();

        public Session(int sessionNumber) {
            this.sessionNumber = sessionNumber;
        }

        public void passExam(String name, int mark) {
            Exam exam = new Exam(name, mark);
            tests.add(exam);
        }

        public void passCredit(String name, int mark) {
            Credit credit = new Credit(name, mark);
            tests.add(credit);
        }

        @Override
        public String toString() {
            String result = "Session number:" + sessionNumber + "\n";
            for (Test test : tests) {
                result += test.toString();
            }
            return result + "\n";
        }
    }

    public void createNewSession() {
        this.currentSession = new Session(number++);
        recordBook.add(currentSession);
    }

    public void passSessionExam(String name, int mark) {
        currentSession.passExam(name, mark);
    }

    public void passSessionCredit(String name, int mark) {
        currentSession.passCredit(name, mark);
    }

    @Override
    public String toString() {
        String result = "";
        for (Session session : recordBook) {
            result += session.toString();
        }
        return result;
    }

}

class RecordBookRunner {

    public static void main(String[] args) {
        RecordBook recordBook = new RecordBook();

        recordBook.createNewSession();
        recordBook.passSessionExam("History", 5);
        recordBook.passSessionExam("Ukr", 4);
        recordBook.passSessionCredit("Phys", 2);

        recordBook.createNewSession();
        recordBook.passSessionExam("Sport", 5);
        recordBook.passSessionExam("Comp.Science", 4);
        recordBook.passSessionCredit("Phys", 2);


        System.out.println(recordBook);


    }

}
