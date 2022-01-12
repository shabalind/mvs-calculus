  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f2(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v3 = v0;
    const std::vector<double> v6 = v0[2];
    v3[1] = v6;
    const std::vector<double> v2 = v3[0];
    v3[1] = v2;
    v3[1] = v6;
    v3 = v0;
    v3 = v0;
    v3[1] = v2;
    const double v4 = v2[0];
    const std::vector<double> v11 = v3[2];
    const double v9 = v11[0];
    std::vector<std::vector<double>> v15 = v3;
    std::vector<std::vector<double>> v13 = v15;
    const std::vector<double> v16 = v15[0];
    double v27 = v9;
    v13 = v3;
    v13[2] = v11;
    v13[0] = v16;
    const std::vector<double> v32 { v4 };
    const std::vector<double> v19 = v0[2];
    std::vector<double> v57 = v11;
    v15[2] = v57;
    v13 = v0;
    v15[2] = v32;
    const std::vector<double> v23 = v15[0];
    v57[0] = v27;
    v13[2] = v23;
    v13[0] = v19;
    return v13;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    std::vector<std::vector<double>> v7 = v0;
    const std::vector<double> v4 = v2[0];
    v7[2] = v4;
    const std::vector<double> v5 = v2[0];
    const double v22 = v5[0];
    const double v35 = v22 * v22;
    const std::vector<double> v29 = v0[0];
    const std::vector<std::vector<double>> v71 = f2(v7);
    v7[1] = v29;
    const std::vector<double> v30 = v71[0];
    const double v37 = v30[0];
    v7[1] = v29;
    const std::vector<double> v66 { v35, v35, v37, v37 };
    std::vector<double> v78 = v66;
    const double v91 = v78[1];
    return v91;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 }, { 5.0 } });
    std::vector<std::vector<double>> v2({ { 6.0 }, { 7.0 } });
    double v3(8.0);
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
