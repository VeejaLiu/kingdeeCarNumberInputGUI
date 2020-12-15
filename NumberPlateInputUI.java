/**
 * ���ƺ�ͼ�λ�����UI
 * 		addCharacter() ׷���ַ������ƺź���
 * 		gogogo_actionPerformed() ��������Ĳ���
 * 		backspace_mouseClicked() ɾ�����һ���ַ��Ĳ���
 * 
 * @author Veeja.Liu:veejaliu@gmail.com 2020��12��15��08:57:12 ��������
 */
package com.kingdee.eas.weighbridge.client;

import org.apache.log4j.Logger;

import com.kingdee.bos.ui.face.CoreUIObject;

/**
 * output class name
 */
public class NumberPlateInputUI extends AbstractNumberPlateInputUI {
	private static final Logger logger = CoreUIObject.getLogger(NumberPlateInputUI.class);

	public NumberPlateInputUI() throws Exception {
		super();
	}

	public void storeFields() {
		super.storeFields();
	}

	/**
	 * ���ַ�׷�ӵ����ƺŵ����ÿ�����ֻ�����ĸ��Ҫ��������������ڳ��ƺŵ����׷���ַ�
	 * 
	 * @param string
	 */
	private void addCharacter(String string) {
		String oldCarNumber = carNumber.getText();
		String newCarNumber = oldCarNumber + string;
		carNumber.setText(newCarNumber);
	}
	
	/**
	 * ����������ת�������ƺ��ַ�������
	 */
	protected void gogogo_actionPerformed(java.awt.event.ActionEvent e) throws Exception {
		super.gogogo_actionPerformed(e);
		String oldCarNumber = carNumber.getText();
		this.getUIContext().put("carNumber", oldCarNumber);
        this.getUIWindow().close();
	}

	protected void beijing_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.beijing_mouseClicked(e);
	}


	protected void tianjin_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.tianjin_mouseClicked(e);
	}

	protected void shanghai_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.shanghai_mouseClicked(e);
	}

	protected void chongqing_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.chongqing_mouseClicked(e);
	}

	protected void jiangxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.jiangxi_mouseClicked(e);
	}

	protected void hebei_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.hebei_mouseClicked(e);
	}

	protected void fujian_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.fujian_mouseClicked(e);
	}

	protected void neimenggu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.neimenggu_mouseClicked(e);
	}

	protected void shanxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.shanxi_mouseClicked(e);
	}

	protected void liaoning_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.liaoning_mouseClicked(e);
	}

	protected void henan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("ԥ");
		super.henan_mouseClicked(e);
	}

	protected void yunnan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.yunnan_mouseClicked(e);
	}

	protected void hunan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.hunan_mouseClicked(e);
	}

	protected void shandong_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("³");
		super.shandong_mouseClicked(e);
	}

	protected void jiangsu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.jiangsu_mouseClicked(e);
	}

	protected void xinjiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.xinjiang_mouseClicked(e);
	}

	protected void anhui_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.anhui_mouseClicked(e);
	}

	protected void jilin_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.jilin_mouseClicked(e);
	}

	protected void zhejiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.zhejiang_mouseClicked(e);
	}

	protected void heilongjiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.heilongjiang_mouseClicked(e);
	}

	protected void shanxi2_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.shanxi2_mouseClicked(e);
	}

	protected void guangxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.guangxi_mouseClicked(e);
	}

	protected void gansu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.gansu_mouseClicked(e);
	}

	protected void hubei_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.hubei_mouseClicked(e);
	}

	protected void guizhou_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.guizhou_mouseClicked(e);
	}

	protected void guangdong_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.guangdong_mouseClicked(e);
	}

	protected void hainan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.hainan_mouseClicked(e);
	}

	protected void ningxia_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.ningxia_mouseClicked(e);
	}

	protected void qinghai_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.qinghai_mouseClicked(e);
	}

	protected void sichuan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.sichuan_mouseClicked(e);
	}

	protected void xizang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("��");
		super.xizang_mouseClicked(e);
	}

	protected void one_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("1");
		super.one_mouseClicked(e);
	}

	protected void two_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("2");
		super.two_mouseClicked(e);
	}

	protected void three_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("3");
		super.three_mouseClicked(e);
	}

	protected void four_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("4");
		super.four_mouseClicked(e);
	}

	protected void five_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("5");
		super.five_mouseClicked(e);
	}

	protected void six_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("6");
		super.six_mouseClicked(e);
	}

	protected void seven_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("7");
		super.seven_mouseClicked(e);
	}

	protected void eight_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("8");
		super.eight_mouseClicked(e);
	}

	protected void nine_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("9");
		super.nine_mouseClicked(e);
	}

	protected void zero_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("0");
		super.zero_mouseClicked(e);
	}

	protected void q_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("Q");
		super.q_mouseClicked(e);
	}

	protected void w_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("W");
		super.w_mouseClicked(e);
	}

	protected void e_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("E");
		super.e_mouseClicked(e);
	}

	protected void r_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("R");
		super.r_mouseClicked(e);
	}

	protected void t_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("T");
		super.t_mouseClicked(e);
	}

	protected void y_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("Y");
		super.y_mouseClicked(e);
	}

	protected void u_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("U");
		super.u_mouseClicked(e);
	}

	protected void i_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("I");
		super.i_mouseClicked(e);
	}

	protected void o_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("O");
		super.o_mouseClicked(e);
	}

	protected void z_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("Z");
		super.z_mouseClicked(e);
	}

	protected void a_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("A");
		super.a_mouseClicked(e);
	}

	protected void p_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("P");
		super.p_mouseClicked(e);
	}

	protected void x_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("X");
		super.x_mouseClicked(e);
	}

	protected void s_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("S");
		super.s_mouseClicked(e);
	}

	protected void v_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("V");
		super.v_mouseClicked(e);
	}

	protected void h_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("H");
		super.h_mouseClicked(e);
	}

	protected void k_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("K");
		super.k_mouseClicked(e);
	}

	protected void j_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("J");
		super.j_mouseClicked(e);
	}

	protected void g_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("G");
		super.g_mouseClicked(e);
	}

	protected void c_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("C");
		super.c_mouseClicked(e);
	}

	protected void d_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("D");
		super.d_mouseClicked(e);
	}

	protected void f_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("F");
		super.f_mouseClicked(e);
	}

	protected void l_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("L");
		super.l_mouseClicked(e);
	}

	protected void b_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("B");
		super.b_mouseClicked(e);
	}

	protected void n_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("N");
		super.n_mouseClicked(e);
	}

	protected void m_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("M");
		super.m_mouseClicked(e);
	}

	/**
	 * �˸����ɾ�����һ���ַ�
	 */
	protected void backspace_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		super.backspace_mouseClicked(e);
		String oldCarNumber = carNumber.getText();
		String newCarNumber = "";
		if (oldCarNumber.length()!=0) {
			newCarNumber  = oldCarNumber.substring(0, oldCarNumber.length() - 1);
		}
		carNumber.setText(newCarNumber);
	}
}