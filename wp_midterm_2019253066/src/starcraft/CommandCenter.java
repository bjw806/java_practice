package starcraft;

public class CommandCenter extends Building{
	
	public CommandCenter() {
		this.CommandCenter = false;
	}
	
	
	int SCVNum = 0;
	@Override//override �˻�
	public boolean isBuild() {
		return this.CommandCenter;
	}
	@Override
	public void Build() {
		this.CommandCenter = true;
	}
	@Override
	public void Destroy() {
		this.CommandCenter = false;
	}
	
	public void MakeSCV() {//SCV ����
	    
		SCVNum++;
		//�̳׶� -50
	}
}
