package Helpers;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.cfi.chhavi.codeforindia.DeliveryFormActivity;
        import com.cfi.chhavi.codeforindia.MainActivity;
        import com.cfi.chhavi.codeforindia.R;
        import com.cfi.chhavi.codeforindia.School;

        import java.io.Serializable;
        import java.util.ArrayList;


/**
 * Created by shikharkhetan on 7/15/15.
 */
public class SchoolListAdapter extends RecyclerView.Adapter<SchoolListAdapter.ViewHolder>   {

    int resId;
    ArrayList<School> schools;
    Context context;
    public SchoolListAdapter(int resId, ArrayList<School> schools, Context context) {
        this.resId = resId;
        this.schools = schools;
        this.context = context;
    }
    int position;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(resId, parent, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.schoolCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(schools.get(position).isDelivered()) {
                    //Do Nothing
                }
                else {
                    Intent i = new Intent();
                    i.setClass(context, DeliveryFormActivity.class);
                    //i.putExtra("school", schools.get(position));
                    context.startActivity(i);
                }
            }
        });
        if(schools.get(position).isDelivered()) {
            holder.schoolCard.setBackgroundColor(context.getResources().getColor(R.color.grey_300));
            holder.schoolCard.setAlpha(0.30f);
        }
        holder.schoolName.setText(schools.get(position).getSchoolName());
        holder.schoolAddress.setText(School.address);
        this.position = position;



    }

    @Override
    public int getItemCount() {
        return schools.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public CardView schoolCard;
        public TextView schoolName;
        public TextView schoolAddress;
        public ViewHolder(View itemView) {
            super(itemView);
            schoolCard = (CardView) itemView.findViewById(R.id.cv);
            schoolName = (TextView) itemView.findViewById(R.id.schoolName);
            schoolAddress = (TextView) itemView.findViewById(R.id.schoolAddress);
        }
    }
}