package structural.composite.neural;

public class Demo {
    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        Neuron neuron2 = new Neuron();

        NeuronLayer neuronLayer = new NeuronLayer();
        NeuronLayer neuronLayer2 = new NeuronLayer();

        neuron.connectTo(neuronLayer2);
        neuronLayer.connectTo(neuron2);
    }
}
