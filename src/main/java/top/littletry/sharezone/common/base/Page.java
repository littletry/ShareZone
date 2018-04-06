package top.littletry.sharezone.common.base;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 分页
 * @author ht
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private int current = 1;
    /**
     * 每页记录数
     */
    private int pageSize = 10;
    /**
     * 总页数
     */
    private int pageTotal;
    /**
     * 总条数
     */
    private int total = 0;


    public Page(int current, int pageSize, int pageTotal, int total) {
        this.current = current;
        this.pageSize = pageSize;
        this.pageTotal = pageTotal;
        this.total = total;
    }

    public Page(int current, int pageSize, int total){
        this.current = current;
        this.pageSize = pageSize;
        this.total = total;
        this.pageTotal = total % pageSize > 0 ? total / pageSize + 1 : total / pageSize;
    }

    public Page() {
    }

    @JsonIgnore
    public int getPageNum (){
        return (this.current -1) * pageSize;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", pageSize=" + pageSize +
                ", pageTotal=" + pageTotal +
                ", total=" + total +
                '}';
    }
}
