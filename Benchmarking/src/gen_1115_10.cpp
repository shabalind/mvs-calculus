  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f72(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[2];
    std::vector<std::vector<double>> v3 = v0;
    v3[2] = v2;
    v3[0] = v2;
    const std::vector<double> v12 = v3[1];
    std::vector<std::vector<double>> v1 = v0;
    v3[2] = v2;
    std::vector<std::vector<double>> v5 = v3;
    const std::vector<double> v7 = v5[2];
    std::vector<double> v6 = v2;
    std::vector<double> v4 = v12;
    std::vector<double> v9 = v7;
    const std::vector<double> v11 = v1[1];
    const std::vector<double> v10 = v3[0];
    v4 = v7;
    v3[2] = v12;
    const std::vector<double> v18 = v0[0];
    v5[2] = v12;
    std::vector<double> v20 = v11;
    const double v24 = v10[0];
    v4 = v7;
    v20[0] = v24;
    std::vector<std::vector<double>> v15 = v1;
    const std::vector<std::vector<std::vector<double>>> v19 { v3, v0, v15 };
    v15[1] = v9;
    double v17 = v24;
    v15[1] = v6;
    const std::vector<std::vector<double>> v30 = v19[0];
    const std::vector<std::vector<double>> v16 = v19[0];
    v3[1] = v20;
    v3[0] = v6;
    std::vector<std::vector<std::vector<double>>> v31 = v19;
    const double v22 = v18[0];
    v31[2] = v5;
    v4[0] = v17;
    v20[0] = v22;
    std::vector<std::vector<std::vector<double>>> v36 = v31;
    v36[2] = v16;
    v1[0] = v12;
    v36[2] = v30;
    v3[0] = v20;
    v9[0] = v22;
    v15[0] = v4;
    const std::vector<std::vector<double>> v46 = v36[0];
    return v46;
  }
  std::vector<std::vector<double>> f67(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[0];
    std::vector<double> v4 = v2;
    v4 = v2;
    std::vector<std::vector<double>> v3 = v0;
    const double v5 = v2[0];
    std::vector<double> v1 = v2;
    v3[0] = v4;
    std::vector<std::vector<double>> v8 = v0;
    v8[0] = v1;
    const double v7 = v4[0];
    v1[0] = v5;
    std::vector<std::vector<double>> v9 = v3;
    const std::vector<double> v12 = v8[1];
    const double v15 = v2[0];
    v3[0] = v12;
    v1[0] = v15;
    v4[0] = v15;
    v4[0] = v5;
    v4[0] = v7;
    std::vector<std::vector<double>> v34 = v9;
    v9[1] = v12;
    return v34;
  }
  std::vector<std::vector<double>> f63(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v2 = f72(v0);
    std::vector<std::vector<double>> v1 = v2;
    const std::vector<std::vector<double>> v6 = f72(v1);
    const std::vector<std::vector<double>> v3 = f72(v1);
    const std::vector<std::vector<double>> v9 = f72(v0);
    const std::vector<std::vector<double>> v5 = f72(v3);
    const std::vector<std::vector<double>> v11 = f72(v5);
    const std::vector<double> v12 = v3[1];
    const std::vector<std::vector<double>> v21 = f72(v5);
    const std::vector<std::vector<double>> v8 = f72(v1);
    std::vector<double> v36 = v12;
    std::vector<double> v20 = v12;
    const double v10 = v12[0];
    v36[0] = v10;
    const std::vector<std::vector<double>> v18 = f72(v0);
    const std::vector<std::vector<double>> v24 = f72(v9);
    const double v44 = v36[0];
    double v28 = v44;
    v1[1] = v20;
    const std::vector<std::vector<std::vector<double>>> v43 { v6, v21, v1, v11, v18, v21, v8 };
    std::vector<std::vector<std::vector<double>>> v101 = v43;
    const std::vector<std::vector<double>> v121 = v101[4];
    v20[0] = v28;
    v101[6] = v24;
    return v121;
  }
  std::vector<std::vector<double>> f50(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v7 = f67(v0);
    std::vector<std::vector<double>> v2 = v7;
    const std::vector<std::vector<double>> v5 = f67(v7);
    const std::vector<double> v1 = v7[0];
    const std::vector<std::vector<double>> v8 = f67(v2);
    v2[0] = v1;
    const std::vector<std::vector<double>> v9 = f67(v8);
    const std::vector<double> v11 = v5[1];
    const std::vector<double> v17 = v5[0];
    const double v10 = v1[0];
    double v15 = v10;
    const double v18 = v10 * v15;
    v2[0] = v1;
    v2[0] = v17;
    v2[0] = v11;
    const std::vector<std::vector<double>> v21 = f67(v8);
    std::vector<double> v32 = v17;
    v2[0] = v17;
    v2[0] = v17;
    std::vector<std::vector<double>> v40 = v9;
    v40[0] = v32;
    v32[0] = v18;
    v2[0] = v32;
    const std::vector<double> v57 = v21[1];
    v40[1] = v57;
    return v40;
  }
  std::vector<std::vector<double>> f43(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[0];
    std::vector<std::vector<double>> v1 = v0;
    const std::vector<double> v8 = v1[0];
    std::vector<double> v7 = v4;
    std::vector<std::vector<double>> v6 = v1;
    const std::vector<double> v3 = v6[0];
    v6[0] = v3;
    v1[0] = v7;
    v1[0] = v8;
    v6[1] = v8;
    const std::vector<double> v10 = v0[0];
    v6[1] = v10;
    const std::vector<std::vector<double>> v16 = f67(v6);
    const std::vector<double> v17 = v6[1];
    const std::vector<std::vector<double>> v20 = f67(v1);
    v1[1] = v17;
    const std::vector<std::vector<double>> v15 = f67(v1);
    const std::vector<std::vector<double>> v42 = f67(v16);
    const std::vector<std::vector<double>> v32 = f67(v15);
    const std::vector<std::vector<double>> v29 = f67(v42);
    const std::vector<std::vector<std::vector<double>>> v34 { v29, v32, v20 };
    const std::vector<std::vector<double>> v92 = v34[0];
    const std::vector<std::vector<double>> v104 = f67(v92);
    v7 = v8;
    return v104;
  }
  std::vector<std::vector<double>> f38(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f43(v0);
    const std::vector<std::vector<double>> v3 = f43(v6);
    return v3;
  }
  std::vector<std::vector<double>> f33(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v5 = f38(v0);
    const std::vector<std::vector<double>> v4 = f38(v5);
    const std::vector<double> v6 = v5[0];
    std::vector<std::vector<double>> v10 = v4;
    const std::vector<std::vector<double>> v7 = f38(v10);
    const std::vector<std::vector<double>> v11 = f50(v7);
    const std::vector<std::vector<double>> v3 = f43(v7);
    v10[0] = v6;
    v10[0] = v6;
    const std::vector<std::vector<std::vector<double>>> v18 { v10, v5, v11, v4, v4, v3, v11 };
    const std::vector<std::vector<double>> v17 = v18[1];
    std::vector<std::vector<std::vector<double>>> v31 = v18;
    v31[2] = v17;
    const std::vector<std::vector<double>> v148 = v31[4];
    return v148;
  }
  std::vector<std::vector<double>> f2(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v2 = f33(v1);
    const std::vector<std::vector<double>> v21 = f67(v1);
    const std::vector<std::vector<std::vector<double>>> v38 { v1, v2, v21 };
    std::vector<std::vector<std::vector<double>>> v31 = v38;
    std::vector<std::vector<std::vector<double>>> v15 = v31;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v57 { v38, v15, v31, v38, v31, v15 };
    const std::vector<std::vector<std::vector<double>>> v54 = v57[3];
    v15[1] = v21;
    const std::vector<std::vector<double>> v74 = v54[1];
    return v74;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v3 = v1[1];
    const std::vector<std::vector<double>> v10 = f2(v0, v1);
    std::vector<double> v8 = v3;
    const std::vector<double> v11 = v10[1];
    std::vector<std::vector<double>> v19 = v0;
    const double v16 = v11[0];
    v19[2] = v8;
    std::vector<double> v21 = v11;
    std::vector<std::vector<double>> v18 = v19;
    double v35 = v2;
    const std::vector<std::vector<double>> v32 = f50(v1);
    const std::vector<double> v38 = v32[1];
    std::vector<double> v49 = v38;
    const double v46 = v21[0];
    v49[0] = v46;
    v18[1] = v3;
    const double v74 = v49[0];
    const std::vector<double> v63 { v16, v35, v74, v74 };
    const std::vector<std::vector<double>> v73 = f63(v18);
    std::vector<double> v50 = v63;
    const std::vector<double> v66 = v73[2];
    v21 = v49;
    const double v91 = v50[0];
    const double v108 = v91 * v16;
    v49[0] = v35;
    v21 = v66;
    return v108;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 } });
    double v2(5.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
