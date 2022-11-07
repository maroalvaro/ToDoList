package com.example.test;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks = new ArrayList<>();

    public static TaskStorage getInstance() {
        return taskStorage;
    }

    private TaskStorage () {
        for (int i = 0; i < 100; ++i) {
            Task task = new Task();
            task.setName(String.format("Zadanie #%d", i));
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        for (Task task : tasks) {
            Log.d("UUID", String.format("%s, %s", id.toString(), task.getId().toString()));
            if (id.equals(task.getId())) {
                return task;
            }
        }

        return null;
    }
}
