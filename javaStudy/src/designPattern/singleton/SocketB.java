package designPattern.singleton;

public class SocketB {

	private SocketClient socketClient;
	
	public SocketB() {
		this.socketClient = SocketClient.getInstance();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
}
