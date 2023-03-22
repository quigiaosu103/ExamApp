import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class DropShadowBorder extends AbstractBorder {

    private final Color color;
    private final int thickness;
    private final int radius;
    private final int shadowSize;
    private Insets insets;

    public DropShadowBorder(Color color, int thickness, int radius, int shadowSize) {
        this.color = color;
        this.thickness = thickness;
        this.radius = radius;
        this.shadowSize = shadowSize;
        insets = new Insets(shadowSize + thickness, shadowSize + thickness, shadowSize + thickness, shadowSize + thickness);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return insets;
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.top = this.insets.top;
        insets.left = this.insets.left;
        insets.bottom = this.insets.bottom;
        insets.right = this.insets.right;
        return insets;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(c.getParent().getBackground().darker());
        g2.translate(x, y);

        int r = radius + thickness / 2;
        Area round = new Area(new RoundRectangle2D.Double(0, 0, width - thickness, height - thickness, r, r));
        if (shadowSize > 0) {
            Area shadow = new Area(new RoundRectangle2D.Double(shadowSize, shadowSize, width - thickness, height - thickness, r, r));
            shadow.subtract(round);
            g2.fill(shadow);
        }

        g2.setColor(color);
        g2.fill(round);

        g2.dispose();
    }

}
