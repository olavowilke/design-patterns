package br.com.cod3r.factory.sourcemaking;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        String image = args[0];
        String fileExtension = image.substring(image.indexOf('.') + 1, (image.length()));

        ImageReader reader = getImageReader(image, fileExtension);

        assert reader != null;
        DecodedImage decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }

    private static ImageReader getImageReader(String image, String fileExtension) {
        if (fileExtension.equals("gif")) {
            return new GifReader(image);
        }
        if (fileExtension.equals("jpeg")) {
            return new JpegReader(image);
        }
        return null;
    }
}