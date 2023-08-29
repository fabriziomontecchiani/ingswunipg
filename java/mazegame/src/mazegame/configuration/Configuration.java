package mazegame.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import mazegame.maze.MazeFactory;

public class Configuration {

	private static Configuration instance = null;

	private final String path = "config.properties";
	private final String key = "mazefactory";
	private Properties properties;

	private Configuration() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Configuration getInstance() {
		if (instance == null)
			instance = new Configuration();
		return instance;
	}

	@SuppressWarnings("unchecked")
	public MazeFactory getMazeFactory() {
		String classname = properties.getProperty(key);
		try {
			Class<MazeFactory> mf = (Class<MazeFactory>) Class.forName(classname);
			return mf.getDeclaredConstructor().newInstance();
		} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}

	}
}
