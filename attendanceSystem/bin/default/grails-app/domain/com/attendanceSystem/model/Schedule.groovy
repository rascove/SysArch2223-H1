package com.attendanceSystem.model

class Schedule
{
    Date dateTime
    int duration

    String toString()
    {
        return dateTime
    }
    
    static constraints =
    {
        class_()
        dateTime()
        duration min: 1
    }

    static belongsTo = [class_: com.attendanceSystem.model.Class]

    static hasMany = [attendances: Attendance]
}