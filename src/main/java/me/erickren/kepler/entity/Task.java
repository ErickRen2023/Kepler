package me.erickren.kepler.entity;

import java.util.Arrays;
import java.util.List;

/**
 * DateTime: 2024/09/10 - 21:41
 *
 * @author ErickRen
 */
public abstract class Task<P, R> {

    protected List<Task> nextTasks;

    /**
     * The status will only take effect in this Task.
     * Hint: NOT GRAPH.
     */
    protected TaskStatus status;

    /**
     * The method will run before the run method.
     *
     * @param dependencies the dependency tasks.
     */
    abstract void preRun(List<Task> dependencies);

    abstract R run(P params, List<Task> dependencies);

    abstract R fallback();

    abstract R callback();

    public void next(Task... tasks) {
        nextTasks.addAll(Arrays.asList(tasks));
    }
}
