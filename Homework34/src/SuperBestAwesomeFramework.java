import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperBestAwesomeFramework {
    static Class[] classesTypes;

    public static void main(String[] args) {
        List<Student> list = SuperBestAwesomeFramework.getManyWithCons(Student.class, 100, "John", 18);
    }

    static <T> List<T> getMany(Class<T> c, int count) {
        List<T> l = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T o = c.newInstance();
                l.add(o);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return l;
    }

    //создает список экземпляров переданного класс (count штук)
    //в качестве параметров конструктора передает params
    //можно пользоваться getConstructors()
    //можно пользоваться getParameterTypes() у конструктора
    //можно вызывать getClass() у любого параметра из переданных params
    public static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params) {
        int lenght = params.length;
        classesTypes = new Class[lenght];
        Class[] paramesi = new Class[lenght];
        int i = 0;
        for(Object param : params){
            paramesi[i] = param.getClass();
            i++;
        }

        Constructor[] constructors = c.getConstructors();
        for(Constructor constructor : constructors){
            Class[] constructorParameterTypes = constructor.getParameterTypes();

            if (params.length != constructorParameterTypes.length) return null;

            for (i = 0; i < lenght; i++) {
                if(paramesi[i].equals(constructorParameterTypes[i])){
                    classesTypes[i] = constructorParameterTypes[i];
                } else
                if (paramesi[i].getTypeName().equals(Integer.class.getTypeName())) {
                    classesTypes[i] = int.class;
                } else
                    if (paramesi[i].getTypeName().equals(long.class.getTypeName())) {
                        classesTypes[i] = long.class;
                    } else
                    if (paramesi[i].getTypeName().equals(Double.class.getTypeName())) {
                        classesTypes[i] = double.class;
                    }
            }
        }

        List<T> list = new ArrayList<>();


        try{
            Constructor returnConctruct = c.getConstructor(classesTypes);
            for (int j = 0; j < count; j++) {
                list.add((T) returnConctruct.newInstance(returnConctruct));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return list;
    }
}
