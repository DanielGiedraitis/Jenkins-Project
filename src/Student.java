public class Student {

    public enum AttendanceGrade {
        ABSENT, VERY_POOR, AVERAGE, GOOD, VERY_GOOD
    }

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) {
            throw new IllegalArgumentException("Attendance should be between 0 and 100");
        }
        if (attendance == 0) {
            return AttendanceGrade.ABSENT;
        } else if (attendance < 30) {
            return AttendanceGrade.VERY_POOR;
        } else if (attendance < 70) {
            return AttendanceGrade.AVERAGE;
        } else if (attendance < 90) {
            return AttendanceGrade.GOOD;
        } else {
            return AttendanceGrade.VERY_GOOD;
        }
    }
}

