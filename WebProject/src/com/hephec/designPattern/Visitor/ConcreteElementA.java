package com.hephec.designPattern.Visitor;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitConcreteElementA(this);
	}
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void opertionA(){
		//���еĹ���ʵ��
	}
}

