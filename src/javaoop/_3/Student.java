package javaoop._3;

public class Student {

        private String name ;

        private String surname ;

        private int age ;

        private String course ;

        private String typeOfCourse ;

        public int nameCounter ;
        Student(String name, String surname, int age, String course, String typeOfCourse){
            this.name = name ;
            this.surname = surname ;
            this.age = age ;
            this.course = course ;
            this.typeOfCourse = typeOfCourse ;
        }

        public Student(){

        }

        public String getName(){
            nameCounter ++ ;
            return name ;
        }
        public String getSurname(){
            return surname ;
        }
        public int getAge(){
            return age ;
        }
        public String getCourse(){
            return course ;
        }
        public String getTypeOfCourse(){
            return typeOfCourse ;
        }



        public void setName (String name){
            this.name = name ;
        }
        public void setSurname (String surname){
            this.surname = surname ;
        }
        public void setAge (int age){
            if (age < 20) {
                System.out.println("Non idoneo");
            } else {
                this.age = age; }
        }
        public void setCourse (String course){
            this.course = course ;
        }
        public void setTypeOfCourse (String typeOfCourse){
            this.typeOfCourse = typeOfCourse;
        }

    }

