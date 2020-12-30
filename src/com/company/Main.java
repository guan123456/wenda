package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void print(int index,Object object){
        System.out.println(String.format(" {%d}, %s",index,object.toString()));
    }
    public static void demoString(){
        String str = "Hello World";
        System.out.println(str.indexOf('e'));

    }

    public static void demoList(){
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0; i < 4; ++i){
            strList.add(String.valueOf(i));
        }
    }

    public static void demoMapTable(){
        Map<String,String> map = new HashMap<String,String>();
        for (int i = 0;i < 4; ++i){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);
        for(Map.Entry<String,String> entry : map.entrySet()){
            print(2,entry.getKey() + "|" + entry.getValue());
        }
    }


    public static void demoException(){
        try{
            int k = 2;
           // k = k / 0;
            if (k == 2){
                throw new Exception("我故意的");
            }
        }catch (Exception e){
            print(2,e.getMessage());
        } finally {
            print(3,"finally");
        }
    }
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for(int i = 0; i < 3; ++i){//集合默认是不重复的
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
    }

    public static void demoOO(){
        Animal a = new Animal("jim",1);
        a.say();
        Animal human = new Human("Lei",11,"China");
        human.say();
    }

    public static void demoFunction(){
        Random random = new Random();
        //random.setSeed(1);//固定种子
        print(1,random.nextInt(1000));
        print(2,random.nextFloat());

        //随机打乱
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(array);
        print(3,array);

        //时间
        Date date = new Date();
        print(4,date);
        print(5,date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6,df.format(date));

        print(7,UUID.randomUUID());
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        demoString();
        demoMapTable();
        demoSet();
        demoException();
        demoOO();
        demoFunction();
    }
}
