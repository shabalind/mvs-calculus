  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f103(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<double> v4 = v0[0];
    std::vector<std::vector<double>> v3 = v1;
    const std::vector<double> v2 = v3[0];
    std::vector<double> v7 = v2;
    v3[0] = v7;
    const double v6 = v4[0];
    v7[0] = v6;
    std::vector<std::vector<double>> v9 = v3;
    const std::vector<std::vector<std::vector<double>>> v20 { v9, v9, v0, v3, v1, v9, v0 };
    v9[0] = v4;
    const double v13 = v4[0];
    v7[0] = v13;
    v3 = v1;
    const double v32 = v2[0];
    std::vector<std::vector<std::vector<double>>> v21 = v20;
    std::vector<std::vector<std::vector<double>>> v29 = v21;
    std::vector<std::vector<std::vector<double>>> v41 = v29;
    const std::vector<std::vector<double>> v67 = v41[3];
    v7[0] = v13;
    v7[0] = v32;
    return v67;
  }
  std::vector<std::vector<double>> f97(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[0];
    const std::vector<std::vector<double>> v5 = f103(v0, v0);
    std::vector<std::vector<double>> v7 = v0;
    std::vector<std::vector<double>> v8 = v7;
    std::vector<std::vector<double>> v1 = v0;
    std::vector<std::vector<double>> v4 = v0;
    v4[0] = v2;
    const std::vector<std::vector<double>> v10 = f103(v7, v0);
    const std::vector<double> v36 = v4[0];
    const std::vector<std::vector<double>> v18 = f103(v5, v0);
    const std::vector<std::vector<std::vector<double>>> v31 { v18, v18 };
    const std::vector<std::vector<double>> v15 = f103(v8, v10);
    std::vector<std::vector<std::vector<double>>> v92 = v31;
    v92[1] = v18;
    const std::vector<double> v14 = v18[0];
    std::vector<std::vector<std::vector<double>>> v26 = v92;
    const std::vector<std::vector<double>> v29 = f103(v8, v8);
    v8[0] = v2;
    const std::vector<std::vector<double>> v55 = f103(v8, v1);
    const std::vector<std::vector<double>> v35 = v26[0];
    v7[0] = v14;
    std::vector<std::vector<std::vector<double>>> v47 = v31;
    const std::vector<std::vector<double>> v60 = f103(v0, v7);
    v4[0] = v36;
    const std::vector<std::vector<double>> v50 = f103(v29, v35);
    v4[0] = v2;
    const std::vector<std::vector<double>> v65 = f103(v50, v60);
    const std::vector<std::vector<double>> v37 = f103(v50, v4);
    const std::vector<std::vector<double>> v84 = v47[0];
    v1 = v65;
    const std::vector<std::vector<std::vector<double>>> v54 { v55, v37, v84 };
    std::vector<std::vector<std::vector<double>>> v134 = v54;
    const std::vector<std::vector<double>> v155 = v134[2];
    v92[1] = v15;
    return v155;
  }
  std::vector<std::vector<double>> f96(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f103(v0, v0);
    const std::vector<std::vector<double>> v8 = f103(v0, v6);
    const std::vector<std::vector<double>> v1 = f103(v8, v6);
    const std::vector<std::vector<double>> v4 = f103(v8, v1);
    const std::vector<std::vector<double>> v28 = f97(v1);
    const std::vector<std::vector<double>> v12 = f103(v0, v1);
    const std::vector<std::vector<double>> v11 = f103(v12, v28);
    const std::vector<std::vector<double>> v30 = f103(v8, v4);
    const std::vector<std::vector<double>> v38 = f97(v12);
    const std::vector<std::vector<double>> v46 = f103(v8, v38);
    const std::vector<std::vector<double>> v27 = f103(v30, v46);
    const std::vector<std::vector<double>> v61 = f103(v6, v11);
    const std::vector<std::vector<double>> v48 = f103(v27, v61);
    return v48;
  }
  std::vector<std::vector<double>> f85(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f96(v0);
    const std::vector<std::vector<double>> v3 = f103(v6, v6);
    std::vector<std::vector<double>> v4 = v6;
    const std::vector<std::vector<std::vector<double>>> v2 { v0, v0, v4, v4, v4, v3, v3 };
    std::vector<std::vector<std::vector<double>>> v1 = v2;
    std::vector<std::vector<std::vector<double>>> v8 = v2;
    const std::vector<std::vector<double>> v17 = f96(v6);
    v1 = v8;
    std::vector<std::vector<std::vector<double>>> v11 = v1;
    const std::vector<std::vector<double>> v10 = v2[0];
    v4 = v10;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v20 { v8, v8, v11, v2, v11, v8 };
    std::vector<std::vector<std::vector<double>>> v33 = v11;
    std::vector<std::vector<std::vector<std::vector<double>>>> v42 = v20;
    std::vector<std::vector<std::vector<std::vector<double>>>> v28 = v20;
    v28[2] = v2;
    const std::vector<std::vector<std::vector<double>>> v32 = v42[5];
    std::vector<std::vector<std::vector<double>>> v49 = v33;
    v28[2] = v33;
    std::vector<std::vector<std::vector<std::vector<double>>>> v98 = v28;
    std::vector<std::vector<std::vector<double>>> v38 = v49;
    v42[1] = v38;
    v28 = v98;
    const std::vector<std::vector<std::vector<double>>> v53 = v98[3];
    const std::vector<std::vector<double>> v70 = v32[3];
    v28[4] = v8;
    v8[5] = v6;
    const std::vector<std::vector<double>> v104 = f103(v70, v17);
    v42[4] = v53;
    return v104;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<std::vector<double>> v7 = f85(v1);
    const std::vector<double> v10 = v7[0];
    const double v13 = v10[0];
    return v13;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 } });
    std::vector<std::vector<double>> v2({ { 2.0 }, { 3.0 }, { 4.0 } });
    double v3(5.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
