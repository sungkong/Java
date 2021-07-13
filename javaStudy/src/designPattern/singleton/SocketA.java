package designPattern.singleton;

public class SocketA {

	private SocketClient socketClient;
	
	public SocketA() {
		this.socketClient = SocketClient.getInstance();
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient;
	}
}
