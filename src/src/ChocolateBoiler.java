public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler singletonInstance = null;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    synchronized public static ChocolateBoiler getInstance(){
        if (singletonInstance == null)
            singletonInstance = new ChocolateBoiler();

        return singletonInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}


