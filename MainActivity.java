<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:background="#07121A"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/display"
        android:text="0"
        android:textSize="36sp"
        android:textColor="#00FFB2"
        android:background="#222"
        android:gravity="end"
        android:padding="20dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

    <GridLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:columnCount="4"
        android:rowCount="5"
        android:padding="10dp">

        <Button android:id="@+id/btn_ac" android:text="AC" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_columnWeight="1"/>
        <Button android:text="×" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_columnWeight="1"/>
        <Button android:text="÷" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_columnWeight="1"/>
        <Button android:id="@+id/btn_equal" android:text="=" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_columnWeight="1"/>

        <!-- बाकी नंबर और बटन इसी तरह डालते जाओ -->
    </GridLayout>
</LinearLayout>
