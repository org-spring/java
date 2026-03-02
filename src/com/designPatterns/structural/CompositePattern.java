package com.designPatterns.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public static void main(String[] args) {
        // Create files
        FileSystem file1 = new File("document.pdf");
        FileSystem file2 = new File("photo.jpg");
        FileSystem file3 = new File("video.mp4");

        // Create folders
        Folder movies = new Folder("movies");
        Folder pictures = new Folder("pictures");
        Folder root = new Folder("root");

        // Add files to folders
        movies.add(file3);
        pictures.add(file2);

        // Add folders and files to root folder
        root.add(file1);
        root.add(movies);
        root.add(pictures);

        // Display the structure
        root.showDetails();
    }
}

interface FileSystem {
    void showDetails();
}

class File implements FileSystem {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println("pile: " + fileName);
    }
}

class Folder implements FileSystem {
    private String folderName;
    private List<FileSystem> contents = new ArrayList();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(FileSystem component) {
        contents.add(component);
    }

    public void remove(FileSystem component) {
        contents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("folder: " + folderName);
        for (FileSystem item : contents) {
            item.showDetails();
        }
    }
}
