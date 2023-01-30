package xyz.playedu.api.types;

import java.util.List;

public class PageResult<T> {

    private List<T> data;

    private Long total;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
