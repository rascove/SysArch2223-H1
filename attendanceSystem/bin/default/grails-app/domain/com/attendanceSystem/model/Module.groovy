package com.attendanceSystem.model

class Module
{
    String moduleCode
    String name
    int credit

    String toString()
    {
        return moduleCode + ' - ' + name
    }

    static constraints =
    {
        moduleCode(unique: true, size: 5..10)
        name(size: 10..100)
        credit(min: 15, max: 60)
    }
}