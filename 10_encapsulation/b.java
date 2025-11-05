class A{
  private int value;
//   setter function
  public void setvalue(int x){
    value = x;
  }
//   getter function
  public int getvalue(){
      return value;
  }
}
class b{
    public static void main(String[] args){
        A r = new A();
        r.setvalue(100);
        System.out.println(r.getvalue());
    } 
}