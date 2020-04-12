import java.util.*;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> labPoints = new ArrayList<Integer>();
    
    //TODO constructor

    public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }


    //TODO seters & getters


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public double getAverage() {
        //TODO
        int sum=0;
        for (int i=0; i<this.labPoints.size(); i++){
            sum += this.labPoints.get(i);
        }
        return sum / this.labPoints.size();
    }

    public boolean hasSignature() {
        //TODO
        if(this.labPoints.size() > 8){
            return true;
        }
        else{
            return false;
        }
    }
}

class Course {
    List<Student> listStudents = new ArrayList<>();

    public Course(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public int prosekNaPoeni(int i){
        return (int) this.listStudents.get(i).getAverage();
    }

    public int brojNaPotpisi(){
        int count = 0;
        for(int i=0; i<listStudents.size(); i++){
            if(listStudents.get(i).hasSignature()){
                count++;
            }
        }
        return count;
    }
}