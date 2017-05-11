/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.EntityRuntimeModule;
import org.xtext.example.EntityStandaloneSetup;
import org.xtext.example.ide.EntityIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EntityIdeSetup extends EntityStandaloneSetup {
  @Override
  public Injector createInjector() {
    EntityRuntimeModule _entityRuntimeModule = new EntityRuntimeModule();
    EntityIdeModule _entityIdeModule = new EntityIdeModule();
    return Guice.createInjector(Modules2.mixin(_entityRuntimeModule, _entityIdeModule));
  }
}