package MVP.Model;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface ImplSerialize{
    void createFile(Human human) throws IOException;
    void write(Human human) throws Exception;
}
