package com.attendanceSystem.model

class Class
{
    Lecturer lecturer
    Module module
    String className
    String location

    String toString()
    {
        return className
    }

    static constraints =
    {
        className unique: true, size: 5..50
        location size: 5..30
    }
}