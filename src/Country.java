public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;

    public Country(String code, String name, String continent, String region) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
    }
    public String getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public String getContinent()
    {
        return continent;
    }
    public String getRegion()
    {
        return region;
    }
}
