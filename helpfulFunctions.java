private void Button (){
  //goes in main activity
          button = (Button) findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
  // goes in onClick
          Intent myIntent = new Intent(v.getContext(), CHEM.class);
        startActivity(myIntent);

}
private void log(){
  Log.i(TAG, "onCreate");
}
private void convertTostring{
        //COnverts text field to String
         EditText editText = (EditText) findViewById(R.id.editText2);
        String value = editText.getText().toString();
}
