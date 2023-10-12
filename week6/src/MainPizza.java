class MainPizza {
    public static void main(String[] args) {
        Pizza piz = new Pizza1(15);
        piz = new Cheese(piz);
        System.out.println("피자 이름:" +piz.getName() + "피자 가격:"+ piz.getPrice() );


    }
}