public class Person {
    String name;
    String[] points;
    boolean billy;
    /*
    N = Name of interviewy
    P = Array of points that make towards
    B = Should billy ever be allowed to have his life ever taken
     */
    public Person(String n,String[] p,boolean b) {
        name=n;
        points=p;
        billy=b;
    }
    public String thought() {
        String str=name+": personally I think...\n\n";
        if(billy) {
            str+="\nwe should be able to take billy's life";
        } else {
            str+="\nwe should not be able to take billy's life";
        }
        str+="\n I think this because...";
        for(String point:points) {
            str+=point+"\n";
        }

        return str;
    }
}
