package com.attendanceSystem.model

class Enrolment
{
    String toString()
    {
        return student ? student.toString() : ""
    }

    static constraints =
    {
        class_()
        student()
    }

    static belongsTo = [class_: Class,
        student: Student]
}