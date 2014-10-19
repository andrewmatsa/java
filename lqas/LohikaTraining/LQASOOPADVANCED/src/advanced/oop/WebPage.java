package advanced.oop;

public abstract class WebPage implements PopUp, LinuxWindow{
	
	public abstract void typeText();
	public abstract void close();
	public abstract void collapse();
	public abstract void click();
	
	public String getTitle(WebPage page){
		return page.toString(); 
	}
	
	@Override
	public void clickOk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickCancel() {
		// TODO Auto-generated method stub
		
	}
	
}
