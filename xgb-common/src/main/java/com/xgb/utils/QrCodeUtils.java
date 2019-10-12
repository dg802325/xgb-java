package com.xgb.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * 二维码生成
 */
public class QrCodeUtils {

    private static Logger logger = LoggerFactory.getLogger(QrCodeUtils.class);

    /**
     * 生成二维码二维码
     * @param url 真实地址
     * @param msg 显示文字
     * @param width 二维码宽度
     * @param height 二维码高度
     * @param logoWidth logo宽度
     * @param logoHeight logo宽度
     * @param logoSize logo文字大小
     * @return
     */
    public BufferedImage getAgentQrCode(String url, String msg, Integer width, Integer height, Integer logoWidth, Integer logoHeight, Integer logoSize) {
        BufferedImage image = null;
        try {
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            hints.put(EncodeHintType.MARGIN, 1);  //控制二维码白边宽度
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);// 设置QR二维码的纠错级别（H为最高级别）具体级别信息
            BitMatrix bitMatrix = multiFormatWriter.encode(url, BarcodeFormat.QR_CODE, width, height, hints);
            image = MatrixToImageWriter.toBufferedImage(bitMatrix);// 生成二维码
            Graphics2D g = image.createGraphics();

            // 画msg的背景
            int widthlog = image.getWidth();
            int heightlog = image.getHeight();
            int agentLogoX = (width - logoWidth) / 2;
            int agentLogoY = (height - logoHeight) / 2;
            g.setColor(Color.WHITE);  //设置画笔颜色

            // 添加二维码中心处的 msg
            g.fillRect(agentLogoX, agentLogoY, logoWidth, logoHeight);
            g.setColor(Color.BLACK);
            g.setBackground(Color.white);
            Font font = new Font("黑体，Arial", Font.BOLD, logoSize); // 字体大小
            g.setFont(font);
            FontMetrics metrics = new FontMetrics(font) {
            };
            Rectangle2D bounds = metrics.getStringBounds(msg, null);
            int textWidth = (int) bounds.getWidth();
            int textHeight = (int) bounds.getHeight();
            int agentTxtX = (width - textWidth) / 2;
            int agentTxtY = (height + textHeight / 2) / 2;
            g.drawString(msg, agentTxtX, agentTxtY);
            g.dispose();
            image.flush();
        } catch (Exception e) {
            logger.error("生成二维码图异常," + e.getMessage(), e);
        }
        return image;
    }
}
