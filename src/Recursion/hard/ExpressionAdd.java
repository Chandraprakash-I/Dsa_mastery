package Recursion.hard;

public class ExpressionAdd {

    public void helper(String path,String s,int target,long eval,int pos,long multiplied){

        if(pos>=s.length() && eval==target){
            System.out.println(path);
            return;
        }


       for(int i=pos; i<s.length(); i++){
           if(i!=0 && s.charAt(pos)=='0')break;
           String ch=s.substring(pos,i+1);
           long val=Long.parseLong(s.substring(pos,i+1));
           if(pos==0){

               helper(path+ch,s,target,val,pos+1,val);
           }else{
               //addition
               helper(path+"+"+ch,s,target,eval+val,pos+1,val);
               //subtraction
               helper(path+"-"+ch,s,target,eval-val,pos+1,-val);
               //multiplication
               helper(path+"*"+ch,s,target,eval-multiplied+(multiplied*val),i+1,multiplied*val);

           }
       }
    }
    public void solve(String s,int target){
        if(s.isEmpty()){
            return;
        }
        helper("",s,target,0,0,0);
    }
    public static void main(String[] args) {
        ExpressionAdd e=new ExpressionAdd();
        e.solve("345",12);
    }
}
