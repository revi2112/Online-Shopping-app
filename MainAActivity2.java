
public class MainActivity2 extends AppCompatActivity {
    Gallery simpleGallery;
    CustomGalleryAdapter customGalleryAdapter;
    ImageView selectedImageView;

    //TURMERIC
    int
            images0[] = {R.drawable.tumeric, R.drawable.tumeric1, R.drawable.tumeric2, R.drawable.tumeric3, R.drawable.tumeric4};
    //PAPAYA
    int
            images1[] = {R.drawable.papaya, R.drawable.papaya3, R.drawable.papaya2, R.drawable.papaya1, R.drawable.papaya4};
    //COCONUT
    int
            images2[] = {R.drawable.coconut2, R.drawable.coconut1, R.drawable.coconut3, R.drawable.coconut, R.drawable.coconut4};
    //SPINACH
    int
            images3[] = {R.drawable.spinach, R.drawable.spinach1, R.drawable.spinach2, R.drawable.spinach3, R.drawable.spinach4};
    //FISH
    int
            images4[] = {R.drawable.fish, R.drawable.fish1, R.drawable.fish2, R.drawable.fish4, R.drawable.fish3};
    //TOMATTO
    int
            images5[] = {R.drawable.tomato1, R.drawable.tomato2, R.drawable.tomato3, R.drawable.tomato4, R.drawable.tomato};
    //CARROT

    int
            images6[] = {R.drawable.carrot, R.drawable.carrot2, R.drawable.carrot1, R.drawable.carrot4, R.drawable.carrot3};
    //NUTMEG
    int
            images7[] = {R.drawable.nutmeg, R.drawable.nutmeg3, R.drawable.nutmeg2, R.drawable.nutmeg1, R.drawable.nutmeg4};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        int pos1 = 0;
        String name = i.getStringExtra("name");
        String desc = i.getStringExtra("desc");
        String price = i.getStringExtra("price");
        String off = i.getStringExtra("off");
        int pos = i.getIntExtra("pos", pos1);
        int picture = i.getIntExtra("picture", R.drawable.fish);
        TextView t1 = findViewById(R.id.textView3);
        TextView t2 = findViewById(R.id.textView4);
        TextView t3 = findViewById(R.id.textView6);
        TextView t4 = findViewById(R.id.textView7);
        TextView t5 = findViewById(R.id.textView9);
        ImageView iv = findViewById(R.id.imageView2);
        Button b = findViewById(R.id.button2);
        iv.setImageResource(picture);
        t1.setText(name);
        t2.setText(desc);
        t3.setText(price);
        t4.setText("(Inclusive of all taxes)");
        t5.setText(off);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  count++;
                Intent i2 = new Intent(getApplicationContext(),Form.class);
                i2.putExtra("name",name);
                i2.putExtra("desc",desc);
                i2.putExtra("price",price);
                //i2.putExtra("count",count);
                //i2.putExtra("pos",pos );
                startActivity(i2);
            }
        });


        if (pos == 0) {
            simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
            selectedImageView = (ImageView) findViewById(R.id.imageView2);
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images0);
            simpleGallery.setAdapter(customGalleryAdapter);
            simpleGallery.setSpacing(10);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images0[position]);
                }
            });


        }

        if (pos == 1) {
            simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
            selectedImageView = (ImageView) findViewById(R.id.imageView2);
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images1);
            simpleGallery.setAdapter(customGalleryAdapter);
            simpleGallery.setSpacing(10);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images1[position]);
                }
            });


        }

        if (pos == 2) {
            simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
            selectedImageView = (ImageView) findViewById(R.id.imageView2);
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images2);
            simpleGallery.setAdapter(customGalleryAdapter);
            simpleGallery.setSpacing(10);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images2[position]);
                }
            });


        }

        if (pos == 3) {
            simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
            selectedImageView = (ImageView) findViewById(R.id.imageView2);
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images3);
            simpleGallery.setAdapter(customGalleryAdapter);
            simpleGallery.setSpacing(10);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images3[position]);
                }
            });


        }

        if (pos == 4) {
            simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
            selectedImageView = (ImageView) findViewById(R.id.imageView2);
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images4);
            simpleGallery.setAdapter(customGalleryAdapter);
            simpleGallery.setSpacing(10);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images4[position]);
                }
            });
        }

            if (pos == 5) {
                simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
                selectedImageView = (ImageView) findViewById(R.id.imageView2);
                customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images5);
                simpleGallery.setAdapter(customGalleryAdapter);
                simpleGallery.setSpacing(10);
                simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        selectedImageView.setImageResource(images5[position]);
                    }
                });


            }
            if (pos == 6) {
                simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
                selectedImageView = (ImageView) findViewById(R.id.imageView2);
                customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images6);
                simpleGallery.setAdapter(customGalleryAdapter);
                simpleGallery.setSpacing(10);
                simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        selectedImageView.setImageResource(images6[position]);
                    }
                });

            }
            if (pos == 7) {
                simpleGallery = (Gallery) findViewById(R.id.simpleGallery);
                selectedImageView = (ImageView) findViewById(R.id.imageView2);
                customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images7);
                simpleGallery.setAdapter(customGalleryAdapter);
                simpleGallery.setSpacing(10);
                simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        selectedImageView.setImageResource(images7[position]);
                    }
                });

            }
        }
    }






