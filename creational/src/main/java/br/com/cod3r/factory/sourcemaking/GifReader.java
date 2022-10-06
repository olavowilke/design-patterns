package br.com.cod3r.factory.sourcemaking;

public class GifReader implements ImageReader {

    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
