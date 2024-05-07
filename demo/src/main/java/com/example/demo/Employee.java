package com.example.demo;

import org.springframework.cglib.reflect.MethodDelegate.Generator;
import org.springframework.stereotype.Indexed;

@Entity
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Object salart;
    private String department;
    private Integer salary;
    public Employee(){

    }
    public Employee(Integer id,String firstName,String lastName,String department,Integer salary){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.salary=salary;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public Object getSalart() {
        return salart;
    }
    public void setSalart(Object salart) {
        this.salart = salart;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee[id="+id+",firstName="+firstName+",lastName+"+ lastName+",department="+department+",salary="+salary+"]";

    }
    
}
