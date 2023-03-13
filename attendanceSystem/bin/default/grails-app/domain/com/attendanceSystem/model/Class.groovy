package com.attendanceSystem.model

class Class
{
    String location

    String toString()
    {
        return (module ? module.toString()
            + " (": "") + (lecturer ?
            lecturer.toString() + ")" : "")
    }

    static constraints =
    {
        location(size: 5..30)
        lecturer()
        module()
    }

    static belongsTo = [lecturer: Lecturer,
        module: Module]

    static hasMany = [enrolments: Enrolment,
        schedules: Schedule]
}