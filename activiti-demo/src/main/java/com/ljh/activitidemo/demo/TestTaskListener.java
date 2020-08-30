package com.ljh.activitidemo.demo;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateHelper;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class TestTaskListener implements TaskListener {
    private Expression expression;
    private TaskService taskService;
    private HistoryService historyService;

    @Override
    public void notify(DelegateTask delegateTask) {
      String taskId =  delegateTask.getId();
     String processInstanceId =delegateTask.getProcessInstanceId();
      List<Comment> commentList=taskService.getProcessInstanceComments(processInstanceId,"123");
        for (Comment comment : commentList) {
        }

    }
}
