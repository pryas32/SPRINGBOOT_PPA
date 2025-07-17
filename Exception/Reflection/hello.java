// // package Exception.Reflection;

// // import java.lang.reflect.Method;

// // public class hello {


// // public static void manage(Object datamanager){

// //        Class c=datamanager.getClass();
// //        System.out.println(c.getName());
// //         Method[] m=c.getDeclaredMethod("helloworld",new Class[]{int.class,String.class});
// //     m.setAccessible(true);
// //     m.invoke(datamanager,{12,"prayas"});




 
// // }






// // public static void main(String args[])
// // {

// //     manage(new datamanagerhello());
// // }

// // }
// import java.lang.reflect.Method;

// public class hello {

//     public static void manage(Object datamanager) {
       
//             Class c = datamanager.getClass();
//             System.out.println(c.getName());

//             // Get the method with int and String parameters
//             Method m = c.getDeclaredMethod("helloworld", int.class, String.class);
//             m.setAccessible(true);

//             // Invoke the method with arguments
//             m.invoke(datamanager, new Object[]{12, "prayas"});

       
//     }
    

//     public static void main(String[] args) {
//         manage(new DataManagerHello());
//     }
// }

// // You also need this class to exist:
// class DataManagerHello {
//     private void helloworld(int x, String y) {
//         System.out.println("Hello World with x=" + x + " and y=" + y);
//     }
// }
import java.lang.reflect.Method;

public class hello {

    public static void manage(Object datamanager) {
        try {
            Class<?> c = datamanager.getClass();
            System.out.println(c.getName());

            // Get the method with int and String parameters
            Method m = c.getDeclaredMethod("helloworld", int.class, String.class);
            m.setAccessible(true);

            // Invoke the method with arguments
            m.invoke(datamanager, new Object[]{12, "prayas"});

        } catch (Exception e) {
            e.printStackTrace(); // Show what's going wrong
        }
    }

    public static void main(String[] args) {
        manage(new DataManagerHello());
    }
}

// The class must match this exactly
class DataManagerHello {
    private void helloworld(int x, String y) {
        System.out.println("Hello World with x=" + x + " and y=" + y);
    }
}
