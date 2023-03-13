package com.attendanceSystem.model

class Lecturer
{
    String staffID
    String name

    String toString()
    {
        return name
    }

    static constraints =
    {
        staffID(unique: true, size: 5..10)
        name(size: 5..100)
        classes()
    }

    static hasMany = [classes: Class]
}