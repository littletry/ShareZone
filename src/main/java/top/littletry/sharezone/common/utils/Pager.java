package top.littletry.sharezone.common.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by LittleTry
 * Date: 2017-12-29
 * Time: 16:06
 *
 * @author LittleTry
 */
public class Pager<T> implements Serializable {
    /**
     * currentPage 当前页
     */
    private int currentPage = 0;

    /**
     * pageSize 每页大小
     */
    private int pageSize = 10;

    /**
     * pageTotal 总页数
     */
    private int pageTotal;

    /**
     * contentTotal 总条数
     */
    private int contentTotal = 0;

    /**
     * previousPage 前一页
     */
    private int previousPage;

    /**
     * nextPage 下一页
     */
    private int nextPage;

    /**
     * firstPage 第一页
     */
    private int firstPage = 0;

    /**
     * lastPage 最后一页
     */
    private int lastPage;

    /**
     * data 每页的内容
     */
    private List<T> data;
    /**
     * 设置当前页
     *
     * @param currentPage
     */
    public Pager<T> setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * 设置每页大小,也可以不用赋值,默认大小为10条
     *
     * @param pageSize
     */
    public Pager<T> setPageSize(int pageSize) {
        if(pageSize > 0){
            this.pageSize = pageSize;
        }
        return this;
    }
    /**
     * 设置总条数,默认为0
     *
     * @param contentTotal
     */
    public Pager<T> setContentTotal(int contentTotal) {
        this.contentTotal = contentTotal;
        initPage();
        return this;
    }
    /**
     * 设置分页内容
     *
     * @param data
     */
    public Pager<T> setData(List<T> data) {
        this.data = data;
        return this;
    }
    /**
     * 设置其他参数
     */
    public Pager<T> initPage() {
        // 总页数
        this.pageTotal = this.contentTotal % this.pageSize > 0 ? this.contentTotal / this.pageSize + 1 : this.contentTotal / this.pageSize;
        // 第一页
        this.firstPage = 0;
        // 最后一页
        this.lastPage = this.pageTotal-1;
        // 前一页
        if (this.currentPage > 0) {
            this.previousPage = this.currentPage - 1;
        } else {
            this.previousPage = this.firstPage;
        }
        // 下一页
        if (this.currentPage < this.lastPage) {
            this.nextPage = this.currentPage + 1;
        } else {
            this.nextPage = this.lastPage;
        }
        return this;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public int getContentTotal() {
        return contentTotal;
    }

    public int getPreviousPage() {
        return previousPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public List<T> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pager [currentPage=" + currentPage + ", pageSize=" + pageSize
                + ", pageTotal=" + pageTotal + ", contentTotal=" + contentTotal
                + ", previousPage=" + previousPage + ", nextPage=" + nextPage
                + ", firstPage=" + firstPage + ", lastPage=" + lastPage
                + ", content=" + data + "]";
    }

}
