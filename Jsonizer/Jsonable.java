package Jsonizer;

import java.util.Map;

public interface Jsonable{
    Map<String,Object> getProperties();
    void setProperties(Map<String,Object> properties);
}