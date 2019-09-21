package zuoye.LeeCodeTest;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class EasyTest {


    public static void main(String[] args) {
        EasyTest et = new EasyTest();

//        System.out.println(et.addBinaryOwn("1010","1011"));
        System.out.println(et.reverseOwn(10000098));
        System.out.println(et.isPalindromeToString(90));
        System.out.println(et.romanToInt("XIII"));

    }


    public String addBinaryOwn(String a, String b){
//        1.先保证两个字符串不为空；
        if(a==null||a.length()==0){
            return b;
        }
        if(b==null||b.length()==0){
            return a;
        }
//        2.在两个字符串不为空的前提下，像十进制加法一样，从个位开始，也就是二进制的从低位到高位的顺序，
//        设置两个字符串的最低位标记索引；
        int i = a.length()-1;
        int j = b.length()-1;

//        3.设置进位为0；
        int c =0;
//        4.用一个stringbuilder来放计算当前位置和结果的字符串；
        StringBuilder res = new StringBuilder();
        //5.从最低位开始循环,因为ab的长度可能不一致，必须有索引不能为负数的前提，还要考虑到最高位只剩一个进位的情况；
        while(i>=0||j>=0||c==1){
            if(i>=0){
                //6.进位跟a当前位置的字符相加；
                c+= a.charAt(i)-'0';
            }
           if(j>=0){
               //7.进位跟b当前位置的字符相加；
               c+= b.charAt(j)-'0';
           }
            //8.此时c可能的情况有三种：0(不进位，当前位置和为0)，1（不进位，当前位置和为1），2(进位1，当前位置和为0)，
            // 3（进位1，当前位置和为1）；
            //9.以此看来，当前位置的和可以看成add/2的余数,进位是add右移一位之后的值；
            res.append(c%2);
            c>>=1;
            //10.ab的索引各-1，向左挪一位。
            i--;
            j--;
        }
        return res.reverse().toString();
    }

    public int reverseOwn(int x ){
        //为了反转，首先想到的是得拿个位、十位、百位、千位等位上的数；
        //如何拿？把整型转字符串，再依次取每个位上的数字，拿完再反转，好像不是这道题考验我们的本意；
        //所以还是按照数学思维：假设现在数据是321，想拿到1 ，321除10的余数就可以，那么如何拿到2呢？
        //想想，是不是还是按照之前的思路，但只不过是32除10的余数？这样也无需考虑正负数的问题。
        //所以总结上面的思路就是：x%10（得到当前的个位），再x/10，为取下一个个位数做准备。一直循环到x!=0.
        //防止溢出，先用long接收
        long rev=0;
        while (x!=0){
            int p = x%10;
            x=x/10;
            rev = rev*10 + p;
            //防止每次循环完的rev,可能已溢出的问题，考虑反转后不溢出的问题，溢出则返回0
            if(rev>Integer.MAX_VALUE||(rev<Integer.MIN_VALUE)){
                return 0;
            }
        }
        return (int)rev;
    }

    public boolean isPalindrome(int x) {
      //看完这道题，首先想到的是跟昨天的反转整数类似的想法，
        // 即反转之后判断跟原数是否相等，即相等就是回文数；
        //先排除几种特殊情况：
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int rev= 0;
        int tmp = x;
        while (tmp!=0){
            int p = tmp%10;
            tmp=tmp/10;
            rev = rev * 10 +p ;
        }
        return rev ==x;

//        if (x < 0 || (x % 10 ==0 && x != 0) ) {
////            return false;
////        }
//        boolean result = false;
//        char[] chars = String.valueOf(x).toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == chars[chars.length -i-1]) {
//                result = true;
//            } else {
//                result = false;
//                break;
//            }
//        }
//        return result;
    }
    public boolean isPalindromeToString(int x){
        //将x转化成字符串
        String s = String.valueOf(x);
        //两个指针，一个从0开始 ，一个从末尾开始
        int i = 0;
        int j = s.length()-1;
        //i++和j--循环，拿出每一位比较，如果不相等，则不是回文数
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){

                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeToChar(int x ){
       //排除特殊情况
       if(x<0||x%10==0 && x!=0){
           return false;
       }
       Boolean result= false;
        //转为数组
       char[] chars = String.valueOf(x).toCharArray();
        //从第一位和最后一位开始循环比较
       for(int i =0;i<chars.length;i++){
            if(chars[i]==chars[chars.length-1-i]){
                result= true;
            }else {
                result= false;
                break;
            }
       }
       return result;
    }
    public int romanToInt(String s){
        //用map存放罗马数字对应的整数值
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //从给出的例子我们可以看书，如果左边的罗马数字小于当前位置的值，那么就减去左边的值；
        //如果右边的罗马数字大于当前位置的罗马数字，那就加；所以用下面几个变量，从第一个当前值
        //开始，跟后面的next遍历比较就可以了。
        int result = 0;
        int curVal = 0;
        int nextVal = 0;
        for(int i=0;i<s.length();i++){
            curVal = map.get(s.charAt(i));
            nextVal = i >= s.length()-1? 0:map.get(s.charAt(i+1));
            if(curVal>=nextVal){
                result = result+ curVal;
            }else {
                result = result -curVal;
            }
        }
            return result;

    }

    public byte[] getB(String s ){
        s = "abc";
        byte[] a = s.getBytes();
        return a;

    }

    public String longestCommonPrefix(String[] strs){
        //列出特殊情况
        if(strs.length==0){
            return " ";
        }
        //把第一个字符串当成对比的参照字符串，然后逐个循环，跟第一个做比较
        String first = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<first.length()&&j<strs[i].length();j++){
                if(first.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            first= first.substring(0,j);
           if(first.equals(" ")){
               return " ";
           }
        }
        return first;
    }


    public boolean isValid(String s) {
        //先用map把括号对存起来，key：左括号；value：右括号；
        // 这样配对起来时间复杂度就为O(1);
        //防止栈为空时报错，加入('?','?')
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('?','?');
        //排除几种特殊情况：
        if(s.equals("")){
            return true;
        }
        if(s.length()%2==1){
            return false;
        }
        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}'){
            return false;
        }
        //初始化栈，然后循环s,如果是左括号，先入栈，并且把它放在stack的last；
        //如果有跟它配对的右括号出现，就将它移除，如果最后正好都配对完，剩下的就是最开始的那个'？'
        LinkedList<Character> stack = new LinkedList<Character>();
            stack.add('?');
        for(Character c:s.toCharArray()){
            //map如果包含key，证明就还是左括号
            if(map.containsKey(c)){
                stack.addLast(c);
//                map不包括key了，那证明应该是出现了一个右括号，如果符合一对括号，
//                那它和栈里面的最后一个括号之间，肯定不能有其他形式的括号
//                所以把栈里的最后一个从map里get出来，看是否跟右括号一样
            }else if(map.get(stack.removeLast())!=c){
                return false;
            }
        }
        return stack.size()==1;
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        if(nums==null){
            return 0;
        }
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

    public int strStr(String haystack, String needle) {
        return 2;


    }

}
