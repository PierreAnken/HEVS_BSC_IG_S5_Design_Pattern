package Template_Method;

abstract class Abstract_Diner {

    final void prepareDiner(){
        serveWater();

        cleanTable();
    }

    public void serveWater(){
        System.out.println("Water served");
    }

    public void cleanTable(){
        System.out.println("Table cleaned");
    }

    abstract void

}
