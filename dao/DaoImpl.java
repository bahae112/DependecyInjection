package dao;

public class DaoImpl implements IDao{
    public double getData(){
        System.out.println("data imported");
        double data = 14;
        return data;
    };
    public void setData(){
        System.out.println("data setted");
    };
}
