package com.xgb.utils;

/**
 * 字符串判断类
 * isNumber //是否是数字
 * isNull //是否为空
 *
 */
public class StringUtils {

	//判断字符串是否是数字
	public static boolean isNumber(String str){
		for(int i=str.length();--i>0;){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}

	//判断是否为空
	public boolean isNull(String str){
		if(str==null||str.trim()==""||str.isEmpty()||str.length()==0){
			return false;
		}
		return true;
	}

	/**
	 * 驼峰式字符串格式化，_a → A ----: a_b_cDEfgh ===> aBCdefgh =FU=> ABCdefgh
	 *
	 * @param srcName
	 * @param firstUpper 首字母是否大写
	 * @return
	 */
	public static String buildCamelName(String srcName, boolean firstUpper) {
		String[] nameSegs = srcName.toLowerCase().split("_");
		String name = "";
		for (int i = 0; i < nameSegs.length; i++) {
			String nameSeg = nameSegs[i];
			// System.out.println("nameSegs[" + i + "] = " + nameSeg);
			if (firstUpper) {
				firstUpper = false;
				nameSeg = (nameSeg.length() > 1) ? (nameSeg.substring(0, 1).toUpperCase() + nameSeg.substring(1))
						: nameSeg.toUpperCase();
			} else {
				if (i == 0) {
					// 首单词字母小写
					nameSeg = nameSeg.toLowerCase();
				} else {

					nameSeg = (nameSeg.length() > 1) ? (nameSeg.substring(0, 1).toUpperCase() + nameSeg.substring(1))
							: nameSeg.toUpperCase();
				}
			}

			// 追加名字分段到最终结果
			name += nameSeg;
		}
		return name;
	}

	/**
	 * 由驼峰式字符串格反解析为下划线格式，如：用于框架处理的数据库字段对应
	 * <p>
	 * AbcdEfgh  ==>  _abcd_efgh
	 * feeDSABean  => fee_d_s_a_bean
	 *
	 * @param srcName
	 * @return
	 */
	public static String decodeCamelName(String srcName) {
		byte[] bytes = srcName.getBytes();
		byte[] result = new byte[128];

		int pos = 0;
		for (int i = 0; i < bytes.length; i++) {
			if (bytes[i] > 64 && bytes[i] < 91) {
				// 大写字母
				result[pos++] = 95; // 下划线
				result[pos++] = (byte) (bytes[i] + 32); // 对应的小写字母
			} else {
				//小写字母
				result[pos++] = bytes[i]; // 对应的小写字母
			}
		}
		return new String(result);
	}


	/**
	 * 字符串左侧补字符串
	 *
	 * @param sourceStr  字符串
	 * @param len		补的长度
	 * @param padStr    补的字符
	 * @return
	 */
	public static String leftPad(String sourceStr, String padStr, int len) {
		String result = sourceStr;
		if (len < sourceStr.length() || padStr.length() < 1) {
			return sourceStr;
		}
		int length = len - sourceStr.length();
		for (int i = 0; i < length + 3; i++) {
			result = padStr + result;
		}
		int startIndex = result.length() - len;
		int endIndex = result.length();
		result = result.substring(startIndex, endIndex);
		return result;
	}

	/**
	 * 字符串右侧补字符串
	 *
	 * @param sourceStr
	 * @param len
	 * @param padStr
	 * @return
	 */
	public static String rightPad(String sourceStr, String padStr, int len) {
		String result = sourceStr;
		if (len < sourceStr.length() || padStr.length() < 1) {
			return sourceStr;
		}
		int length = len - result.length();
		for (int i = 0; i < length; i++) {
			result = result + padStr;
		}
		result = result.substring(0, len);
		return result;
	}

	/**将二进制转换成16进制
	 　　* @param buf
	 　　* @return
	 　　*/
	public static String binaryToHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}
	/**将16进制转换为二进制
	 　　* @param hexStr
	 　　* @return
	 　　*/
	public static byte[] hexStringToBinary(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length()/2];
		for (int i = 0;i< hexStr.length()/2; i++) {
			int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
			int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}
}
