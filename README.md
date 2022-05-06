
# Rapport

Jag har lagt till en RecyclerView och en ArrayList. Sedan har jag lagt till en adapter och kopplat ihop denna 
med RecyclerView:n. 
```
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyAdapter();
        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
    }
```
Jag har skapat fyra nya klasser: MyViewHolder, MyAdapter, Mountains och Auxdata. Jag har även gett appen
tillgång till internet genom att jag gå in i filen AndroidManifest.xml och lägga till en uses-permission.
Därefter har jag lagt till en url med JSON i MainActivity och parsat JSON med hjälp utav GSON. 

```
   @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Mountains mountains[];
        mountains = gson.fromJson(json, Mountains[].class);
        List<Mountains> newMountains = new ArrayList<>();
        for (int i = 0; i < mountains.length; i++) {
            Log.d("MainActivity ==>", "Hittade ett berg:" +mountains[i].getName());
            newMountains.add(mountains[i]);
        }
        Log.d("MainActivity", json);
        adapter.setMountains(newMountains);
        adapter.notifyDataSetChanged();
    }
```


![](picture.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
