package watermark;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;



public class Watermark {
	
	public void showFiles(File file, String watermark, String output_image,Float opac,String col,Integer size,Integer cntrX,Integer cntrY,String rotate) throws IOException {
			
			File aFile[] = file.listFiles();
		
			int i = 0;
			for(int j= aFile.length;i<j;i++) {
				File files = aFile[i];
				File originalFile = new File(file + "\\" + files.getName());
                                System.out.println(file);
                                String text = new String(watermark);
				//File mark = new File(watermark);
				int min=1000, max=9999;
				int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
				
				String filename = "IMG-" + randomNum;
				File outputFile = new File(output_image + filename + ".jpg");
                                
                                
                                
                                addTextWatermark(text, originalFile, outputFile,opac,col,size,cntrX,cntrY,rotate);

			}
	}
	
        
    static void addTextWatermark(String text, File sourceImageFile, File destImageFile,Float opacity,String color,Integer size,Integer centerX,Integer centerY,String rotation) {
    try {
        BufferedImage sourceImage = ImageIO.read(sourceImageFile);
        Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();
       
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity);
        g2d.setComposite(alphaChannel);
        if(color=="RED"){
        g2d.setColor(Color.RED);
        }
        else if(color=="ORANGE"){
        g2d.setColor(Color.ORANGE);
        }
        else if(color=="BLACK"){
        g2d.setColor(Color.BLACK);
        }
        else if(color=="BLUE"){
        g2d.setColor(Color.BLUE);
        }
        else if(color=="PINK"){
        g2d.setColor(Color.PINK);
        }
        else if(color=="VIOLET"){
        g2d.setColor(Color.MAGENTA);
        }
        else if(color=="GRAY"){
        g2d.setColor(Color.GRAY);
        }
        else if(color=="WHITE"){
        g2d.setColor(Color.WHITE);
        }
        else if(color=="YELLOW"){
        g2d.setColor(Color.YELLOW);
        }
        else if(color=="GREEN"){
        g2d.setColor(Color.GREEN);
        }
        else{
        g2d.setColor(Color.CYAN);
        }
        g2d.setFont(new Font("Arial", Font.BOLD, size));
       
        FontMetrics fontMetrics = g2d.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text, g2d);
 
        
       if(rotation.matches("Straight")){   
        int centerx = (sourceImage.getWidth() - (int) rect.getWidth()) / 2;
        int centery = sourceImage.getHeight() / 2;
        g2d.drawString(text, centerx, centery);
        }
        
        else{
        AffineTransform at = new AffineTransform();
        at.rotate((- Math.PI / 2)/2);
        g2d.setTransform(at);
        g2d.drawString(text, centerX, centerY);
        //g2d.drawString("Hello World", -200, 50);
        }
        ImageIO.write(sourceImage, "png", destImageFile);
        g2d.dispose();
 
        System.out.println("The tex watermark is added to the image.");
 
    } catch (IOException ex) {
        System.err.println(ex);
    }
}    

        
        
	
	
	private BufferedImage resize(BufferedImage img, int height, int width) {
		Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g2d = resized.createGraphics();
		g2d.drawImage(tmp, 0, 0, null);
		g2d.dispose();
		return resized;
	}

	public static void main( String[] args ) {
   
         }
}