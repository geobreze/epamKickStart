package com.epam.geometry.reader;

import com.epam.geometry.exceptions.WrongDataException;

import java.util.List;

public interface Reader {
    List<String> read(String source) throws WrongDataException;
}
