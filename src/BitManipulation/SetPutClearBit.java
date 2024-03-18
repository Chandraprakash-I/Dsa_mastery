package BitManipulation;

public class SetPutClearBit {

    public void doIt(int num,int i){

        //count the number of set bits
        int temp=num;
        int cnt=0;
        while(temp!=0){
            if((temp&1) ==1){
                cnt++;
            }
            temp=temp>>1;
        }
        System.out.println("set bits count :"+cnt);

        //value in ith bit 0 or 1
        int mask=(1<<(i-1));
        int res=((mask&num)!=0)?1:0;
        System.out.println(res);

        //set the ith bit
        System.out.println(mask|num);

        //clear the ith bit
        mask=(1<<(i-1));
        mask=~mask;
        res=(mask&num);
        System.out.println(res);

        //num is odd or even
        String e=((num&1) ==1)?"odd":"even";
        System.out.println(e);

        //to unset last set bit
        num=num&(num-1);

        //to set last unset bit
        num=5;
        int x=num;
        while((x&1)!=0){
            x=x>>1;
        }
        if(x==0){
            System.out.println(num);
        }
        System.out.println("unset :"+(num|(num+1)));

        //if given number is power of 2
        num=16;
        String t=((num&(num-1))==0)?"yes":"no";
        System.out.println("is it a power of 2 :"+t);
    }

    public void swap(int a,int b){
         a=a^b;
         b=b^a;
         a=a^b;
         System.out.println(a);
         System.out.println(b);
    }
    public static void main(String[] args) {
        SetPutClearBit s=new SetPutClearBit();
        s.doIt(5,3);   //5=101,6=  110,4=100   //3= 101 //2=100
    }
}
