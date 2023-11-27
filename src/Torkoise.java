public class Torkoise {

    public void duplicate(int[] a){
        int slow=a[0];
        int fast=a[0];

        do{
            slow=a[slow];
            fast=a[a[fast]];
        }while(fast!=slow);

        fast=a[0];
        while(slow!=fast){
            slow=a[slow];
            fast=a[a[fast]];
        }
        System.out.println(fast);
    }
    public static void main(String[] args) {
        Torkoise t=new Torkoise();
        int[] a=new int[]{1,2,3,1,4};
        t.duplicate(a);
    }
}
