import views.View;
import controllers.Controller;
import controllers.SortingMethods;
import controllers.SearchingMethods;

public class App {

    public static void main(String[] args) {
        View viewInstance = new View();
        SortingMethods sortingMethodsInstance = new SortingMethods();
        SearchingMethods searchingMethodsInstance = new SearchingMethods();

        Controller appController = new Controller(viewInstance, sortingMethodsInstance, searchingMethodsInstance);

        appController.start();
    }
}
