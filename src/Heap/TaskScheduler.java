package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskScheduler {

    public void bruteForce(char[] tasks,int n){
        HashMap<Character,Integer> tasksFreq=new HashMap<>();
        for(int i=0; i<tasks.length; i++){
            tasksFreq.put(tasks[i], tasksFreq.getOrDefault(tasks[i],0)+1);
        }
        List<Map.Entry<Character,Integer>> taskList=new ArrayList<>(tasksFreq.entrySet());
        taskList.sort((a,b)->b.getValue()-a.getValue());

        HashMap<Character,Integer> lastTask=new HashMap<>();
        int  time=0;
        while(!taskList.isEmpty()){
            boolean taskSelected=false;
            for(int i=0; i<taskList.size(); i++){
                char task=taskList.get(i).getKey();
                int freq=taskList.get(i).getValue();

                if(!lastTask.containsKey(task)||time-lastTask.get(task)>n){
                    taskSelected=true;
                    lastTask.put(task,time);
                    taskList.get(i).setValue(freq-1);

                    if(taskList.get(i).getValue()==0){
                        taskList.remove(i);
                    }
                    break;
                }
            }
            if(!taskSelected){
                time++;
            }else{
                time++;
            }
        }
        System.out.println(time);
    }
    public static void main(String[] args){
        char[] arr={'A','A','A','B','B','B'};
        TaskScheduler t=new TaskScheduler();
        t.bruteForce(arr,2);
    }
}
