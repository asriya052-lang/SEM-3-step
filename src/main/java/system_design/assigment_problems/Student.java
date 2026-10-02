package system_design.assigment_problems;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String department;

    private List<NotificationChannel> channels;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
        this.channels = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public List<NotificationChannel> getChannels() {
        return channels;
    }
}