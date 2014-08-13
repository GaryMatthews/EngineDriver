package jmri.enginedriver3;

import android.os.Handler;

//DynaFragEntry defines settings and variables for single fragment to be displayed by the activity
public class DynaFragEntry {
	public DynaFragEntry() {
		this._name = "";
		this._type = "";
		this._width = 1;
        this._data = null;
        this._handler = null;
	}
    public DynaFragEntry(String _name, String _type, int _width) {
        this._name = _name;
        this._type = _type;
        this._width = _width;
        this._data  = null;
        this._handler= null;
    }
    public DynaFragEntry(String _name, String _type, int _width, String _data) {
        this._name = _name;
        this._type = _type;
        this._width = _width;
        this._data  = _data;
        this._handler= null;
    }
//    public DynaFragEntry(String _name, String _type, int _width, String _data, Handler _handler) {
//        this._name = _name;
//        this._type = _type;
//        this._width = _width;
//        this._data = _data;
//        this._handler = _handler;
//    }

    //what is the title of this fragment, should be unique, never null
	private String _name = "";
	public String getName() { return _name; }
	public void setName(String name) { _name = name; }

	//what type is this fragment, should be one of WEB, LIST, etc.	
    private String _type = "";
	public String getType() { return _type; }
	public void setType(String type) { _type = type; }

	//how wide is this fragment, relatively speaking  1 is narrowest	
    private int _width = 1;
	public int getWidth() { return _width; }
	public void setWidth(int width) { _width = width; }

    //arbitrary data storage for this fragment, used differently by each type, will be json one day
    private String _data = "";
    public String getData() { return _data; }
    public void setData(String data) { _data = data; }

    //ref to handler for fragment, set and cleared as fragment is started and stopped
    private Handler _handler = null;
    public Handler getHandler() {return _handler;}
    public void setHandler(Handler handler) {this._handler = handler;}

}
