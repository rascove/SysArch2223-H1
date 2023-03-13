package com.attendanceSystem.model

class Attendance
{
    String toString()
    {
        return enrolment ? enrolment.toString()
            : ""
    }

    static constraints =
    {
        schedule()
        enrolment()
    }

    static belongsTo = [schedule: Schedule, enrolment: Enrolment]
}