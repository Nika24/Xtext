/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.entity.ui.internal.EntityActivator;

public class EntityUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EntityActivator.getInstance().getInjector("org.xtext.example.Entity");
	}

}
