import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Meeting{
    public int pos;
    public int startTime;
    public int endTime;
    public Meeting(int pos,int startTime,int endTime){
        this.pos=pos;
        this.startTime=startTime;
        this.endTime=endTime;
    }
}
class CompareMeeting implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if(o1.endTime<o2.endTime){
            return -1;
        }else if(o1.endTime>o2.endTime){
            return 1;
        }else if(o1.pos<o2.pos){
            return -1;
        }
            return 1;


    }
}
public class NMeetingInOneRoom {

    public void numberOfMeeting(int[] start,int[] end){
        ArrayList<Meeting> l=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<start.length; i++){
            l.add(new Meeting(i+1,start[i],end[i]));
        }
        CompareMeeting cm=new CompareMeeting();
        Collections.sort(l,cm);
        int s=l.get(0).startTime;
        ans.add(l.get(0).pos);
        int e=l.get(0).endTime;
        for(int i=1; i<l.size(); i++){
            if(l.get(i).startTime>e){
                e=l.get(i).endTime;
                ans.add(l.get(i).pos);
            }
        }
        for(int m:ans){
            System.out.print(m);
        }
    }
    public static void main(String[] args) {
        NMeetingInOneRoom n=new NMeetingInOneRoom();
        n.numberOfMeeting(new int[]{1,3,0,5,8,5},new int[]{2,4,5,7,9,9});
    }
}
