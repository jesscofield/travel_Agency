package com.travelagency.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.travelagency.model.Trip;

public class FileService {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void saveTripsToFile(List<Trip> trips, String fileName) {
        try (Writer writer = new FileWriter(fileName)) {
            gson.toJson(trips, writer);
            System.out.println("Trips saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving trips to file: " + e.getMessage());
        }
    }

    public List<Trip> loadTripsFromFile(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            Type tripListType = new TypeToken<List<Trip>>() {}.getType();
            return gson.fromJson(reader, tripListType);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null;
    }
}