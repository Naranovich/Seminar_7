package notebook.mapper;

/**
 * Конвертер моделей из одного типа в другой.

 * */
public interface Mapper<E, T> {
    T toInput(E e);
    E toOutput(T t);
}
