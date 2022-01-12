  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f21(const std::vector<std::vector<double>> &v0) {
    return v0;
  }
  std::vector<std::vector<double>> f19(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v1 = v0[1];
    std::vector<std::vector<double>> v3 = v0;
    v3[0] = v1;
    const std::vector<double> v6 = v3[0];
    const std::vector<double> v8 = v3[0];
    const std::vector<std::vector<double>> v5 = f21(v0);
    const std::vector<std::vector<double>> v13 { v1, v8 };
    v3[1] = v6;
    const std::vector<std::vector<double>> v14 = f21(v5);
    v3[1] = v6;
    std::vector<std::vector<double>> v100 = v13;
    const std::vector<double> v60 = v14[0];
    v3[0] = v60;
    return v100;
  }
  std::vector<std::vector<double>> f18(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<std::vector<double>>> v7 { v1, v0, v1 };
    std::vector<std::vector<double>> v5 = v0;
    std::vector<std::vector<double>> v4 = v1;
    const std::vector<std::vector<double>> v3 = f19(v4);
    const std::vector<std::vector<std::vector<double>>> v6 { v3 };
    const std::vector<std::vector<double>> v2 = f21(v5);
    std::vector<std::vector<double>> v11 = v3;
    const std::vector<std::vector<double>> v15 = f21(v4);
    std::vector<std::vector<std::vector<double>>> v8 = v7;
    const std::vector<double> v9 = v0[0];
    std::vector<double> v24 = v9;
    v5[0] = v24;
    v8[0] = v11;
    const double v10 = v24[0];
    const std::vector<double> v23 = v15[0];
    v11[0] = v23;
    std::vector<double> v34 = v23;
    std::vector<std::vector<std::vector<double>>> v19 = v8;
    const double v41 = v10 + v10;
    v5[1] = v34;
    double v28 = v41;
    v8[1] = v2;
    const std::vector<std::vector<double>> v22 = f21(v2);
    v24[0] = v10;
    std::vector<std::vector<std::vector<double>>> v81 = v6;
    const std::vector<std::vector<double>> v50 = v81[0];
    const std::vector<double> v52 = v22[0];
    v4[1] = v23;
    const std::vector<double> v49 = v50[0];
    v4[0] = v9;
    v11[0] = v34;
    v24[0] = v28;
    std::vector<std::vector<std::vector<double>>> v76 = v19;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v101 { v76, v19, v76, v8, v76, v8, v7 };
    const std::vector<std::vector<std::vector<double>>> v75 = v101[5];
    v76[1] = v11;
    v81 = v6;
    v5[1] = v52;
    const std::vector<std::vector<double>> v149 = v75[0];
    v5[1] = v49;
    return v149;
  }
  std::vector<std::vector<double>> f16(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<double> v7 = v0[1];
    std::vector<std::vector<double>> v6 = v4;
    std::vector<std::vector<double>> v5 = v6;
    const std::vector<std::vector<double>> v1 = f18(v5, v5);
    v4[1] = v7;
    const std::vector<std::vector<double>> v2 = f19(v6);
    const std::vector<std::vector<double>> v13 = f19(v4);
    const std::vector<std::vector<double>> v22 = f19(v6);
    const std::vector<std::vector<double>> v35 = f18(v13, v2);
    v5[0] = v7;
    const std::vector<std::vector<double>> v41 = f21(v13);
    const std::vector<double> v34 = v41[1];
    const std::vector<std::vector<double>> v36 = f18(v22, v1);
    const std::vector<std::vector<double>> v30 = f19(v5);
    const std::vector<std::vector<double>> v19 = f19(v13);
    const std::vector<std::vector<std::vector<double>>> v32 { v35, v35, v19, v36, v6, v19, v5 };
    const std::vector<std::vector<double>> v37 = v32[4];
    std::vector<std::vector<std::vector<double>>> v92 = v32;
    v92[3] = v37;
    std::vector<std::vector<std::vector<double>>> v121 = v32;
    std::vector<std::vector<std::vector<double>>> v210 = v121;
    std::vector<std::vector<std::vector<double>>> v97 = v92;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v86 { v97, v92, v210, v97, v92, v210, v97 };
    v210[0] = v6;
    const std::vector<std::vector<std::vector<double>>> v131 = v86[1];
    const std::vector<std::vector<double>> v212 = v131[0];
    v6[0] = v34;
    v210[2] = v30;
    return v212;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<std::vector<double>> v6 = f16(v0);
    const std::vector<double> v5 = v0[0];
    double v4 = v1;
    const std::vector<double> v7 = v6[1];
    std::vector<double> v2 = v5;
    const double v10 = v5[0];
    const double v8 = v5[0];
    v2[0] = v8;
    v2[0] = v10;
    v2[0] = v10;
    std::vector<std::vector<double>> v21 = v0;
    const std::vector<std::vector<double>> v28 = f16(v21);
    v2 = v5;
    std::vector<std::vector<double>> v26 = v28;
    v2[0] = v4;
    v21[0] = v7;
    const std::vector<double> v56 = v26[1];
    const double v41 = v56[0];
    v26[1] = v2;
    std::vector<std::vector<double>> v114 = v28;
    v26 = v114;
    return v41;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    double v1(2.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
