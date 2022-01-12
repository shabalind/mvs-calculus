  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f83(const std::vector<double> &v0) {
    std::vector<double> v2 = v0;
    std::vector<double> v6 = v2;
    v2 = v0;
    std::vector<double> v1 = v0;
    std::vector<double> v4 = v0;
    std::vector<double> v7 = v2;
    std::vector<double> v3 = v4;
    std::vector<double> v8 = v3;
    v8 = v1;
    std::vector<double> v10 = v4;
    const double v14 = v4[0];
    double v5 = v14;
    const double v11 = v6[0];
    v8[0] = v5;
    std::vector<double> v12 = v4;
    const std::vector<std::vector<double>> v13 { v10, v7, v1, v6, v12, v1, v10 };
    v6[0] = v11;
    const double v17 = v11 * v14;
    v3[0] = v11;
    const std::vector<double> v16 = v13[0];
    double v18 = v5;
    v8 = v7;
    std::vector<std::vector<double>> v31 = v13;
    double v19 = v17;
    const double v23 = v6[0];
    const double v49 = v2[0];
    const std::vector<std::vector<double>> v39 { v2, v8 };
    std::vector<std::vector<double>> v27 = v31;
    const std::vector<double> v32 = v39[1];
    double v69 = v23;
    const std::vector<double> v25 = v39[0];
    std::vector<std::vector<double>> v30 = v27;
    const std::vector<double> v55 = v39[1];
    v12[0] = v18;
    std::vector<std::vector<double>> v48 = v30;
    const double v75 = v7[0];
    const std::vector<double> v41 = v30[4];
    const std::vector<double> v47 = v27[5];
    const double v157 = v25[0];
    const std::vector<std::vector<double>> v117 { v16, v32, v2 };
    std::vector<std::vector<double>> v43 = v117;
    v8[0] = v69;
    const double v93 = v75 + v19;
    double v62 = v11;
    std::vector<std::vector<double>> v94 = v43;
    v94[1] = v8;
    v2[0] = v49;
    v31[2] = v55;
    const std::vector<double> v72 = v94[0];
    double v81 = v62;
    std::vector<std::vector<double>> v73 = v94;
    v94[1] = v47;
    v3[0] = v157;
    const double v135 = v41[0];
    std::vector<std::vector<double>> v108 = v73;
    v31 = v48;
    double v109 = v93;
    v7[0] = v135;
    std::vector<std::vector<double>> v123 = v108;
    v1[0] = v109;
    const std::vector<double> v95 = v123[1];
    double v144 = v81;
    v12[0] = v144;
    v48[2] = v72;
    v1[0] = v5;
    v10[0] = v135;
    return v95;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const std::vector<double> v2 { v1 };
    std::vector<double> v5 = v2;
    const double v15 = v5[0];
    v5[0] = v1;
    v5[0] = v1;
    const std::vector<double> v16 = f83(v5);
    const double v27 = v16[0];
    const double v21 = v5[0];
    v5[0] = v27;
    v5[0] = v1;
    v5[0] = v15;
    double v34 = v15;
    v5[0] = v34;
    double v45 = v15;
    double v92 = v27;
    v5[0] = v45;
    const std::vector<double> v188 { v45, v21, v92, v34 };
    std::vector<double> v109 = v188;
    const double v95 = v109[1];
    return v95;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } } }, { { { 1.0 } } } }, { { { { 2.0 } } }, { { { 3.0 } } } } }, { { { { { 4.0 } } }, { { { 5.0 } } } }, { { { { 6.0 } } }, { { { 7.0 } } } } }, { { { { { 8.0 } } }, { { { 9.0 } } } }, { { { { 10.0 } } }, { { { 11.0 } } } } } });
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
