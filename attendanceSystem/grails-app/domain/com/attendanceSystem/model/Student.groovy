package com.attendanceSystem.model

class Student
{
    String studentID
    String name
    String course

    String toString()
    {
        return name
    }

    static constraints =
    {
        studentID unique: true, size: 5..10
        name size: 5..100
        course size: 5..100
    }

    static hasMany = [enrolments: Enrolment]
}