package edu.stevens.cpe552;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.util.*;
/**
 *
 * @author dkruger
 */
public class PercentLayout implements LayoutManager2 {
    private ArrayList<PercentInfo> percentInfo;
    
    public PercentLayout() {
        percentInfo = new ArrayList<>();
    }
    @Override
    public void addLayoutComponent(Component c, Object constraint) {
        if (!(constraint instanceof PercentInfo)) {
            throw new RuntimeException("Percent Layout requires PercentInfo constraints");
        }
        
        percentInfo.add((PercentInfo)constraint);
    }

    @Override
    public Dimension maximumLayoutSize(Container c) {
        return c.getMaximumSize();
    }

    @Override
    public float getLayoutAlignmentX(Container c) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container c) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container c) {
    }

    @Override
    public void addLayoutComponent(String arg0, Component arg1) {
    }

    @Override
    public void removeLayoutComponent(Component c) {
    }

    @Override
    public Dimension preferredLayoutSize(Container c) {
        return c.getPreferredSize();
    }

    @Override
    public Dimension minimumLayoutSize(Container arg0) {
        return new Dimension(100,100);
    }

    @Override
    public void layoutContainer(Container cont) {
        Component[] components = cont.getComponents();
        System.out.println("layout component" + components.length);
        int w= cont.getWidth(), h = cont.getHeight();
        for (int i = 0; i < components.length; i++) {
            PercentInfo pi = percentInfo.get(i);
            components[i].setBounds(
                    (int)(pi.px * w + pi.dx),
                    (int)(pi.py * h + pi.dy),
                    (int)(pi.pw * w + pi.dw),
                    (int)(pi.ph * h + pi.dh));
        }
    }
    
}
