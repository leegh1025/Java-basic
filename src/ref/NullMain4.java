package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        bigData.data = new Data(); //참조값을 주어 오류 해결
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
