package rx_activity_result;

import android.content.Intent;
import android.support.annotation.Nullable;

import java.io.Serializable;

public interface OnResult extends Serializable {
    void response(int resultCode, @Nullable Intent data);
}
