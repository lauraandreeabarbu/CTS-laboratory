package ro.ase.csie.g.dp.composite;

public abstract class AbstractNode implements NPCActions {

	public abstract void addNode(AbstractNode node);
	public abstract void removeNode(AbstractNode node);
	public abstract AbstractNode getNode(int index);
}
