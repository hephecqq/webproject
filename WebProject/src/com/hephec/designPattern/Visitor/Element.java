package com.hephec.designPattern.Visitor;
/**
 * �����ʵ�Ԫ�صĽӿ�
 */
public abstract class Element {
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor �����߶���
	 */
	public abstract void accept(Visitor visitor);
}
