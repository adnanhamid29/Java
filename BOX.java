class BOX {

    int  depth;
    int  width;
    int  height;
    int volume(){
        return (width*depth*height);
    }
}
class BoxDemo{
    public static void main(String[] args) {
        BOX mybox1=new BOX();
        BOX mybox2= new BOX();
        mybox1.depth=20;
        mybox1.width=10;
        mybox1.height=15;
        mybox2.depth=3;
        mybox2.width=6;
        mybox2.height=9;
        System.out.println("Volume of First Box is "+mybox1.volume());
        System.out.println("Volume of second  Box is "+mybox2.volume());
    }
}
