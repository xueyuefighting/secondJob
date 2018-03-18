import java.text.SimpleDateFormat;

public enum EnumMethod {
	DATA_TIME_YYYYMMDDHHMMSS{
        String getTime(){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.format(new java.util.Date());
        }
    },
    
    DATA_TIME_YYYYMMDD{
        String getTime(){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(new java.util.Date());
        }
    };
    
    abstract String getTime();
    
    public static void main(String[] args) {
        System.out.println(EnumMethod.DATA_TIME_YYYYMMDDHHMMSS.getTime());
        System.out.println(EnumMethod.DATA_TIME_YYYYMMDD.getTime());
    }
}
