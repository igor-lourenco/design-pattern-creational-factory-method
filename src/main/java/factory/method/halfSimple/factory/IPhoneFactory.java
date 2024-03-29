package factory.method.halfSimple.factory;

import factory.method.halfSimple.model.IPhoneAbstract;

public abstract class IPhoneFactory {

	public IPhoneAbstract orderIPhone(String level) {
		IPhoneAbstract device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhoneAbstract createIPhone(String level);
}