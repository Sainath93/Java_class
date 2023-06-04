public class ChildDepartment extends Department{


    @Override
    public void getDepartmenSize() {
        System.out.print("Hello Department ");
    }


    public static void main(String[] args) {
        ChildDepartment c = new ChildDepartment();
        c.getDepartmenSize();




    }
}


