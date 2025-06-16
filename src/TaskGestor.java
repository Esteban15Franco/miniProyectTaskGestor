import java.util.Scanner;

public class TaskGestor {
    Scanner s = new Scanner(System.in);

    private int numTask;
    private String task;
    private int taskPriority;
    private String[] arrTask;

    public String[] getArrTask(){
        return this.arrTask;
    }

    public String getTask(){
        return this.task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public int getNumTask(){
        return this.numTask;
    }

    public void setNumTask(int numTask){
        this.numTask = numTask;
    }

    public void taskMenu(){
        int opt;

        do {
            System.out.println("Administrador de tareas\n");
            System.out.println("1.) agregar tarea");
            System.out.println("2.) mostrar tareas");
            System.out.println("3.) salir del programa...\n");
            System.out.print("Ingrese una opcion valida: ");
            opt = s.nextInt();

            switch (opt){
                case 1 :
                    addTask();
                    break;


                case 2 :
                    showTasks();
                    break;

                case 3 :
                    System.out.println("Hasta luego...");
                    System.exit(0);

            }

        }while (opt != 3);
    }

    public void addTask(){
        System.out.println("Ingrese el numero de tareas que agregara: ");
        int numTask = s.nextInt();
        s.nextLine();
        setNumTask(numTask);
        arrTask = new String[getNumTask()];

        for (int i = 0; i < arrTask.length; i++){
            System.out.print("Ingrese la tarea: ");
            String task = s.nextLine();
            setTask(task);

            if (task.isEmpty()){
                System.out.println("Tarea vacia. no se agregara.");
                i--;
            }else {
                arrTask[i] = getTask();
            }
        }
        System.out.println("Tareas agregadas correctamente.");


    }

    public void showTasks(){
        System.out.println("Lista de tareas");
        int i = 1;
        for (String tasks : getArrTask()){
            System.out.println((i++) +". "+tasks);

        }
    }

}
