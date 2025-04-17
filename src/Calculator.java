import java.util.Stack;

public class Calculator {

    public int calculate(String s){
        if(s.length()==0|| s.isBlank() || s==null){
            return 0;
        }

        int num=0; char sign='+';
        Stack<Integer> stack=new Stack<>();

        //handling with spaces
        s.replaceAll(" ","");
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            //seeing if its a digit and accumulating.
            if(Character.isDigit(c)){
                num+=num*10+(c-'0');
            }
            //handling brackets with recursion
            if(c=='('){
                int j=i;
                int count1=0;
                int count2=0;
                while(i<s.length()){
                    char ch=s.charAt(i);
                    if(ch=='('){
                        count1++;
                    }else if(ch==')'){
                        count2++;
                    }else if(count1==count2){
                        break;
                    }
                    i++;
                }
                num=calculate(s.substring(j+1,i));

            }

            if(!Character.isDigit(c)&& c!='(' && c!=')'||i==s.length()-1){
                if(sign=='+'){
                    stack.push(num);
                }else if(sign=='-'){
                    stack.push(-num);
                }else if(sign=='*'){
                    stack.push(stack.pop()*num);
                }else if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign=c;
                num=0;
            }
        }

      while(!stack.isEmpty()){
          num+=stack.pop();
      }

      return num;
    }

    public static void main(String[] args){
        Calculator c=new Calculator();
        System.out.println(c.calculate("3+2-1"));
    }
}
