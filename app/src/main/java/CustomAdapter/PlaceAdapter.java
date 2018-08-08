package CustomAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ajaykumarsaini.udacitytourguide.R;

import java.util.ArrayList;
import ModelClass.PlaceInfo;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.CustomViewHolder> {

    //The context of view
    private Context mContext;

    //Arraylist to hold the Place item list
    private ArrayList<PlaceInfo> placeItemList;

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.list_item, parent, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // getting place for specific position
        PlaceInfo placeInfo = placeItemList.get(position);

        //Binding the data with the concerned views
        holder.placeImg.setImageResource(placeInfo.getThumbnail());
        Log.d("data received", "onBindViewHolder" + placeInfo.getPlaceName());
        holder.placeNameHeading.setText(placeInfo.getPlaceName());
        holder.placeDetails.setText(placeInfo.getPlaceDetails());
    }

    @Override
    public int getItemCount() {
        return placeItemList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView placeImg;
        TextView placeNameHeading;
        TextView placeDetails;

        public CustomViewHolder(View itemView){
            super(itemView);
            this.placeImg = itemView.findViewById(R.id.placeImageView);
            this.placeNameHeading = itemView.findViewById(R.id.placeNameHeading);
            this.placeDetails = itemView.findViewById(R.id.placeDetail);
        }

    }

    // getting the place list and the context
    public PlaceAdapter(Context mContext, ArrayList<PlaceInfo> placeItemList) {
        this.mContext = mContext;
        this.placeItemList = placeItemList;
    }
}
