package com.thizzer.jtouchbar;

import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarButton;

public class JTouchBarTestUtils {

	public static JTouchBar constructTouchBar() {
		JTouchBar jTouchBar = new JTouchBar();
        jTouchBar.setCustomizationIdentifier(JTouchBarTestUtils.class.getName());
        
		// flexible space
		jTouchBar.getItems().add( new TouchBarItem( TouchBarItem.NSTouchBarItemIdentifierFlexibleSpace ) );
		
		// button
		TouchBarItem touchBarButtonItem = new TouchBarItem("T1");
		touchBarButtonItem.setCustomizationAllowed(true);
		
		TouchBarButton touchBarButton = new TouchBarButton();
		touchBarButton.setTitle("Button");
		touchBarButtonItem.setView(touchBarButton);
        
		jTouchBar.getItems().add( touchBarButtonItem );
		
        return jTouchBar;
	}
}
