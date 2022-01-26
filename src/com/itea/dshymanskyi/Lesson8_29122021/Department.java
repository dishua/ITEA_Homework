package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;

public class Department {
    private final String departmentName;

    private class Position {
        private final String positionName;

        ArrayList<String> workers = new ArrayList<>();

        private Position(String positionName) {
            this.positionName = positionName;
        }

        private void addWorker(String workerName) {
            this.workers.add(workerName);
        }

        @Override
        public String toString() {
            String result = "Position: " + positionName + "\n";
            for (String worker : workers) {
                result += worker + "\n";
            }
            return result;
        }

    }

    ArrayList<Position> positions = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addPosition(String positionName1) {
        Position position = new Position(positionName1);
        positions.add(position);
    }

    public Position getPosition(String positionName) {
        for (Position currentPosition : positions) {
            if (currentPosition.positionName.equals(positionName)) {
                return currentPosition;
            }
        }
        return null;
    }

    public void addWorkerToPosition(String positionName, String wordkerName) {
        Position currentPosition;
        currentPosition = getPosition(positionName);
        currentPosition.addWorker(wordkerName);
    }



    @Override
    public String toString() {
        String result = "";
        for (Position position : positions) {
            result += position.toString() + " ";
        }
        return result;
    }
}

class DepartmentRunner {
    public static void main(String[] args) {
        Department hr = new Department("HR");

        hr.addPosition("Head of HR");
        hr.addPosition("First HR");
        hr.addPosition("Second HR");

        hr.getPosition("Second HR");

        hr.addWorkerToPosition("Head of HR", "Vasya Pupkin");
        hr.addWorkerToPosition("Head of HR", "Dima Stepkin");

        hr.addWorkerToPosition("First HR", "Petro");

        hr.addWorkerToPosition("Second HR", "Bohdan");


        System.out.println(hr);
    }
}
