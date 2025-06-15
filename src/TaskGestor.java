import java.util.Scanner;

public class TaskGestor {
    Scanner s = new Scanner(System.in);

    private String titleTask;
    private String taskContent;

    public String getTitleTask(){
        return this.titleTask;
    }

    public void setTitleTask(String titleTask){
        this.titleTask = titleTask;
    }

    public String getTaskContent(){
        return this.taskContent;
    }

    public void setTaskContent(String taskContent){
        this.taskContent = taskContent;
    }

    public void showMenu(){
        int opt = 0;
        do {
            System.out.println("Administrador de tareas\n");
            System.out.println("1.) Agregar tarea");
            System.out.println("2.) ver tareas");
            System.out.println("3.) Salir del programa...");
            System.out.print("\nIngrese una opcion valida: ");
            opt = s.nextByte();


        }while(opt != 3);

    }

    public void addTask(){
        String title;
        String details;
        System.out.print("Titulo: ");
        title = s.nextLine();
        System.out.println("detalles: ");
        details = s.nextLine();

        if (title == "" && details == ""){
            System.out.println("Tarea vacia, no se ha agregado. ");
        }else {
            System.out.println("Tarea agregada exitosamente");
        }
    }

    public void showTask(){
        addTask();
    }


}
