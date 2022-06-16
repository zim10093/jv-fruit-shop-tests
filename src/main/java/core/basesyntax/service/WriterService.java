package core.basesyntax.service;

import java.nio.file.Path;
import java.util.List;

public interface WriterService {
    void writeToFile(List<String> lines, Path path);
}