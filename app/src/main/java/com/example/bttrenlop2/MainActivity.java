package com.example.bttrenlop2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private WordViewHolder mViewHolder;
    private LinkedList<NewsView> mNewsList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewsList.add(new NewsView(R.drawable.ip13, "Iphone 13 giảm giá mạnh", "Vào ngày 28/2/2023 giá Iphone 13 giảm không phanh", "Vào ngày 28/2/2023 giá Iphone 13 giảm không phanh chỉ còn một nửa so với lúc vừa ra mắt."));
        mNewsList.add(new NewsView(R.drawable.ip14, "Apple ra mắt Iphone 14", "Iphone 14 chính thức được ra mắt đầu tháng 4/2023", "Iphone 14 chính thức được ra mắt đầu tháng 4/2023, theo dự định giá khởi điểm sẽ là 990$."));
        mNewsList.add(new NewsView(R.drawable.ipse, "Iphone SE sắp bị khai tử?", "Google đi điến quyết định khai tử Iphone SE", "Google đi điến quyết định khai tử Iphone SE do doanh thu từ mặt hàng này không như mong đợi."));
        mNewsList.add(new NewsView(R.drawable.ipxr, "Tin vui cho Iphone XR", "Iphone XR vẫn sẽ được cập nhật", "Iphone XR vẫn sẽ được cập nhật phiên bản IOS 16.0 trở lên. Điều này dẫn đến việc Iphone SE vẫn sẽ được kéo dài tuổi thọ của mình"));
        mNewsList.add(new NewsView(R.drawable.realme, "Realme là Iphone Trung Quốc?", "Người dùng đang nghi ngờ về Realme", "Người dùng đang nghi ngờ về dòng sản phẩm sau này của Realme do thiết kế quá giống Iphone của Apple"));
        mNewsList.add(new NewsView(R.drawable.realme9, "Realme 9 sẽ là bản nâng cấp của Realme 8", "Realme 9 đang rục rịch ra mắt", "Realme 9 đang rục rịch ra mắt người tiêu dùng với thiết kế hoàn toàn mới và độc lạ"));
        mNewsList.add(new NewsView(R.drawable.samsungs21, "So sánh Samsung S21 và S21 Ultra", "Hiệu năng làm việc của S21 và S21 Ultra", "Hiệu năng làm việc của S21 và S21 Ultra có sự khác biệt rõ rệt do sử dụng hai con chip xửa lý khác nhau"));
        mNewsList.add(new NewsView(R.drawable.samsunga51,"Samsung A51 - một lựa chọn tốt", "Có khôn ngoan nếu mua Samsung A51", "Có khôn ngoan nếu mua Samsung A51 khi hiệu năng của các điện thoại cùng mức giá không bằng A51"));

        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mNewsList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}