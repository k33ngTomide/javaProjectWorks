package tdd;

public class WristWatch {

    private int seconds;
    private int minutes;
    private int hours;
    private int time;

//    public void setTime(int hours, int minutes, int seconds) {
//
//        if (hours > 0 && hours < 24) {
//            this.hours = hours + minutes % 60;
//        } else {
//            this.hours = 0;
//        }
//        if (minutes > 0) {
//            if (minutes < 60) {
//                this.minutes = minutes;
//            }
//            if (minutes >= 60) {
//                this.hours = hours + (minutes / 60);
//                this.minutes = minutes % 60;
//            }
//
//        }
//        if (seconds > 0) {
//            if (seconds >= 3600) {
//                this.hours = seconds / 3600;
//                if (seconds % 3600 > 60)
//                    this.minutes = (seconds % 3600) % 60;
//                else this.minutes = minutes;
//                this.seconds = seconds % 3600;
//            }
//
//            if (seconds > 60 && seconds < 3600) {
//                this.hours = hours;
//                this.minutes = (seconds / 60) + (minutes % 60);
//                this.seconds = seconds % 60;
//            }
//            if (seconds < 60 ){
//                this.seconds = seconds;
//            }
//        }
//    }

    public int getTime() {
        return time;
    }
    public int getSeconds() {
        return seconds;
    }
    public int getHours() {
        return hours;
    }
    public void convertMinutes(int minutes) {
        if (minutes > 0) {
            if (minutes < 60) this.minutes = minutes;
            else if (minutes > 60) {
                this.hours = minutes / 60;
                this.minutes = minutes % 60;
            }
        }
    }
    public int getMinutes() {
        return minutes;
    }

    public void convertSeconds(int seconds) {
        if (seconds > 0) {
            if (seconds >= 3600) {
                this.hours = seconds / 3600;
                if (seconds % 3600 > 60)
                    this.minutes = (seconds % 3600) % 60;
                this.seconds = seconds % 3600;
            }

            if (seconds > 60 && seconds < 3600) {
                this.hours = 0;
                this.minutes = (seconds / 60);
                this.seconds = seconds % 60;
            }
            if (seconds < 60 ){
                this.seconds = seconds;
            }

        }

    }

    public void convertHours(int hours) {
        if (hours > 0 && hours < 24) {
            this.hours = hours + minutes % 60;
        } else {
            this.hours = 0;
        }
    }
}
