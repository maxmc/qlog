package com.quui.qlog.plugin.views;

import org.w3c.dom.Document;

import com.quui.qlog.swing.data.IGuiMediator;
import com.quui.utils.util.IDestroyable;

/**
 * Mediator for the Eclipse view.
 * @author Fabian Steeg (fsteeg)
 */
public final class EclipseMediator implements IGuiMediator {

    private QLogView view;

    /**
     * @param logView The view to update depending on incoming messages
     */
    public EclipseMediator(final QLogView logView) {
        this.view = logView;
    }

    /**
     * {@inheritDoc}
     * @see com.quui.qlog.swing.data.IGuiMediator#onCommand(java.lang.String)
     */
    @Override
    public void onCommand(final String command) {
        System.out.println("onCommand: " + command);
        if (command.equals("clear")) {
            view.clear();
        }
    }

    /**
     * {@inheritDoc}
     * @see com.quui.qlog.swing.data.IGuiMediator#onMessage(java.lang.String,
     *      java.lang.String)
     */
    @Override
    public void onMessage(final String message, final String color) {
        view.update(message, color);
    }

    /**
     * {@inheritDoc}
     * @see com.quui.qlog.swing.data.IGuiMediator#onLogin(java.lang.String)
     */
    @Override
    public void onLogin(final String name) {}

    /**
     * {@inheritDoc}
     * @see com.quui.qlog.swing.data.IGuiMediator#onTree(org.w3c.dom.Document)
     */
    @Override
    public void onTree(final Document doc) {}

    /**
     * {@inheritDoc}
     * @see com.quui.qlog.swing.data.IGuiMediator#setDataTransformer(com.quui.utils.util.IDestroyable)
     */
    @Override
    public void setDataTransformer(final IDestroyable dataHandler) {}

    /**
     * {@inheritDoc}
     * @see com.quui.utils.util.IDestroyable#destroy()
     */
    @Override
    public void destroy() {}

}
