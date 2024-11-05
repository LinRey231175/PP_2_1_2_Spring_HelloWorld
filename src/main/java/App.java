import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
            HelloWorld helloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
            HelloWorld anotherHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
            Cat catBean = applicationContext.getBean("catBean", Cat.class);
            Cat anotherCatBean = applicationContext.getBean("catBean", Cat.class);
            System.out.println(helloWorldBean.getMessage());
            System.out.println("Бины HelloWorld равны? " + helloWorldBean.equals(anotherHelloWorldBean));
            System.out.println("Бины Cat равны? " + catBean.equals(anotherCatBean));
        } catch (Exception e) {
            System.err.println("Произошла ошибка : " + e.getMessage());
            e.printStackTrace();
        }
    }
}