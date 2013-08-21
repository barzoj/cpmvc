package biz.cactussoft.cpmvc.emitters.cpp;

import biz.cactussoft.cpmvc.emitters.AbstractEmitter;

public class CppEmitter extends AbstractEmitter
{
	public CppEmitter() 
	{
		this.m_dataModelEmitter = new CppDataModelEmitter();
	}
}