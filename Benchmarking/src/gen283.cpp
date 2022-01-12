  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f32(const std::vector<double> &v0) {
    const double v5 = v0[0];
    double v1 = v5;
    double v2 = v1;
    std::vector<double> v4 = v0;
    std::vector<double> v6 = v0;
    double v7 = v1;
    const double v8 = v2 + v7;
    v6[0] = v5;
    std::vector<double> v11 = v0;
    std::vector<double> v12 = v6;
    v12[0] = v7;
    v4[0] = v8;
    double v14 = v8;
    std::vector<double> v13 = v4;
    std::vector<double> v18 = v12;
    const double v19 = v11[0];
    const double v49 = v4[0];
    const double v16 = v6[0];
    const double v38 = v13[0];
    const double v25 = v18[0];
    double v53 = v14;
    const std::vector<std::vector<double>> v20 { v12 };
    const std::vector<double> v29 = v20[0];
    const std::vector<double> v31 = v20[0];
    std::vector<std::vector<double>> v30 = v20;
    std::vector<double> v60 = v18;
    std::vector<std::vector<double>> v44 = v30;
    std::vector<std::vector<double>> v34 = v44;
    v18[0] = v38;
    std::vector<std::vector<double>> v58 = v30;
    v2 = v19;
    std::vector<std::vector<double>> v28 = v58;
    v60[0] = v49;
    v30[0] = v4;
    const std::vector<double> v50 = v28[0];
    const std::vector<double> v43 = v44[0];
    v11[0] = v25;
    const std::vector<double> v46 = v34[0];
    std::vector<std::vector<double>> v68 = v34;
    std::vector<double> v77 = v50;
    v34[0] = v77;
    const std::vector<double> v103 = v68[0];
    v34[0] = v46;
    v6[0] = v2;
    v60[0] = v49;
    const std::vector<double> v112 = v58[0];
    const double v136 = v103[0];
    const double v41 = v112[0];
    v58[0] = v46;
    const double v96 = v60[0];
    v18[0] = v96;
    v12[0] = v41;
    const std::vector<std::vector<double>> v100 { v46, v12, v31, v6, v29, v11 };
    std::vector<std::vector<double>> v80 = v100;
    v30[0] = v29;
    v80[1] = v43;
    v80[4] = v13;
    const std::vector<double> v94 = v80[0];
    v12[0] = v16;
    v18[0] = v5;
    v53 = v136;
    std::vector<double> v79 = v46;
    v4[0] = v53;
    v79 = v94;
    return v79;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<double> v3 { v1, v1, v1, v1, v1 };
    const s0 v5 = v0[1];
    const std::vector<std::vector<double>> v7 = v5.p0;
    const std::vector<double> v2 = v7[0];
    std::vector<double> v8 = v2;
    const double v21 = v2[0];
    double v11 = v21;
    std::vector<double> v10 = v8;
    double v13 = v11;
    v10[0] = v11;
    const double v17 = v3[1];
    const std::vector<double> v28 = f32(v10);
    v8[0] = v17;
    v8[0] = v11;
    double v58 = v1;
    const double v40 = v13 + v58;
    v8[0] = v40;
    const std::vector<double> v62 = f32(v28);
    const double v55 = v62[0];
    v8 = v28;
    return v55;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
