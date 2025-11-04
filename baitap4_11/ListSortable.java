package baitap4_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> listThesis;

    public ListSortable() {
        listThesis = new ArrayList<>();   // ✅ KHỞI TẠO Ở ĐÂY
    }

    public List<E> getListThesis() {
        return listThesis;
    }

    public void setList(List<E> list) {
        this.listThesis = list;
    }

    public void addThesis(E item) {
        this.listThesis.add(item);
    }

    public void print() {
        Collections.sort(this.listThesis);
        for (E item : this.listThesis) {
            System.out.println(item);
        }
    }
}
