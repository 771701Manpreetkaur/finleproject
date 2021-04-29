package com.example.onlineregistration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    private Context mCtx;
    private List<Student> studentList;

    public StudentAdapter(Context mCtx, List<Student> list) {
        this.mCtx = mCtx;
        this.studentList = list;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( mCtx );
        View view = inflater.inflate( R.layout.activity_list_view,null );
        StudentViewHolder holder = new StudentViewHolder( view );

        return holder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student student = studentList.get( position );

        holder.tvId.setText( "Id : " + student.getId() );
        holder.tvFullName.setText( "Name : " + student.getFullName() );
        holder.tvEmail.setText("Email : " + student.getEmail() );
        holder.tvPhone.setText( "Phone : " +  student.getPhone()  );
        holder.tvStudentNumber.setText( "Student Number : " +student.getStudentNumber() );
        holder.tvPassword.setText( "Password : " + student.getPassword() );


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class StudentViewHolder extends  RecyclerView.ViewHolder{
        TextView tvId, tvFullName, tvPhone,tvEmail,tvStudentNumber, tvPassword;
        public StudentViewHolder(View itemView) {
            super( itemView );
            tvId = itemView.findViewById( R.id.tvId );
            tvFullName = itemView.findViewById( R.id.tvFullName );
            tvPhone = itemView.findViewById( R.id.tvPhone );
            tvEmail = itemView.findViewById( R.id.tvEmail );
            tvStudentNumber = itemView.findViewById( R.id.tvStudentNumber );
            tvPassword = itemView.findViewById( R.id.tvPassword );


        }
    }
}
