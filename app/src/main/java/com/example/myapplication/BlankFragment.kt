<!-- activity_settings.xml -->
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="16dp">

<TextView
android:id="@+id/settings_title"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Settings"
android:textSize="20sp"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
android:padding="8dp" />

<Switch
android:id="@+id/notification_switch"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Notification"
app:layout_constraintTop_toBottomOf="@id/settings_title"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_margin="16dp" />

<Switch
android:id="@+id/dark_mode_switch"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Dark Mode"
app:layout_constraintTop_toBottomOf="@id/notification_switch"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_margin="16dp" />


