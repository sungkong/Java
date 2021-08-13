package DataStructure;

import DataStructure.HashTable.Slot;

public class HashTableLinearProbing {
	class Slot {
		String key;
		String value;
		Slot(String key, String value){
			this.key = key;
			this.value = value;
		}
	}
	
	private Slot[] hashTable;
	
	public HashTableLinearProbing(int size) {
		this.hashTable = new Slot[size];
	}
	
	public int hashFunc(String key) {
		return key.charAt(0) % this.hashTable.length;
	}
	
	// 해쉬 함수 향상 버전
	public int hashFucn2(String name) {
		int key = 0;
		for(int i=0; i<name.length(); i++) {
			key += name.charAt(i); 
		}
		
		return (int)(key) % 200;
	}
	
	
	//값이 존재하면 현재 인덱스에 + 1을 하며 빈 슬롯을 찾아 값을 넣는다
	
	public boolean addData(String key, String value) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			if(this.hashTable[address].key == key) {
				this.hashTable[address].value = value;
				return true;
			} else {
				int currAddress = address + 1;
				while(this.hashTable[currAddress] != null) {
					if(this.hashTable[currAddress].key == key) {
						this.hashTable[currAddress].value = value;
						return true;
					} else {
						currAddress++;
						if(currAddress >= this.hashTable.length) {
							return false;
						}
					}
				}
				this.hashTable[currAddress] = new Slot(key, value);
				return true;
			}
		} else {
			this.hashTable[address] = new Slot(key, value);
		}
		return true;
	}
	
	public String getData(String key) {
		int address = this.hashFunc(key);
		if(this.hashTable[address] != null) {
			if(this.hashTable[address].key == key) {
				return this.hashTable[address].value;
			} else {
				int currAddress = address + 1;
				while(this.hashTable[currAddress] != null) {
					if(this.hashTable[currAddress].key == key) {
						return this.hashTable[currAddress].value;
					} else {
						currAddress++;
						if(currAddress >= this.hashTable.length) {
							return null;
						}
					}
				}
				return null;
			}
		
		} else {
			return null;
		}
	}
		
}
