package com.pattern.creation.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<Integer,Shape> map=new Hashtable<>();




    /**
     * 获取图形
     * @param id
     * @return
     */
    public static Shape getShape(int id){
        if (!map.isEmpty()&&map.containsKey(id)) {
            try {
                return (Shape)map.get(id).clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void init(){
        Circle circle=new Circle();
        circle.setId(1);
        map.put(1,circle);
        Rectangle rectangle=new Rectangle();
        rectangle.setId(2);
        map.put(2,rectangle);
    }
}
