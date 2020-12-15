/**
 * 车牌号图形化输入UI
 * 		addCharacter() 追加字符到车牌号后面
 * 		gogogo_actionPerformed() 点击上屏的操作
 * 		backspace_mouseClicked() 删除最后一个字符的操作
 * 
 * @author Veeja.Liu:veejaliu@gmail.com 2020年12月15日08:57:12 爱阁瑞奇
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
	 * 将字符追加到车牌号的最后，每个文字或者字母都要调用这个方法来在车牌号的最后追加字符
	 * 
	 * @param string
	 */
	private void addCharacter(String string) {
		String oldCarNumber = carNumber.getText();
		String newCarNumber = oldCarNumber + string;
		carNumber.setText(newCarNumber);
	}
	
	/**
	 * 输入完后的跳转，将车牌号字符串返回
	 */
	protected void gogogo_actionPerformed(java.awt.event.ActionEvent e) throws Exception {
		super.gogogo_actionPerformed(e);
		String oldCarNumber = carNumber.getText();
		this.getUIContext().put("carNumber", oldCarNumber);
        this.getUIWindow().close();
	}

	protected void beijing_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("京");
		super.beijing_mouseClicked(e);
	}


	protected void tianjin_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("津");
		super.tianjin_mouseClicked(e);
	}

	protected void shanghai_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("沪");
		super.shanghai_mouseClicked(e);
	}

	protected void chongqing_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("渝");
		super.chongqing_mouseClicked(e);
	}

	protected void jiangxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("赣");
		super.jiangxi_mouseClicked(e);
	}

	protected void hebei_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("冀");
		super.hebei_mouseClicked(e);
	}

	protected void fujian_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("闽");
		super.fujian_mouseClicked(e);
	}

	protected void neimenggu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("蒙");
		super.neimenggu_mouseClicked(e);
	}

	protected void shanxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("晋");
		super.shanxi_mouseClicked(e);
	}

	protected void liaoning_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("辽");
		super.liaoning_mouseClicked(e);
	}

	protected void henan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("豫");
		super.henan_mouseClicked(e);
	}

	protected void yunnan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("云");
		super.yunnan_mouseClicked(e);
	}

	protected void hunan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("湘");
		super.hunan_mouseClicked(e);
	}

	protected void shandong_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("鲁");
		super.shandong_mouseClicked(e);
	}

	protected void jiangsu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("苏");
		super.jiangsu_mouseClicked(e);
	}

	protected void xinjiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("新");
		super.xinjiang_mouseClicked(e);
	}

	protected void anhui_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("皖");
		super.anhui_mouseClicked(e);
	}

	protected void jilin_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("吉");
		super.jilin_mouseClicked(e);
	}

	protected void zhejiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("浙");
		super.zhejiang_mouseClicked(e);
	}

	protected void heilongjiang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("黑");
		super.heilongjiang_mouseClicked(e);
	}

	protected void shanxi2_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("陕");
		super.shanxi2_mouseClicked(e);
	}

	protected void guangxi_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("桂");
		super.guangxi_mouseClicked(e);
	}

	protected void gansu_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("甘");
		super.gansu_mouseClicked(e);
	}

	protected void hubei_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("鄂");
		super.hubei_mouseClicked(e);
	}

	protected void guizhou_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("贵");
		super.guizhou_mouseClicked(e);
	}

	protected void guangdong_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("粤");
		super.guangdong_mouseClicked(e);
	}

	protected void hainan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("琼");
		super.hainan_mouseClicked(e);
	}

	protected void ningxia_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("宁");
		super.ningxia_mouseClicked(e);
	}

	protected void qinghai_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("青");
		super.qinghai_mouseClicked(e);
	}

	protected void sichuan_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("川");
		super.sichuan_mouseClicked(e);
	}

	protected void xizang_mouseClicked(java.awt.event.MouseEvent e) throws Exception {
		addCharacter("藏");
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
	 * 退格键，删除最后一个字符
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