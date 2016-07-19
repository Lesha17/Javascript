package lmm.javascript;

public class JSValue {
    public static final JSValue VOID = new JSValue();
    public static final JSValue NULL = new JSValue();
    public static final JSValue BREAK = new JSValue();

    private Object value;
    private boolean is_ret;

    private JSValue() {
        value = new Object();
    }

    public JSValue(Object value) {
        if (value == null) {
            throw new IllegalArgumentException("value = null");
        }
        if(!isNumber(value) && !isBool(value) && !isString(value) && value != VOID.value && value != NULL.value && value != BREAK.value){
            throw new IllegalArgumentException("Invalid value type " + value + " (" + value.getClass() + ")");
        }

        this.value = value;
        this.is_ret = false;
    }

    public JSValue(Object value, boolean is_ret){
        this(value);
        this.is_ret = is_ret;
    }

    public boolean isReturn(){
        return is_ret;
    }

    public JSValue asReturned(){
        return new JSValue(value, true);
    }

    public Object getValue(){
        return value;
    }

    public Number asNumber(){
        return (Number)value;
    }

    public Boolean asBoolean(){
        return (Boolean)value;
    }

    public String asString(){
        if(isNumber()){
            double dval = asNumber().doubleValue();
            if(dval % 1 == 0){
                value = asNumber().longValue();
            }
        }
        return value.toString();
    }

    public boolean isNumber() {
        return isNumber(value);
    }

    public boolean isBool(){
        return isBool(value);
    }

    public boolean isString(){
        return  isString(value);
    }

    private static boolean isNumber(Object val) {
        return val instanceof Number;
    }

    private static boolean isBool(Object val) {
        return val instanceof Boolean;
    }

    private static boolean isString(Object val) {
        return val instanceof String;
    }
}
