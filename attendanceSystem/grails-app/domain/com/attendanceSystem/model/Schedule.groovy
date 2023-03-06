package com.attendanceSystem.model

class Schedule
{
    com.attendanceSystem.model.Class clazz
    Date dateTime

    String toString()
    {
        return dateTime
    }
    
    static constraints = {}

    static hasMany = [attendances: Attendance]
}