  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f35(const double &v0) {
    double v7 = v0;
    double v6 = v0;
    const double v1 = v7 * v0;
    double v8 = v1;
    double v3 = v1;
    double v5 = v8;
    double v12 = v8;
    v8 = v12;
    double v13 = v3;
    double v9 = v5;
    double v14 = v12;
    double v29 = v5;
    double v21 = v12;
    double v27 = v8;
    double v15 = v6;
    double v45 = v13;
    double v39 = v0;
    double v32 = v3;
    const std::vector<double> v43 { v32, v8, v14, v45, v9, v14 };
    double v42 = v21;
    std::vector<double> v30 = v43;
    v30[5] = v6;
    const double v20 = v43[2];
    std::vector<double> v19 = v30;
    double v22 = v39;
    std::vector<double> v46 = v19;
    double v54 = v20;
    std::vector<double> v31 = v46;
    std::vector<double> v71 = v46;
    const double v66 = v31[0];
    v46[2] = v3;
    const std::vector<std::vector<double>> v38 { v30, v31, v71 };
    v3 = v27;
    const std::vector<double> v41 = v38[2];
    v19[5] = v42;
    std::vector<std::vector<double>> v26 = v38;
    v31[4] = v15;
    v46[0] = v14;
    v71[5] = v21;
    std::vector<std::vector<double>> v115 = v26;
    v26[2] = v30;
    std::vector<std::vector<double>> v85 = v26;
    std::vector<std::vector<double>> v124 = v115;
    double v90 = v45;
    v71[0] = v66;
    const std::vector<double> v80 = v26[0];
    v71 = v43;
    v85[2] = v80;
    const std::vector<std::vector<std::vector<double>>> v57 { v124, v26, v85, v85, v124, v85, v38 };
    double v169 = v22;
    v46[4] = v29;
    v26[1] = v30;
    v30[2] = v90;
    const std::vector<std::vector<double>> v123 = v57[0];
    v71[2] = v169;
    const std::vector<double> v107 = v123[1];
    v46[0] = v54;
    const double v93 = v41[0];
    v71[4] = v93;
    const double v105 = v107[5];
    return v105;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const std::vector<double> v9 { v2, v2, v2, v2 };
    const double v50 = v9[0];
    std::vector<double> v21 = v9;
    std::vector<double> v16 = v21;
    v21[3] = v50;
    const double v104 = v16[1];
    const double v102 = f35(v104);
    return v102;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    std::vector<std::vector<s0>> v1({ { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v2(24.0);
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
