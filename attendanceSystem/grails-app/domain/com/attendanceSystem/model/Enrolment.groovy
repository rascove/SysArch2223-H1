package com.attendanceSystem.model

class Enrolment
{
    com.attendanceSystem.model.Class clazz
    Student student

    String toString()
    {
        return student ? student.name : ""
    }

    static constraints = {}

    static hasMany = [attendances: Attendance]
}