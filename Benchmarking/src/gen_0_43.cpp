  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f49(const double &v0) {
    double v4 = v0;
    const double v8 = v0 / v0;
    const double v3 = v8 + v0;
    v4 = v8;
    double v5 = v3;
    double v7 = v8;
    double v6 = v8;
    double v1 = v6;
    double v16 = v4;
    double v15 = v8;
    double v10 = v3;
    double v13 = v7;
    double v17 = v4;
    v5 = v0;
    double v18 = v0;
    double v28 = v4;
    double v11 = v1;
    const std::vector<double> v14 { v15, v10, v7, v7, v8, v15, v11 };
    double v24 = v18;
    std::vector<double> v21 = v14;
    v21[1] = v5;
    v21[2] = v10;
    std::vector<double> v20 = v14;
    std::vector<double> v12 = v20;
    v12[0] = v16;
    std::vector<double> v22 = v21;
    v21[1] = v1;
    std::vector<double> v29 = v14;
    const double v35 = v12[0];
    double v53 = v3;
    v20[3] = v17;
    std::vector<double> v44 = v22;
    const std::vector<std::vector<double>> v50 { v44, v14, v44 };
    std::vector<std::vector<double>> v48 = v50;
    v22[5] = v10;
    const std::vector<double> v30 = v50[0];
    const double v70 = v20[5];
    std::vector<std::vector<double>> v81 = v48;
    const std::vector<double> v46 = v81[0];
    v20[1] = v35;
    double v49 = v3;
    v81[1] = v46;
    v21 = v29;
    v29[3] = v53;
    v21[3] = v28;
    v44[2] = v49;
    double v72 = v24;
    const std::vector<double> v93 = v81[2];
    v13 = v72;
    v22[2] = v7;
    v44[2] = v13;
    const double v130 = v93[1];
    v21[1] = v70;
    v48[1] = v20;
    v44[5] = v6;
    v6 = v8;
    v12 = v30;
    return v130;
  }
  double f23(const double &v0) {
    double v5 = v0;
    const double v1 = f49(v5);
    double v10 = v1;
    const std::vector<double> v8 { v10 };
    const double v11 = f49(v0);
    const std::vector<std::vector<double>> v24 { v8, v8, v8, v8, v8, v8 };
    std::vector<std::vector<double>> v16 = v24;
    v16[3] = v8;
    v16[4] = v8;
    const std::vector<double> v28 = v24[1];
    const std::vector<double> v42 = v16[5];
    const double v180 = v42[0];
    v5 = v11;
    v16[1] = v28;
    return v180;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const double v5 = f23(v2);
    const double v18 = f23(v2);
    const double v14 = f49(v2);
    const double v17 = f49(v5);
    const double v67 = v17 * v17;
    const double v24 = v2 + v2;
    const double v25 = f23(v18);
    const std::vector<double> v57 { v5, v67, v14, v2, v25, v14 };
    const double v61 = v57[3];
    const double v38 = v24 * v61;
    return v38;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    std::vector<s0> v1({ { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } });
    double v2(15.0);
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
