package structural.adapter.classadapter;

class ClassAdapter extends Adaptee implements Target {
    public void request()
    {
        specificRequest();//透過繼承Adaptee 達到轉Call Adaptee function的功能
    }
}