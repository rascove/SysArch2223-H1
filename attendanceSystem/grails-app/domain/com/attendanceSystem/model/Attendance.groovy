package com.attendanceSystem.model

class Attendance
{
    Schedule schedule
    Enrolment enrolment

    String toString()
    {
        return enrolment ? enrolment.toString()
            : ""
    }

    static constraints = {}

    static belongsTo = [schedule: Schedule,
        enrolment: Enrolment]
}