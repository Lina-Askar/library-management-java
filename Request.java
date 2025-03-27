

package strproject;




public class Request {
 
    
   
    private String customerName;
    private Book book;
    private  int requestId;   

    public Request(String customerName, Book book) {
        this.customerName = customerName;
        this.book = book;
        this.requestId = (int)(Math.random() * 10000);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "Request{" + "customerName=" + customerName + ", book=" + book + ", requestId=" + requestId + '}';
    }


}