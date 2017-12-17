package application;
import javafx.beans.property.*;
import javafx.scene.chart.ValueAxis;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Notepad
{
	/*
	 * -JavaFX properties store the inner state of a control
	 * 	and allow us to listen to state change from JavaFX UI controls
	 * -That means you will be able to perform an action when the value changes.
	 * -Types
	 * 	+Read/Writable
	 * 	+Read-only
	 * 
	 * Import javafx.beans.property.*
	 * 
	 * Read/Write
	 * javafx.beans.property.SimpleStringProperty
	 * javafx.beans.property.SimpleDoubleProperty
	 * javafx.beans.property.SimpleintegerProperty
	 * javafx.beans.property.SimpleBooleanProperty
	 * 
	 * Read Only
	 * 
	 * javafx.beans.property.ReadOnlyBooleanWrapper
	 * javafx.beans.property.ReadOnlyintegerWrapper
	 * javafx.beans.property.ReadOnlyDoubleWrapper
	 * javafx.beans.property.ReadOnlyStringWrapper
	 * 
	 * 
	 * 
	 * Example:
	 * 
	 */

	public void ReadWrite()
	{
		StringProperty Val2 = new SimpleStringProperty("Javafx");
		Val2.set("JavaFx Tutorial");
		System.out.println("Changed StringProperty"+Val2.get());
		System.out.println(Val2);
	}
	public void ReadOnly()
	{
		ReadOnlyStringWrapper Value = new ReadOnlyStringWrapper("Javafx");
		ReadOnlyStringProperty readOnlyValue= Value.getReadOnlyProperty();
	}
	
}
