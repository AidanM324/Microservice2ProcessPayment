package ie.atu.microservice2processpayment;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    public class Person {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Person(String name, int age, String email, String title, String employeeId, String position, String department) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.title = title;
            this.employeeId = employeeId;
            this.position = position;
            this.department = department;
        }

        @NotBlank
        private String name;

        @Min(18)
        private int age;

        @Email
        private String email;

        @NotBlank
        private String title;

        @NotBlank
        private String employeeId;

        @NotBlank
        private String position;

        @NotBlank
        private String department;

    }